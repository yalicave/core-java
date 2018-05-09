package com.yali.day6;

public class BitManipulation {

	public static void main(String[] args) {
		int a = 0b0101;
		int b = 0b0111;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Integer.toBinaryString(a+b));
		
		System.out.println(0b0111 >>> 1);
	}
}
