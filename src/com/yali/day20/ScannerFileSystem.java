package com.yali.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileSystem {

	public static void main(String[] args) {
		File file = new File("src/resource/input.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			Scanner sc = new Scanner(fileInputStream);
			int i = sc.nextInt();
			int j = sc.nextInt();
			String s = sc.nextLine();
			System.out.println(i + " " + j + " " + s);
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
