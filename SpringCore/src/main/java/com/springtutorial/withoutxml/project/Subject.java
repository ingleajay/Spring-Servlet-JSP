package com.springtutorial.withoutxml.project;

public class Subject {

	int subid;
	String subname;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subname=" + subname + "]";
	}
	
	
}
