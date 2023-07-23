package com.myworkings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import com.myworkings.entity.Student;

public class OptionalClassExample {
	public static void main(String[] args) {
		// Without Optional Class
		String[] words = new String[10];
		// String word = words[5].toLowerCase();
		// System.out.print(word);

		// After Implementing Optional class

		Optional<String> checkNull = Optional.ofNullable(words[5]);
		if (checkNull.isPresent()) {
			String word1 = words[5].toLowerCase();
			System.out.print(word1);
		} else {
			System.out.println("word is null");

		}

		

	}
}
