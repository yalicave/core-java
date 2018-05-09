package com.yali.day19;

public class EscapeNullPointerException {

	public static void main(String[] args) {
		String s = null;
		new Manipulation().print("");
		 
	}
	
}

class Manipulation{
	void print(String s){
		if(s!=null){
			System.out.println(s.length());
		} 
	}
}