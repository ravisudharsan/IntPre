package com.myworking.sync;

public class FinalizeExample {
	protected void finalize() {

		try {
			System.out.println("Inside Demos Finalize");
		} catch (Throwable e) {
			throw e;
		} finally {
			

		}
	}

	public static void main(String[] args) {
		FinalizeExample example = new FinalizeExample();
		example.finalize();
	}
}
