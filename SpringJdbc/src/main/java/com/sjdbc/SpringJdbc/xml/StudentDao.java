package com.sjdbc.SpringJdbc.xml;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int sid);
	public Student getstudent(int sid);
	public List<Student> getallstudent();
}
