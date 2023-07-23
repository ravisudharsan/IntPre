package com.workings.logical;

public class StringRevNoMethod {
	public static void main(String[] args) {
		String input = "Sudharsan";
		StringBuffer output=new StringBuffer();
		for (int i = input.length()-1; i >=0; i--) {
				output.append(input.charAt(i));
		}
		System.out.println(output);
	}
}
