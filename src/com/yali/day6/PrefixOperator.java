package com.yali.day6;

public class PrefixOperator {
	public static void main(String[] args) {
		// Postfix
		int a = 0;
		int postfixIncement = a++;
		System.out.println(postfixIncement); 
		System.out.println(a); 

		// Prefix
		int b = 0;
		int prefixIncrement = ++b;
		System.out.println(prefixIncrement); 
		System.out.println(b);
		
		int result = prefixIncrement++ + ++prefixIncrement; 
		System.out.println(prefixIncrement);
		System.out.println(result);

	}
}
