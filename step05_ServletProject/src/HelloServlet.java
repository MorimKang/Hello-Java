

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.�ѱ�ó��
		response.setContentType("text/html;charset=UTF-8");
		
		//2.���
		response.getWriter().append("<html><head><title></title></head>");
		response.getWriter().append("<body>");
		response.getWriter().append("��ο� ����<br>");
		response.getWriter().append("<a href='next.do'>��������</a>");
		response.getWriter().append("</body></html>");
	}
}
