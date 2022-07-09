package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Fvalidate
 */
public class Fvalidate extends HttpFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(req.getParameter("rollno"));
		String name = req.getParameter("studname");
		if(id<1) {
			PrintWriter out = response.getWriter();
			RequestDispatcher reqDispatch = request.getRequestDispatcher("/FReg.jsp");
			reqDispatch.include(request,response);
			out.println("<b><div class='text-center' style='color:red;'>Id can't be less than 1</div></b>");
		}
		else if((name.length()<=4)){
			PrintWriter out = response.getWriter();
			RequestDispatcher reqDispatch = request.getRequestDispatcher("/FReg.jsp");
			reqDispatch.include(request,response);
			out.println("<b><div class='text-center' style='color:red;'>name can't less than 4</div></b>");
		}
		else {
			  chain.doFilter(request, response);
		}
	}



	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
