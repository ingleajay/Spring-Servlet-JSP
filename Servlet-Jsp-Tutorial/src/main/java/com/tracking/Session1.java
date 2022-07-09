package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//reg html
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("name"); 
        String c = request.getParameter("course");
        out.print("Welcome - "+ n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
        session.setAttribute("course",c);
  
        out.println("<br><a href='s2'>Next</a>");
	}
}
