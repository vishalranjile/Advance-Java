package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.demo.model.Student;
import com.demo.service.Studentservice;
import com.demo.service.Studentserviceimpl;


	@WebServlet("/student")
	public class DisplayStud extends HttpServlet {
		private static final long serialVersionUID = 1L;

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Studentservice sservice=new Studentserviceimpl();
		List<Student> slist=sservice.findallStudent();
		request.setAttribute("list", slist);
		RequestDispatcher rd=request.getRequestDispatcher("displaystu.jsp");
		rd.forward(request, response);
		
		}

	
}
