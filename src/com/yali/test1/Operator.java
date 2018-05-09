package com.yali.test1;

public class Operator {

	public static void main(String[] args) {
		int i = 10;
		int j = 100;
		int res = i++ - (j--) * ++i;
		System.out.println(res);
	}
}
