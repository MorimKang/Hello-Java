package com.jpn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jpn.biz.LoginBiz;
import com.jpn.entity.LoginEntity;

@WebServlet(name = "Login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		String spwd=request.getParameter("pwd");
	//	System.out.println(sid+"  "+spwd);
		
		LoginBiz biz=new LoginBiz();
		LoginEntity entity=biz.getLoginUser(sid,spwd);
		
		if(entity != null) {
			/* ���� ���� */
			HttpSession session=request.getSession(); //��Ʈ�� ����Ʈ O �ϸ� �ʿ���� ����Ʈ �������� �ʿ��ѰŸ� ��
			session.setAttribute("logOK",entity); //���� �̸�: logOK
			
			response.sendRedirect("/log/logtest/loginOK.jsp");
		}else {
			response.sendRedirect("/log/logtest/loginFail.jsp");
		}
	}
	

}
