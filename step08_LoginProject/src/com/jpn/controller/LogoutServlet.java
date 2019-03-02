package com.jpn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jpn.entity.LoginEntity;

@WebServlet(name = "Logout", urlPatterns = { "/logout" })
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(); 
		LoginEntity entity=(LoginEntity)session.getAttribute("logOK");
		
		if(entity != null) {
			session.removeAttribute("logOK"); //또는 session.invalidate(); 모든세션종료
			response.sendRedirect("/log/index.jsp");
		}
			
		
	}

}
