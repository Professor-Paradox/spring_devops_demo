package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByRollNo(String rollNo);	
	// press control space and select the findbyrollno method
	// extra function search students based on there roll no
	
}