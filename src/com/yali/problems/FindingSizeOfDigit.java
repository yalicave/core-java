package com.yali.problems;

public class FindingSizeOfDigit {
	public static void main(String[] args) {
		int number = 1020300;
		int count = 1;
		while (number / 10 > 0){
			System.out.println(number);
			number = number / 10;
			count++;
		}
		
		System.out.println(count);
	}
}
