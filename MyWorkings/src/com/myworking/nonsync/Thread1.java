package com.myworking.nonsync;

public class Thread1 extends Thread {
	Power p;

	Thread1(Power p) {
		this.p = p;
	}

	public void run() {
		p.printPower(5);
	}
}
