package com.configandcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample1 extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		PrintWriter out = response.getWriter();
		ServletContext s = getServletContext();
		String s1 = s.getInitParameter("status");
		out.println("status : " + s1);
	}
}