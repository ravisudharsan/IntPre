package com.myworkings.comparator;

import java.util.Comparator;

import com.myworkings.entity.Student;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
