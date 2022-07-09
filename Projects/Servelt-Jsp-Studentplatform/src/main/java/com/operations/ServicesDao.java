package com.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.Conn;
import com.model.Search;
import com.model.Student;


public class ServicesDao {
	
	static Connection conn = Conn.createConn();

	public static int savedao(Student s) throws SQLException {
		String q = "insert into searchapp(sid,sname,scity,szip,semail, scountry, sbranch, sphone, simg, password) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(q);
        pstmt.setInt(1,s.getSid());
        pstmt.setString(2,s.getSname());
        pstmt.setString(3,s.getScity());
        pstmt.setString(4,s.getSzip());
        pstmt.setString(5,s.getSemail());
        pstmt.setString(6,s.getScountry());
        pstmt.setString(7,s.getSbranch());
        pstmt.setLong(8,s.getSphone());
        pstmt.setString(9, s.getSimg());
        pstmt.setString(10,s.getPassword());
        int i = pstmt.executeUpdate();
        return i;
	}

	public static ResultSet getdao() throws SQLException {
		Statement stmt=conn.createStatement(); 
		String q = "select * from searchapp";
		ResultSet set = stmt.executeQuery(q);
		return set;
	}

	public static int updatedoa(Student s) throws SQLException {
      String q = "update searchapp set sname=? ,scity=?,szip=?,semail=?, scountry=?, sbranch=?, sphone=?, password=? where sid=? ";
      PreparedStatement pstmt = conn.prepareStatement(q);
     
      pstmt.setString(1,s.getSname());
      pstmt.setString(2,s.getScity());
      pstmt.setString(3,s.getSzip());
      pstmt.setString(4,s.getSemail());
      pstmt.setString(5,s.getScountry());
      pstmt.setString(6,s.getSbranch());
      pstmt.setLong(7,s.getSphone());
      pstmt.setString(8,s.getPassword());
      pstmt.setInt(9,s.getSid());
      int i = pstmt.executeUpdate();
      return i;
	}

	public static int updateimgdoa(Student s) throws SQLException {
		String q = "update searchapp set simg=? where sid=? ";
	    PreparedStatement pstmt = conn.prepareStatement(q);
	    pstmt.setString(1, s.getSimg());
	    pstmt.setInt(2,s.getSid());
	    int i = pstmt.executeUpdate();
	    return i;
	}

	public static int savehistroy(Search s) throws SQLException {
		String q = "insert into searchengine(seid , sename, sengine, sid)values(?,?,?,?)";
		 PreparedStatement pstmt = conn.prepareStatement(q);
	     pstmt.setInt(1,s.getSeid());
	     pstmt.setString(2,s.getSename());
	     pstmt.setString(3,s.getSengine());
	     pstmt.setInt(4,s.getSid());
	     int i = pstmt.executeUpdate();
	     return i;
	}

	public static ResultSet getsearchdao() throws SQLException {
		Statement stmt=conn.createStatement(); 
		String q = "select * from searchengine";
		ResultSet set = stmt.executeQuery(q);
		return set;
	}

	public static int deletehistroy(int search_id) throws SQLException {
		String q = "delete from searchengine where seid=?";
		PreparedStatement pstmt = conn.prepareStatement(q);
	    pstmt.setInt(1,search_id);
	    int i = pstmt.executeUpdate();
	    return i;
		
	}
}
