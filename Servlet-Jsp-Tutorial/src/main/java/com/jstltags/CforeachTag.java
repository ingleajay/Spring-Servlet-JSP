package com.jstltags;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cforeach")
public class CforeachTag extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Student> stu= Arrays.asList(
				new Student(0,"Ajay"),
				new Student(1,"Vijay"),
				new Student(2,"Code")
		);
		req.setAttribute("stu",stu);
		RequestDispatcher rd=req.getRequestDispatcher("/tagcforeach.jsp");  
        rd.forward(req, resp); 
	}
}
