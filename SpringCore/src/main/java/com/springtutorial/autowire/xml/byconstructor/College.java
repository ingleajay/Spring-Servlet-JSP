package com.springtutorial.autowire.xml.byconstructor;

public class College {

	int cid;
	String cname;
	

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}


	public College(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
