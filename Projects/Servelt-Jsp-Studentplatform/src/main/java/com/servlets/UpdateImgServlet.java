package com.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

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

@WebServlet("/uimg")
@MultipartConfig(maxFileSize = 16177215)
public class UpdateImgServlet extends HttpServlet {
	private static final int BUFFER_SIZE = 4096;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		int id = Integer.parseInt(req.getParameter("id"));
		InputStream inputStream = null;
		Part filePart = req.getPart("img");
		inputStream = filePart.getInputStream();
		String imgname = filePart.getSubmittedFileName();
		Student s = new Student();
		s.setSid(id);
		s.setSimg(imgname);
		boolean res = new ServicesImpl().updateimg(s);
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
			session.setAttribute("eimg", "uimg");
			resp.sendRedirect("login.jsp");
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
