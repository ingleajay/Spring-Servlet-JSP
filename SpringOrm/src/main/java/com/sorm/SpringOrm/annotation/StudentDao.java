package com.sorm.SpringOrm.annotation;

import java.util.List;

public interface StudentDao {
	public int insertdata(Student student);
	public boolean updatedata(Student student);
	public boolean deletedata(int stuid);
	public Student getonestudata(int stuid );
	public List<Student> getallstudata();
}
