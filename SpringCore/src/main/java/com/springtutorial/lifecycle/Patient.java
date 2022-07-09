package com.springtutorial.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	int pid;
	String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Start init method..");
	}

	@PreDestroy
	public void end() {
		System.out.println("End destroy method..");
	}
}
