package com.myworkings.comparator;

import java.util.Comparator;

import com.myworkings.entity.Student;

public class SortByQualification implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getQualification().compareTo(o2.getQualification());
	}

}
