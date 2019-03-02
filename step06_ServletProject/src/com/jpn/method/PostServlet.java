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
				//1.한글처리
				response.setContentType("text/html;charset=UTF-8"); //내용에 html쓸거면 필요한.
				request.setCharacterEncoding("UTF-8"); //POST방식은 한글처리 필요함.
				
				//2.데이터 받아오기
				String name=request.getParameter("name");
				int score=Integer.parseInt(request.getParameter("score"));
				String result=null;
				
				if(score >= 60) 
					result = "합격";
				else 
					result = "불합격";
				
				
				//3.출력
				response.getWriter().append("<html><head><title></title></head>");
				response.getWriter().append("<body>");
				
				response.getWriter().append("이름: "+name+"<br>");
				response.getWriter().append("점수: "+score+"점<br>");
				response.getWriter().append("결과: "+result+"<br>");
				
				response.getWriter().append("<a href='/edu/postTest.html'>다음으로</a>");
				response.getWriter().append("</body></html>");
	}

}
