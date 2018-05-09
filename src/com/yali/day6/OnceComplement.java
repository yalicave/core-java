package com.yali.day6;

public class OnceComplement {
	public static void main(String[] args) {
		String i = Integer.toBinaryString(16);
		//int j = 0b10000;
		int k = 0b0111;
		System.out.println(k);
		/*System.out.println(~j);*/
		System.out.println(Integer.toBinaryString(~k));
	}
}
