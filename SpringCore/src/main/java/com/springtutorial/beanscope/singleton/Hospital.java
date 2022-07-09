package com.springtutorial.beanscope.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	@Value("Inlex Hospital")
	String hname;
	
	@Value("4.5")
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
