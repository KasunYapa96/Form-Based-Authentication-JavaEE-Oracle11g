package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String username=request.getParameter("uid");
	String password= request.getParameter("pass");

	CustomerDAO dao=new CustomerDAO();
	
	try {
		Customer cusDetails=null;
		cusDetails= dao.validate(username,password);
		System.out.println("hiiiii");
		System.out.println(username+password);
		System.out.println(cusDetails.getName());

		
		if(cusDetails != null){
			
			 HttpSession session = request.getSession();
			 session.setAttribute("user", cusDetails);
			 
			 RequestDispatcher dis= request.getRequestDispatcher("useraccount.jsp");
				dis.forward(request, response);
			
		}
		else {
			response.sendRedirect("login.jsp");
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	
	

	
	}

}