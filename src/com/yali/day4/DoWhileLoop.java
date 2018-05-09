package com.yali.day4;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int guessingNumber = 4;
		do {
			System.out.println("Guess a number between 1 to 10");
		} while (guessingNumber != scanner.nextInt());
		System.out.println("You got it!");
		scanner.close();
	}
}
