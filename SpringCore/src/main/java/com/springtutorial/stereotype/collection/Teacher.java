package com.springtutorial.stereotype.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	@Value("101")
	int tid;
	
	@Value("Ajay")
	String tname;
	
	@Value("#{lp}")
	List<Long> phone;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public List<Long> getPhone() {
		return phone;
	}
	public void setPhone(List<Long> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
}
