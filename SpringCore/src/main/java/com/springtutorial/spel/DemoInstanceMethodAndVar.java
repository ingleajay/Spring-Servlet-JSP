package com.springtutorial.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("di")
public class DemoInstanceMethodAndVar {

	// access instance var
	@Value("#{new com.springtutorial.spel.Services().marks}")
	float studmarks ;
	
	// access instance method
	@Value("#{new com.springtutorial.spel.Services().sub(100,90)}")
	int sub ;
	
	// access instance in build method
	@Value("#{new java.lang.String('Ajay Ingle')}")
	String name;

	public float getStudmarks() {
		return studmarks;
	}

	public void setStudmarks(float studmarks) {
		this.studmarks = studmarks;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[studmarks=" + studmarks + ", sub=" + sub + ", name=" + name + "]";
	}
	
	
	
	
}
