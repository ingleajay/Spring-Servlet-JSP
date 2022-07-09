package com.springtutorial.SpringCore.Injection.primitive.constructor;

public class Student {

	int sid;
	String sname;
	int smarks;
	public Student(int sid, String sname, int smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
}
