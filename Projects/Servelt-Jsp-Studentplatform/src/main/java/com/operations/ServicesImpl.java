package com.operations;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Search;
import com.model.Student;

public class ServicesImpl implements Services{

	public boolean savestudent(Student s) throws SQLException {
		int i = ServicesDao.savedao(s);
		if(i==1) 
			return true;
		return false;
	}

	public ArrayList<Student> getstudent() throws SQLException {
		ResultSet res = ServicesDao.getdao();
		ArrayList<Student> a = new ArrayList<Student>();
		while(res.next()) {
			int id = res.getInt("sid");
			String email = res.getString("semail");
			String profile = res.getString("password");
			String name = res.getString("sname");
			String city = res.getString("scity");
			String zip = res.getString("szip");
			String country = res.getString("scountry");
			String branch = res.getString("sbranch");
			String pass = res.getString("password");
			long phone = Long.parseLong(res.getString("sphone"));
            String img = res.getString("simg");
            Student s = new Student(id, name, city, zip, email, country, branch, phone, img, pass);
            a.add(s);
		}
		return a;
	}

	public boolean updatestudent(Student s) throws SQLException {
		int i = ServicesDao.updatedoa(s);
		if(i==1) 
			return true;
		return false;
	}

	public boolean updateimg(Student s) throws SQLException {
		int i = ServicesDao.updateimgdoa(s);
		if(i==1) 
			return true;
		return false;
	}

	public boolean histroysearch(Search s) throws SQLException {
		int i = ServicesDao.savehistroy(s);
		if(i==1) 
			return true;
		return false;
	}

	public ArrayList<Search> getsearch() throws SQLException {
		ResultSet res = ServicesDao.getsearchdao();
		ArrayList<Search> a = new ArrayList<Search>();
		while(res.next()) {
			int seid = res.getInt("seid");
			String sename = res.getString("sename");
			String segine = res.getString("sengine");
			int sid = res.getInt("sid");
			Search s = new Search(seid, sename, segine, sid);
			a.add(s);
		}
		return a;
	}

	public boolean deletehistroy(int search_id) throws SQLException {
		int i = ServicesDao.deletehistroy(search_id);
		if(i==1) 
			return true;
		return false;
	}

}
