package com.collaboration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RdInclude1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/rd4");

		//Using RequestDispatcher include() method to include the content of another Servlet in this Servlet.
		reqDispatch.include(request,response);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<b>Servlet 2 response include in servelt 1 response</b>");
	}
}
