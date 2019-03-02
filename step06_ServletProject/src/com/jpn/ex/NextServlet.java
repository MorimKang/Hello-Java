package com.jpn.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(name = "Next", urlPatterns = { "/next.do" })
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글처리
		response.setContentType("text/html;charset=UTF-8");
			
		//2.출력
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		response.getWriter().append("넥스트 서블릿<br>");
		response.getWriter().append("<a href='hello.do'>이전으로</a>");
		response.getWriter().append("</body></html>");
	}

}
