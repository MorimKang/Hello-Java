package com.jpn.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpn.biz.EmpBiz;
import com.jpn.entity.EmpEntity;

@WebServlet(name = "List", urlPatterns = { "/list" })
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpBiz biz=new EmpBiz();
		
		ArrayList<EmpEntity> list=biz.listEmp(); 
		if(list != null) {
			//System.out.println("ok");
			
			/*request ��ü*/
			RequestDispatcher rd=request.getRequestDispatcher("emptest/empList.jsp");//�����
			request.setAttribute("emp", list); //������Ʈ��: emp
		    rd.forward(request,response); //empList.jsp���� ���� ����
		}
		
	}

}
