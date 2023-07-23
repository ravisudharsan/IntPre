package com.myworkings;

import java.util.ArrayList;
import java.util.Collections;

public class SingleComparable implements Comparable<SingleComparable> {
	private int id;
	private String name;
	private String designation;

	public SingleComparable(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public static void main(String[] args) {
		SingleComparable comparable1 = new SingleComparable(3, "Ravi", "Employee");
		SingleComparable comparable2 = new SingleComparable(2, "Ramesh", "Employee");
		SingleComparable comparable3 = new SingleComparable(1, "Sachin", "Head");
		SingleComparable comparable4 = new SingleComparable(4, "Sachu", "Employee");
		SingleComparable comparable5 = new SingleComparable(5, "Zaheer", "Employee");
		ArrayList<SingleComparable> arrayList = new ArrayList<>();
		arrayList.add(comparable1);
		arrayList.add(comparable2);
		arrayList.add(comparable3);
		arrayList.add(comparable4);
		arrayList.add(comparable5);
		System.out.println("Before: ");
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i).getId());
		}
		Collections.sort(arrayList);
		System.out.println("After: ");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId());
		}
	}

	@Override
	public int compareTo(SingleComparable o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

}
