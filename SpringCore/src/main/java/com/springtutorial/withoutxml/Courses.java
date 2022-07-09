package com.springtutorial.withoutxml;

import org.springframework.beans.factory.annotation.Value;

public class Courses {

	@Value("111")
	int cid;
	
	@Value("Java")
	String cname;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
