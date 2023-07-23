package com.onesoft.studentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.onesoft.student.entity.Student;
import com.onesoft.student.exception.AttendanceLowException;
import com.onesoft.studentrepository.StudentRepository;

@Repository

public class StudentDao {
	@Autowired
	StudentRepository stdRepo;
	public String addAll(List<Student> a) {
		stdRepo.saveAll(a);
		return "saved ";
		
	}
	public List<Student> getStds(){
		return stdRepo.findAll();
	}
	public String update( Student a) {
		 stdRepo.save(a);
		 return "update sucess";
	}
	public String deleteId(@PathVariable int id) {
		stdRepo.deleteById(id);
		return "delete";
	}
	
	
}
