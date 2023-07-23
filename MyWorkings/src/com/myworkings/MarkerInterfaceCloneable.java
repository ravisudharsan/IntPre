package com.myworkings;

public class MarkerInterfaceCloneable implements Cloneable {
	int id;
	String name;

	public MarkerInterfaceCloneable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		MarkerInterfaceCloneable cloneable1 = new MarkerInterfaceCloneable(1, "Ravi");
		MarkerInterfaceCloneable cloneable2 = (MarkerInterfaceCloneable) cloneable1.clone();
		System.out.println(cloneable2.name);
	}
}
