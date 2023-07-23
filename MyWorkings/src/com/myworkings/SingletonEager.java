package com.myworkings;

public class SingletonEager {
	private static SingletonEager eager = new SingletonEager();

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return eager;
	}

	public static void main(String[] args) {
		SingletonEager eager1 = SingletonEager.getInstance();
		SingletonEager eager2 = SingletonEager.getInstance();
		System.out.println("Eager 1 Hashcode is "+eager1.hashCode());
		System.out.println("Eager 2 Hashcode is "+eager2.hashCode());
	}
}
