package com.springtutorial.stereotype.reference;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Value("101")
	int tid;
	
	@Value("Ajay")
	String tname;
	
	@Value("#{s}")
	Map<Integer, String> subject;
	
	@Autowired
	Student student;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public Map<Integer, String> getSubject() {
		return subject;
	}
	public void setSubject(Map<Integer, String> subject) {
		this.subject = subject;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", subject=" + subject + ", student=" + student + "]";
	}
	
}
