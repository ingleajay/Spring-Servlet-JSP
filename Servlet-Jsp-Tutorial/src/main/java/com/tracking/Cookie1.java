package com.tracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// use student.html
		String n=request.getParameter("name");  
	    String d=request.getParameter("div");
	    Cookie cookie = (Cookie) new Cookie("stud", n);
	    Cookie cookie1 = (Cookie) new Cookie("div", d);
	    // add cookie in response
	    response.addCookie(cookie);
	    response.addCookie(cookie1);
	    response.sendRedirect("ck2");
	    
	}
}
