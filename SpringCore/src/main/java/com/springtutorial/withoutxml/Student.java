package com.springtutorial.withoutxml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("101")
	int sid;
	
	@Value("Ajay Ingle")
	String sname;

	// referencing
	@Autowired
	Courses courses;
	
	// collection
	@Autowired
	List<String> subject;

    @Autowired
	Teacher teacher;
    
    @Autowired
    List<Friends> friends;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", courses=" + courses + ", subject=" + subject
				+ ", teacher=" + teacher + ", friends=" + friends + "]";
	}
}
