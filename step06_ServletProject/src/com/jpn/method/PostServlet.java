package com.jpn.method;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "POST", urlPatterns = { "/post.do" })
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//1.�ѱ�ó��
				response.setContentType("text/html;charset=UTF-8"); //���뿡 html���Ÿ� �ʿ���.
				request.setCharacterEncoding("UTF-8"); //POST����� �ѱ�ó�� �ʿ���.
				
				//2.������ �޾ƿ���
				String name=request.getParameter("name");
				int score=Integer.parseInt(request.getParameter("score"));
				String result=null;
				
				if(score >= 60) 
					result = "�հ�";
				else 
					result = "���հ�";
				
				
				//3.���
				response.getWriter().append("<html><head><title></title></head>");
				response.getWriter().append("<body>");
				
				response.getWriter().append("�̸�: "+name+"<br>");
				response.getWriter().append("����: "+score+"��<br>");
				response.getWriter().append("���: "+result+"<br>");
				
				response.getWriter().append("<a href='/edu/postTest.html'>��������</a>");
				response.getWriter().append("</body></html>");
	}

}
