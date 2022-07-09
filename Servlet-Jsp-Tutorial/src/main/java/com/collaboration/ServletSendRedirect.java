package com.collaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSendRedirect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// The sendRedirect() method works at client side.
		// It always sends a new request.
		response.setContentType("text/html");  
		 
		response.sendRedirect("http://www.google.com");  
	}
}
