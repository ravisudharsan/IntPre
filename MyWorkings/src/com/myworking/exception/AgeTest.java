package com.myworking.exception;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class AgeTest {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is less");
		} else {
			System.out.print("Executed");
		}
	}

	public static void main(String[] args) {
		try {
			validate(3);
		} catch (InvalidAgeException e) {
			System.out.print("Caught the exception ");
			System.out.print("Exception Occured " + e);
		}
	}
}
