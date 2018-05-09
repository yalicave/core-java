package com.yali.day5;

public class ContinueDemo {
	public static void main(String[] args) {
		int topSpeed = 100;
		int currentSpeed = 0;
		int speedLimit = 60;
		for (int i = 0; i < topSpeed; i++) {
			System.out.println(currentSpeed);
			if (currentSpeed < speedLimit) {
				currentSpeed++;
			} else {
				//No more speeding
				continue;
			}
		}

	}
}
