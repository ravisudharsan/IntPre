package com.myworkings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.myworkings.entity.Student;

public class StreamExample {
	public static void main(String[] args) {
		Student s1 = new Student(4, "Ravi", "B.E");
		Student s2 = new Student(5, "Ravi", "BCA");
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

		ArrayList<Student> filteredList = (ArrayList<Student>) arrayList.stream()
				.filter(a -> a.getName().equals("Ravi")).collect(Collectors.toList());
		System.out.println("1st Filter");
		for (int i = 0; i < filteredList.size(); i++) {
			System.out.println(filteredList.get(i).getName());
		}
		List<String> mapFilteredList = arrayList.stream().filter(a -> a.getId() <= 3).map(b -> b.getName())
				.collect(Collectors.toList());

		System.out.println("2nd Filter");
		for (int i = 0; i < mapFilteredList.size(); i++) {
			System.out.println(mapFilteredList.get(i));
		}
		System.out.println("Implemented For Each");

		arrayList.stream().filter(a -> a.getId() <= 3).map(b -> b.getId()).forEach(System.out::println);
		System.out.println("Implemented count(): ");
		int findCount = (int) arrayList.stream().count();
		System.out.println("arrayList count is " + findCount);

		System.out.println("Implemented distinct()");
		List<Student> distinctList = arrayList.stream().distinct().collect(Collectors.toList());
		for (int i = 0; i < distinctList.size(); i++) {
			System.out.println(distinctList.get(i).getName());
		}

		System.out.println("The sorted stream is : ");
		arrayList.stream().sorted(((p1, p2) -> p1.getName().compareTo(p2.getName())));
	}
}
