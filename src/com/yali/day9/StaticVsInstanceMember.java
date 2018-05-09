package com.yali.day9;

public class StaticVsInstanceMember {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.i = 100;
		d.j = 200;
		//System.out.println(d);
		Demo d1 = new Demo();
		System.out.println(d1);
	}
}

class Demo{
	static int i = 10;
	int j = 20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i = "+i + " ,j = "+j;
	}
}