package com.collaboration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RdInculde2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Division 
		int a = Integer.parseInt(request.getParameter("no1"));
		int b = Integer.parseInt(request.getParameter("no2"));	
		int div = a/b;
		PrintWriter out = response.getWriter();
		out.println("Division : " + div);        
	}
}
