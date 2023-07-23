package com.myworking.nonsync;

public class Synchronization_Example1 {
	public static void main(String args[]) {
		Power obj = new Power();// only one object
		Thread1 p1 = new Thread1(obj);
		Thread2 p2 = new Thread2(obj);
		p1.start();
		p2.start();
	}
}
