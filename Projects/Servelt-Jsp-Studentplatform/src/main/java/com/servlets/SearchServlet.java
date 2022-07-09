package com.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Search;
import com.model.Student;
import com.operations.ServicesImpl;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Random r = new Random();
			int seid = r.nextInt(10000);
			int id = Integer.parseInt(req.getParameter("sid"));
			String keyword = req.getParameter("keyword");
			String engine = req.getParameter("engine");
			Search s = new Search(seid, keyword, engine, id);
			boolean res = new ServicesImpl().histroysearch(s);
			
			String query1 = "https://www.google.com/search?q=";
			String query2 = "https://www.bing.com/search?q=";
			String query3 = "https://www.youtube.com/results?search_query=";
			HttpSession session = req.getSession(true);
			if(res == true) {
				if(engine.equals("google")) {
					resp.sendRedirect(query1+keyword);
				}
				else if(engine.equals("bing")) {
					resp.sendRedirect(query2+keyword);
				}
				else if(engine.equals("youtube")) {
					resp.sendRedirect(query3+keyword);
				}
				
				
				resp.sendRedirect("dashboard.jsp");
			}
			
		} catch (Exception e) {
			
		}
	}
}
