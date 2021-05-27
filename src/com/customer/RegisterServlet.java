package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet") 
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		
		CustomerDAO dao=new CustomerDAO();
		PrintWriter out=response.getWriter();
		
		Customer c=new Customer(name, email, phone, uname, pass);
		boolean r=dao.insertDetails(c);
		
		if(r==true) {
			out.println("User added succesfully!!!! Login here.....");
			RequestDispatcher dis= request.getRequestDispatcher("login.jsp");
			dis.include(request, response);
		}else {
			out.println("There was a problem please try to Create your account again......>>>>");
			RequestDispatcher dis= request.getRequestDispatcher("login.jsp");
			dis.include(request, response);
		}
		
		
	
		
	}

	
	
	
}
