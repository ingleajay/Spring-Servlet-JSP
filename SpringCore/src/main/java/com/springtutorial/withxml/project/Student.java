package com.springtutorial.withxml.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{T(com.springtutorial.withxml.project.Services).sid}")
	int sid;
	
	@Value("#{T(com.springtutorial.withxml.project.Services).sname}")
	String sname;
	
	@Autowired
	@Value("#{T(com.springtutorial.withxml.project.Services).addsubject()}")
	List<Subject> subjects;
	
	@Autowired
	@Value("#{T(com.springtutorial.withxml.project.Services). addAddress()}")
	Address address;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

}
