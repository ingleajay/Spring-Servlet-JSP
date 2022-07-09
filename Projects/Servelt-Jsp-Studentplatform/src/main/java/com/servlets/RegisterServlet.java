package com.servlets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
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

@WebServlet("/reg")
@MultipartConfig(maxFileSize = 16177215)
public class RegisterServlet extends HttpServlet {
	private static final int BUFFER_SIZE = 4096;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			long phone = Long.parseLong(req.getParameter("phone"));
			String branch = req.getParameter("branch");
			String city = req.getParameter("city");
			String country = req.getParameter("country");
			String zip = req.getParameter("zip");

			String pass = req.getParameter("pass");
			Random r = new Random();
			int id = r.nextInt(10000);

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String date1 = formatter.format(date);
			
			InputStream inputStream = null;
			Part filePart = req.getPart("img");
			inputStream = filePart.getInputStream();
			String imgname = filePart.getSubmittedFileName();
			
			Student s = new Student(id, name, city, zip, email, country, branch, phone, imgname, pass);
			
			boolean res = new ServicesImpl().savestudent(s);
			if (res == true) {
				// saving in folder
				String path = req.getRealPath("/") + "pics" + File.separator + filePart.getSubmittedFileName();
				System.out.println(path);
				OutputStream f = new FileOutputStream(path);
				int bytesRead = -1;
				byte[] buffer = new byte[BUFFER_SIZE];
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					f.write(buffer, 0, bytesRead);
				}
				inputStream.close();
				f.close();
				
				HttpSession session = req.getSession(true);
				session.setAttribute("success", res);
				resp.sendRedirect("login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
