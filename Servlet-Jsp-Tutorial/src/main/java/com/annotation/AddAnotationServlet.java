package com.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add1")
public class AddAnotationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("no1"));
		int b = Integer.parseInt(request.getParameter("no2"));	
		int add = a+b;
		
		// 2. show response on web browser
		PrintWriter out = response.getWriter(); 
		out.println("Addition : " + add);
	}
}
