package com.springtutorial.autowire.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	int sid;
	
	@Autowired
	@Qualifier("c2")
	College college;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public College getCollege() {
		return college;
	}
	
	//@Autowired
	public void setCollege(College college) {
		System.out.println("on setter method");
		this.college = college;
	}
	
	//@Autowired
	public Student(int sid, College college) {
		super();
		System.out.println("on constructor");
		this.sid = sid;
		this.college = college;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", college=" + college + "]";
	}
	
	
}
