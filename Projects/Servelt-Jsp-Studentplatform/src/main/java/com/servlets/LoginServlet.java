package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Search;
import com.model.Student;
import com.operations.ServicesImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			ArrayList<Student> res = new ServicesImpl().getstudent();
			
 			HttpSession session = req.getSession(true);
			for(int i=0;i<res.size();i++) {
	
              if (res.get(i).getSemail().equals(email) && res.get(i).getPassword().equals(pass)) {
					Student s = res.get(i);
		 			session.setAttribute("login",s);
		 			session.setAttribute("", resp);
		 			
		 			RequestDispatcher rd=req.getRequestDispatcher("dashboard.jsp");  
			        rd.forward(req, resp);
				}
              
              
			}
			session.setAttribute("logmsg","incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");  
	        rd.forward(req, resp);
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
