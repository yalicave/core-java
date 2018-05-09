package com.yali.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamConsole {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(reader);
		int count=0;
		String s = "";
		try {
			while((s=buf.readLine())!=null){
				count++;
				System.out.println(count + s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
