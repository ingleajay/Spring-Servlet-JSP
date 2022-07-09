package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletNeed extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// JSP need - if you write all html tags in servlet out.pritnln() then its so bad
		
		// 1. set content type
		response.setContentType("text/html");
		
		//2. send response to browser
		// jsp need
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("I am ajay from codeouter");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
