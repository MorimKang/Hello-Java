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
		//1.한글처리
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); //POST방식은 한글처리 필요함.
		
		//2.데이터 받아오기
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String addr=request.getParameter("addr");
		
		
		//3.출력
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		response.getWriter().append("나의 이름은 "+name+"이며 연락처는 <br>"+phone+"이고 "+addr+"에 삽니다.");
		
		//4.JDBC 연동
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //(1)드라이버 로드
			conn=DriverManager.getConnection( 				  //(2)연결객체생성
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"edu", 
					"1234");
			System.out.println("접속성공-------------------!");
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
			System.out.println("sql구문:"+ sql);
			
			stmt = conn.createStatement();
			n=stmt.executeUpdate(sql);
			
			if(n > 0) {
				conn.commit();
				response.getWriter().append("<br>저장성공");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>저장실패");
			}catch (SQLException e1) {}
		}finally {
			try {
				if(stmt!=null) stmt.close(); //(5)연결객체 종료
			}catch (SQLException e1) {}
		}
		
		
		
	/*	PreparedStatement pstmt=null; // (3) SQL구문 실행
		int n = 0;
		
		try {
			String sql="INSERT INTO USERS(NAME,PHONE,ADDR) VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql); //conn과 pstmt를 연결
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			n = pstmt.executeUpdate(); //(4)결과 반환
			
			if(n>0) {
				conn.commit();
				response.getWriter().append("<br>저장성공");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				response.getWriter().append("<br>저장실패");
			}catch (SQLException e1) {}
		}finally {
			try {
				if(pstmt!=null)pstmt.close(); //(5)연결객체 종료
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
				response.getWriter().append("<tr>"); //rs.getString("컬럼명") 또는 rs.getString(순번)
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
		response.getWriter().append("<a href='/edu/dbTest.html'>이전화면</a>");
		response.getWriter().append("</body></html>");
	}

}
