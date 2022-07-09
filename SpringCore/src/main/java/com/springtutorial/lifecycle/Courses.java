package com.springtutorial.lifecycle;

public class Courses {

	int cid;
	String cname;
	
	public void init() {
		System.out.println("Inside init method");
	}

	public void destroy() {
		System.out.println("Inside destory method");
	}

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
