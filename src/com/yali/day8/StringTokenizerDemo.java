package com.yali.day8;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Akshith simha");
		s.nextToken();
		System.out.println(s.nextToken());
	}
}
