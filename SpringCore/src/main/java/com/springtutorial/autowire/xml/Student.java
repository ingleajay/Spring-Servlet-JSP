package com.springtutorial.autowire.xml;

public class Student {

	int sid;
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
	public void setCollege(College college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", college=" + college + "]";
	}
	
	
}
