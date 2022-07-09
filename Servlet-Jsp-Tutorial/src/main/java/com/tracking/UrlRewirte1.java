package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewirte1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// predicate age html
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("username");  
        String d=request.getParameter("dob"); 
        out.println("Welcome "+n);  
        out.print("DOB -  "+d);
        //appending the username and dob in the query string  
        out.print("<br><a href='url2?uname="+n+"&dob="+d+"'>Predict Age </a>");  
	}
}
