package com.collaboration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RdForward extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    // Multiplication - use index.jsp
		int a = Integer.parseInt(request.getParameter("no1"));
		int b = Integer.parseInt(request.getParameter("no2"));	
		int mul = a*b;
		
		request.setAttribute("cube",mul);
		RequestDispatcher rd=request.getRequestDispatcher("/rd2");  
        rd.forward(request, response);  
	}
}
