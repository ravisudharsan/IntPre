package com.onesoft.studentcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onesoft.student.entity.Student;
import com.onesoft.student.exception.AttendanceLowException;
import com.onesoft.studentservice.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService stdSer;
	@PostMapping("/addStds")
	public String addAll(@RequestBody List<Student> a) {
		return stdSer.addAll(a);
	}
	@GetMapping(value="/getStds")
	public List<Student> getStds(){
		return stdSer.getStds();
	}
	@PutMapping(value="/updateStd/{a}")
	public String update( Student a) {
		return stdSer.update(a);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable int id) {
		return stdSer.deleteId(id);
		
	}
	@PostMapping(value="/addpercent")
	public String addpercent(@RequestBody List<Student> a) throws AttendanceLowException {
		return stdSer.addpercent(a);
	}

}
