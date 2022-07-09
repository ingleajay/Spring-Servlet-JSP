package com.addproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDoget extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		        // 1.Write logic
				int a = Integer.parseInt(request.getParameter("no1"));
				int b = Integer.parseInt(request.getParameter("no2"));	
				int add = a+b;
				
				// 2. show response on web browser
				PrintWriter out = response.getWriter(); 
				out.println("Get Addition : " + add);
	}
}
