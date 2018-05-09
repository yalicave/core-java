package com.yali.day6;

public class RelationalOperator {
	public static void main(String[] args) {
		// PostFix
		int speed = 30;
		int roadQualtiy = -1;
		if (roadQualtiy < 0) {
			speed--;
		} else if(roadQualtiy > 0) {
			speed++;
		} /*else{
			speed = speed;
		}*/
		
		System.out.println(speed);
		Object i = "hello";
		System.out.println(i instanceof String);
	}
}
