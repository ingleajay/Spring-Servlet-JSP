package com.springtutorial.withoutxml.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	int sid;
	
	String sname;
	
	@Autowired
	List<Subject> subjects;
	
	@Autowired
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", subjects=" + subjects + ", address=" + address + "]";
	}

}
