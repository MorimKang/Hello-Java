package com.jpn.method;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DB", urlPatterns = { "/db.do" })
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.�ѱ�ó��
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); //POST����� �ѱ�ó�� �ʿ���.
		
		//2.������ �޾ƿ���
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String addr=request.getParameter("addr");
		
		
		//3.���
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		response.getWriter().append("���� �̸��� "+name+"�̸� ����ó�� <br>"+phone+"�̰� "+addr+"�� ��ϴ�.");
		
		//4.JDBC ����
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //(1)����̹� �ε�
			conn=DriverManager.getConnection( 				  //(2)���ᰴü����
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"edu", 
					"1234");
			System.out.println("���Ӽ���-------------------!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//---------------------------------------------------------------------
		Statement stmt=null;
		int n =0;
		
		try {
			String sql="insert into users(name,phone,addr) values('"
					+name + "','"
					+ phone +"','"
					+ addr + "')";
			System.out.println("sql����:"+ sql);
			
			stmt = conn.createStatement();
			n=stmt.executeUpdate(sql);
			
			if(n > 0) {
				conn.commit();
				response.getWriter().append("<br>���强��");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>�������");
			}catch (SQLException e1) {}
		}finally {
			try {
				if(stmt!=null) stmt.close(); //(5)���ᰴü ����
			}catch (SQLException e1) {}
		}
		
		
		
	/*	PreparedStatement pstmt=null; // (3) SQL���� ����
		int n = 0;
		
		try {
			String sql="INSERT INTO USERS(NAME,PHONE,ADDR) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql); //conn�� pstmt�� ����
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			n = pstmt.executeUpdate(); //(4)��� ��ȯ
			
			if(n>0) {
				conn.commit();
				response.getWriter().append("<br>���强��");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>�������");
			}catch (SQLException e1) {}
		}finally {
			try {
				if(pstmt!=null)pstmt.close(); //(5)���ᰴü ����
			}catch (SQLException e1) {}
		}
		
		
*/
		//---------------------------------------------------------------------
		PreparedStatement pstmt2=null;
		ResultSet rs=null;
		
		try {
			pstmt2=conn.prepareStatement("SELECT * FROM USERS ORDER BY NAME DESC");
			rs=pstmt2.executeQuery();
			
			response.getWriter().append("<table border='1'>");
			while(rs.next()) {
				response.getWriter().append("<tr>"); //rs.getString("�÷���") �Ǵ� rs.getString(����)
				response.getWriter().append("<td>"+rs.getString("NAME")+"</td>"); //rs.getString(1);
				response.getWriter().append("<td>"+rs.getString("PHONE")+"</td>");
				response.getWriter().append("<td>"+rs.getString("ADDR")+"</td>");
				response.getWriter().append("</tr>");
			}
			response.getWriter().append("</table>");
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null) rs.close();
				if(pstmt2!=null) pstmt2.close();
				if(conn!=null) conn.close();
			}catch (SQLException e1) {}
		}
		
		
		
		//---------------------------------------------------------------------
		response.getWriter().append("<a href='/edu/dbTest.html'>����ȭ��</a>");
		response.getWriter().append("</body></html>");
	}

}
