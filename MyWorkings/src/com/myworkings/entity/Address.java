package com.myworkings.entity;

public class Address {
	private int houseno;
	private String housename;
	private String area;

	public Address(int houseno, String housename, String area) {
		super();
		this.houseno = houseno;
		this.housename = housename;
		this.area = area;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
