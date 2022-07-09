package com.springtutorial.withoutxml;

public class Friends {

	int fid;
	String fname;
	public Friends(int fid, String fname) {
		super();

		System.out.println("Friend constructor.....");
		this.fid = fid;
		this.fname = fname;
	}
	public Friends() {
		super();
	}
	@Override
	public String toString() {
		return "[fid=" + fid + ", fname=" + fname + "]";
	}
}
