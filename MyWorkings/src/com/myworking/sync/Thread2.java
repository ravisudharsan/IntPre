package com.myworking.sync;

public class Thread2 extends Thread {
	Power p;

	Thread2(Power p) {
		this.p = p;
	}

	public void run() {
		p.printPower(8);
	}
}
