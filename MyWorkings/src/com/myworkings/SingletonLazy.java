package com.myworkings;

public class SingletonLazy {
	private static SingletonLazy lazy = null;

	private  SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (lazy == null) {
			lazy = new SingletonLazy();
		}

		return lazy;

	}

	public static void main(String[] args) {
		SingletonLazy lazy1 = SingletonLazy.getInstance();
		SingletonLazy lazy2 = SingletonLazy.getInstance();
		if (lazy1 == lazy2) {
			System.out.println("Both Objects are equal");

		} else {
			System.out.println("Both Objects are equal");

		}
	}

}
