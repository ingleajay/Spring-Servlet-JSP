package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// pre handler - before request go to view
		int zip = Integer.parseInt(request.getParameter("zip"));
		int digit = String.valueOf(zip).length();
		System.out.println("Pre handler " + digit);
		if( digit > 6 && digit < 6) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid zip code !!");
			return false;
		}
		return true;
	}
	
	// post handler - after request go to view
			@Override
			public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
					ModelAndView modelAndView) throws Exception {
				System.out.println("Post handling.....");
				modelAndView.addObject("suc", "Success");
				modelAndView.setViewName("success2");
			}
			
			
    // after completion view 
			@Override
			public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
					throws Exception {
				System.out.println("After view shown to us ");
			}
}
