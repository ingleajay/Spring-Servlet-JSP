package com.springtutorial.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	int sid;
	
	@Autowired
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
