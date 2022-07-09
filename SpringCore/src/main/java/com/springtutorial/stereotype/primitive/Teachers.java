package com.springtutorial.stereotype.primitive;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t1")
public class Teachers {

	@Value("102")
	int tid;
	
	@Value("Ankit")
	String tname;
	
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
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
}
