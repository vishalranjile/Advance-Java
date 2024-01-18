package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.model.Student;
import com.demo.service.Studentservice;
import com.demo.service.Studentserviceimpl;

/**
 * Servlet implementation class DisplayStudents
 */
public class DisplayStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Studentservice sservice=new Studentserviceimpl();
			List<Student> slist=sservice.findallStudent();
			request.setAttribute("list", slist);
			RequestDispatcher rd=request.getRequestDispatcher("displaystu.jsp");
			rd.forward(request, response);
				}

}
