package com.sorm.SpringOrm.xml;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional 
	public int insertdata(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	
	@Transactional
    public boolean updatedata(Student student) {
			hibernateTemplate.update(student);
			return true;
	}
	
	@Transactional 
	public boolean deletedata(int stuid) {
		Student student = this.hibernateTemplate.get(Student.class,stuid);
		this.hibernateTemplate.delete(student);
		return true;
	}
	
	
	public Student getonestudata(int stuid) {
		Student student = this.hibernateTemplate.get(Student.class,stuid);
		return student;
	}
	
	public List<Student> getallstudata() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
