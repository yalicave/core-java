package com.yali.day20;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) {
		String str1;
		try {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter your name: ");
			str1 = dis.readLine();
			System.out.println("I know your name is " + str1);

			System.out.println("Enter a whole number: ");
			String str2 = dis.readLine();
			int x = Integer.parseInt(str2);

			System.out.println("Enter a double value: ");
			String str3 = dis.readLine();
			double y = Double.parseDouble(str3);

			if (x > y)
				System.out.println("First number " + x + " is greater than second number " + y);
			else
				System.out.println("First number " + x + " is less than second number " + y);

			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
