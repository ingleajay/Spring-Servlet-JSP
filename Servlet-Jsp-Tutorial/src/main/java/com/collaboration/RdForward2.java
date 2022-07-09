package com.collaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RdForward2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Cube of number : 
		
		int c = (Integer) request.getAttribute("cube");
	    double cube = Math.pow(c, 3);
	    PrintWriter out = response.getWriter();
	    out.println("Cube : " + cube);
	}
}
