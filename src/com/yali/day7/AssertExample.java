package com.yali.day7;

public class AssertExample {

	public static void main(String[] args) {
		int age = -30;
		assert age > 0;
		if (age < 0) {
			System.out.println("Not valid");
		} else {
			System.out.println(age);
		}
	}
}
