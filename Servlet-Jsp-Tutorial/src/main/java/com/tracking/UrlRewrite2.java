package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewrite2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //getting value from the query string  
        String n=request.getParameter("uname");
        String dob=request.getParameter("dob");

        // logic for predict
        LocalDate l = LocalDate.parse(dob);
        LocalDate curDate = LocalDate.now();
        int i = Period.between(l, curDate).getYears();
        out.print("Hello "+ n );
        out.print("<br> Age  : " + i);
	}

}
