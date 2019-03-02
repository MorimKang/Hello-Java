package com.jpn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpn.biz.EmpBiz;
import com.jpn.entity.EmpEntity;

@WebServlet(name = "Insert", urlPatterns = { "/insert" })
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");		
		
		EmpEntity entity=new EmpEntity();
		entity.setEname(request.getParameter("ename"));
		entity.setPhone(request.getParameter("phone"));
		entity.setDept(request.getParameter("dept"));
		
		EmpBiz biz=new EmpBiz();
		int n=biz.insertEmp(entity);
		
		if(n > 0) {
			response.sendRedirect("/log/list");
		}else {
			System.out.println("fail");
		}
	}
}
