package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hidden1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// use code.html
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("username");  
        out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
        out.print("<form action='hd2'>");  
        out.print("<input type='hidden' name='code' value='"+n+2021+"'>");  
        out.print("<input type='submit' value='Next'>");  
        out.print("</form>");  
        out.close();  
	}

}
