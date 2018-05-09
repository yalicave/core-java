package com.yali.day7;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello");
		buf.append("Welcome");
		buf.insert(2, "Insertenewly");
		buf.toString();
		System.out.println(buf);
	}
}
