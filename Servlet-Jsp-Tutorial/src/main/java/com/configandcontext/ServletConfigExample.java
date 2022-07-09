package com.configandcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// servelt config
		// if you have multiple servlet and if you want set different values to each servlet by web.xml then used servlet config
		// Adv : you need not to change or edit your servlet the modification is done by web.xml only
		
		PrintWriter out = response.getWriter();
		ServletConfig s = getServletConfig();
		String name = s.getInitParameter("name");
		out.println("Hello " + name);
	}

}
