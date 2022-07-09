package com.jspuse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class AddJsp extends HttpServlet {
	
	// No use of this servlet -> because jsp convert into servlet itself
	
	// add.html -> go to add.jsp -> run

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int a = Integer.parseInt(req.getParameter("no1"));
		int b = Integer.parseInt(req.getParameter("no2"));	
		int add = a+b;
		
		// 2. show response on web browser
		PrintWriter out = resp.getWriter(); 
		out.println("Addition : " + add);
	}
}
