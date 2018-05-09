package com.yali.day6;

public class LoopsAndIncrement {
	public static void main(String[] args) {
		//Postfix increment in for loop
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		//Prefix increments in for loop
		System.out.println();
		for (int i = 0; i < 5; ++i) {
			System.out.print(i);
		}
		//Postfix increment in while loop
		System.out.println();
		{
			int i = 0;
			while (i < 5) {
				System.out.print(i++);
			}
		}
		
		//Prefixx increment in while loop
		System.out.println();
		{
			int i = 0;
			while (i < 5) {
				System.out.print(++i);
			}
		}
	}
}
