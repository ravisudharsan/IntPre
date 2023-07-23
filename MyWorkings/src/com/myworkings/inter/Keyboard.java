package com.myworkings.inter;

public interface Keyboard {
	void noofkeys(int a);
	void noofenter(int a);

	default void show() {
		System.out.println("Displayed the show()");
	}

	default void display() {
		System.out.println("Displayed the display()");
	}
	static void action() {
		System.out.println("Static1 method");
	}
	static void action1() {
		System.out.println("Static1 method");
	}
}
