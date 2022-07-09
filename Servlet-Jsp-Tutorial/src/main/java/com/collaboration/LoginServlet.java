package com.collaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();  
		String n=request.getParameter("username");  
	    String p=request.getParameter("pass");  
	    if(p.equals("1234")){  
	        RequestDispatcher rd=request.getRequestDispatcher("/welcome");  
	        rd.forward(request, response);  
	    }  
	    else{  
	    	response.setContentType("text/html");
	    	out.print("<h4 class='text-center' style='color:red;' >");
	        out.print("Sorry UserName or Password Error!");  
	        out.print("</h4>");
	        RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	        rd.include(request, response);                
	   }  
	}
}
