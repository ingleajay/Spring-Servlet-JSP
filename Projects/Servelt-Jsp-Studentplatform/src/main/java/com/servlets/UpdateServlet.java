package com.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.model.Student;
import com.operations.ServicesImpl;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		int id = Integer.parseInt(req.getParameter("sid"));
		System.out.println("id" + id);
		String name = req.getParameter("fname");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String branch = req.getParameter("branch");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String zip = req.getParameter("zip");
		String pass = req.getParameter("pass");
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String date1 = formatter.format(date);
		
		
		
		Student s = new Student(id,name, city, zip, email, country, branch, phone, pass);
		boolean res = new ServicesImpl().updatestudent(s);
		if (res == true) {
			
			HttpSession session = req.getSession(true);
			session.setAttribute("edit", "update");
			resp.sendRedirect("login.jsp");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
