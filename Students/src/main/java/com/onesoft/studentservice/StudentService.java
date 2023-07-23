package com.onesoft.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.onesoft.student.entity.Student;
import com.onesoft.student.exception.AttendanceLowException;
import com.onesoft.studentDao.StudentDao;
import com.onesoft.studentrepository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentDao stdDao;
	public String addAll(List<Student> a) {
		return stdDao.addAll(a);
	}
	public List<Student> getStds(){
		return stdDao.getStds();
	}
	public String update( Student a) {
		return stdDao.update(a);
	}
	public String deleteId(@PathVariable int id) {
		return stdDao.deleteId(id);
	}
	@Autowired
	StudentRepository stdRepo;
	public String addpercent(List<Student> a) throws AttendanceLowException {
		int b=0;
		for( Student x:a) {
			if(x.getAttendencePercentage()>50) {
				stdRepo.saveAll(a);
				b++;
			}
		}
		if(b!=0) {
			return " eligible";
		}
		else {
			throw new AttendanceLowException();
		}
		}
		
	}

