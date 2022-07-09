package com.springtutorial.autowire.xml.byconstructor;

public class Student {

	int sid;
	College college;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, College college) {
		super();
		System.out.println("Constructor injection..");
		
		this.sid = sid;
		this.college = college;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", college=" + college + "]";
	}
	
	
}
