package com.yali.day8;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Heleo");
		sb.replace(2, 4, "llo");
		System.out.println(sb);
		Object1 b = new Object1();
		System.out.println(b);
	}
}


class Object1{
	String i = "Jel";
	public String toString(){
		return i;
	}
}
