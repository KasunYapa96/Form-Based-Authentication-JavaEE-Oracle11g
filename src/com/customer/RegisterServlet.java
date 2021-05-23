package com.customer;

import java.io.IOException;
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
		
		Customer c=new Customer(name, email, phone, uname, pass);
		dao.insertDetails(c);
		
		response.sendRedirect("login.jsp");  
		
	}

	
	
	
}
