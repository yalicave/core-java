package com.yali.day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		int i = 10;
		float salary = i;
		i = (int)salary;
		
		long l = 10000000000000000L;
		int j = (int) l;
		System.out.println(j);
		System.out.println(i);
	}
}
