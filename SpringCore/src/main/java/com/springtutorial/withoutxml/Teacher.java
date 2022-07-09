package com.springtutorial.withoutxml;

public class Teacher {

	int tid;
	String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		System.out.println("Teacher setter .....");
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "[tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
