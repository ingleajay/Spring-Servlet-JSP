package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.models.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where s.stuname = :stuname")
	public Student getStudentByStuName(@Param("stuname") String stuname);
}
