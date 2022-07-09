package com.springtutorial.withoutxml.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="stu")
	public Student createstudent() {
		Student s1 = new Student();
		s1 = new Services().storestudent(s1);
		return s1;
	}
	
	@Bean
	public List<Subject> storesubject() {
		List<Subject> s = new Services().addsubject();
		return s;
	}
	
	@Bean
	public Address storeaddress() {
		Address a = new Address();
		Address s = new Services().addAddress(a);
		return s;
	}
}
