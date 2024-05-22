package com.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface Studentinterface extends JpaRepository<Student, Integer> {
	
}
