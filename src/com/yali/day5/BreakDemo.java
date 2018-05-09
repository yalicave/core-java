package com.yali.day5;

public class BreakDemo {
	public static void main(String[] args) {
		int topSpeed = 100;
		int currentSpeed = 0;
		
		for (int i = 0; i < topSpeed; i++) {
			currentSpeed ++;
			System.out.println(currentSpeed);
			if(currentSpeed > 50){
				//Apply break
				break;
			}
		}
	}
}
