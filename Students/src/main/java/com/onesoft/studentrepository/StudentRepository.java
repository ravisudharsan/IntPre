package com.onesoft.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

	


}
