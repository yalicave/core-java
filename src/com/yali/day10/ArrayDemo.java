package com.yali.day10;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		/*PrimitiveArray p = new PrimitiveArray();
		int[] a = { 1, 2, 3, 4, 5, 6 };
		p.doIt(a);*/
		
		ObjectArray o = new ObjectArray();
		Integer[] a = {1,2,3,4};
		o.doIt(a);
	}
}

class PrimitiveArray {
	public void doIt(int[] a) {

		int[] b = new int[a.length];
		
		b = Arrays.copyOf(a, 10);
		a[1]=20;
		for (int i = 0; i < a.length; i++) {
			/*if (i < 5) {
				a[i] = 10;
			} else {
				a[i] = 20;
			}*/
			System.out.println(b[i]);
		}
	}
}
class ObjectArray {
	public void doIt(Integer[] a) {

		Integer[] b = new Integer[a.length];
		
		b = Arrays.copyOf(a, 10);
		a[1]=20;
		for (int i = 0; i < a.length; i++) {
			/*if (i < 5) {
				a[i] = 10;
			} else {
				a[i] = 20;
			}*/
			System.out.println(b[i]);
		}
	}
}