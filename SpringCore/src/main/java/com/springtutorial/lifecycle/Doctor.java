package com.springtutorial.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Doctor implements InitializingBean , DisposableBean  {

	int did;
	String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + "]";
	}
	public void destroy() throws Exception {
		System.out.println("destoy is running....");
		
		
	}
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("init is running....");
	}
	
	
}
