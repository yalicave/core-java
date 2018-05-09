package com.yali.day2;

public class ClassDemo {
	public static void main(String[] args) {
		EchoHelper reference = new EchoHelper();
		System.out.println(reference.echo(""));
	}
}

class EchoHelper{
	public String echo(String message){
		return message;
	}
}
