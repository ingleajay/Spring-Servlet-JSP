package com.springtutorial.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ds")
public class DemoStaticMethodAndVar {

	// access static method
	@Value("#{T(com.springtutorial.spel.Services).add(10,20)}")
	int addition;
	
	// access in build static method
	@Value("#{T(java.lang.Math).sqrt(100)}")
	int squreroot;

	// access static variable
	@Value("#{T(com.springtutorial.spel.Services).div}")
	char division;
	
	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}
	
	

	public int getSqureroot() {
		return squreroot;
	}

	public void setSqureroot(int squreroot) {
		this.squreroot = squreroot;
	}

	
	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "[addition=" + addition + ", squreroot=" + squreroot + ", division=" + division
				+ "]";
	}

}
