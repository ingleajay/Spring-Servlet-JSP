package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get cookie
		PrintWriter out = response.getWriter(); 
		Cookie cookie[] = request.getCookies();
		
		for(int i=0; i<cookie.length ; i++) {
			out.print("Student Data : " + cookie[i].getValue() + " \n");
		}
	}
}
