package com.myworkings;

import java.util.ArrayList;
import java.util.Collections;

import com.myworkings.comparator.SortById;
import com.myworkings.comparator.SortByName;
import com.myworkings.comparator.SortByQualification;
import com.myworkings.entity.Student;

public class MultiObjComparator {
	public static void main(String[] args) {
		Student s1 = new Student(4, "Ravi", "B.E");
		Student s2 = new Student(5, "Gambir", "BCA");
		Student s3 = new Student(1, "Arun", "BBA");
		Student s4 = new Student(3, "Sachin", "BA");
		Student s5 = new Student(6, "Dravid", "BCOM");
		Student s6 = new Student(2, "Mohan", "MA");
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		arrayList.add(s6);
		System.out.println("Before Sorting: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId());
		}
		System.out.println("Before Sorting By Id: ");

		Collections.sort(arrayList, new SortById());
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId());
		}

		System.out.println("After Sorting By Name: ");
		Collections.sort(arrayList, new SortByName());

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId() + "." + arrayList.get(i).getName());
		}
		System.out.println("After Sorting By Qualification: ");
		Collections.sort(arrayList, new SortByQualification());

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId() + "." + arrayList.get(i).getQualification());
		}
	}
}