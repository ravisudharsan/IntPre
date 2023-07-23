package com.myworkings.entity;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String qualification;

	public Student(int id, String name, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
