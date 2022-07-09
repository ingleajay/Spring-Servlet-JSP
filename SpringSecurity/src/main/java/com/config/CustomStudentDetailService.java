package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dao.StudentDao;
import com.models.Student;

public class CustomStudentDetailService implements UserDetailsService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Student student = this.studentDao.getStudentByStuName(username);
		if(student == null) {
			throw new UsernameNotFoundException("Student is not found");
		}
		CustomStudentDetails customStudentDetails= new CustomStudentDetails(student);
		
		return customStudentDetails;
	}
	
	
}
