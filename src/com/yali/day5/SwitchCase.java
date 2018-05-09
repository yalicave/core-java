package com.yali.day5;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		String inWords = "";
		switch (month) {
		case 1:
			inWords = "ONE";
			break;
		case 2:
			inWords = "TWO";
			break;
		case 3:
			inWords = "THREE";
			break;
		case 4:
			inWords = "FOUR";
			break;
		case 5:
			inWords = "FIVE";
			break;
		case 6:
			inWords = "SIX";
			break;
		case 7:
		case 8:	
			inWords = "I forgot the spelling!";
			break;
		case 9:
			inWords = "Nine";
			break;
		default:
			inWords = "No Clue";
			break;
		}
		System.out.println(inWords);
		
	}
}
