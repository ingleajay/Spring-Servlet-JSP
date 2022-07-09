package com.operations;

import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Search;
import com.model.Student;

interface Services {

	boolean savestudent(Student s) throws SQLException ;
	ArrayList<Student> getstudent() throws SQLException;
	boolean updatestudent(Student s) throws SQLException;
	boolean updateimg(Student s)throws SQLException;
	boolean histroysearch(Search s) throws SQLException;
	ArrayList<Search> getsearch() throws SQLException;
	boolean deletehistroy(int search_id) throws SQLException; 
}
