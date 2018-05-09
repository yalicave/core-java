package com.yali.day6;

public class BitwiseSample {
	public static void main(String[] args) {
		int a = 0b0000_1100;
		System.out.println(a);
		int b = 0b00000_1110;
		System.out.println(b);
		int result = a & b; 
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));

	}
}
