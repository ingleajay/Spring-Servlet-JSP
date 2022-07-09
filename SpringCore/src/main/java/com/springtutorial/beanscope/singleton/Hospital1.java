package com.springtutorial.beanscope.singleton;


public class Hospital1 {

	String hname;
	
	float rate;

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Hospital [hname=" + hname + ", rate=" + rate + "]";
	}
	
	
}
