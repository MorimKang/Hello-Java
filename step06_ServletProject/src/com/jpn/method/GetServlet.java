package com.jpn.method;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GET", urlPatterns = { "/get.do" })
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.�ѱ�ó��
		response.setContentType("text/html;charset=UTF-8");
		
		//2.������ �޾ƿ���
		String name=request.getParameter("irum");
		String pass=request.getParameter("amho");
		
		
		//3.���
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		
		response.getWriter().append("�̸�: "+name+"<br>");
		response.getWriter().append("��ȣ: "+pass+"<br>");
		
		response.getWriter().append("<a href='/edu/getTest.html'>��������</a>");
		response.getWriter().append("</body></html>");
	}

}
