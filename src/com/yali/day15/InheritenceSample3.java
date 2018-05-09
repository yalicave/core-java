package com.yali.day15;

public class InheritenceSample3 {

	public static void main(String[] args) {
		TooHappyUser h = new VeryMuchHappyUser();
		h.sayHello();
		//h.chilBro();
	}
}

class HappyUser{
	public HappyUser() {
		super();
		System.out.println("I wakeup!!");
	}
	public void sayHello(){
		System.out.println("Hello");
	}
}

class TooHappyUser extends HappyUser{
	public TooHappyUser() {
		super();
		System.out.println("I too bro !!");
	}
	@Override
	public void sayHello() {
		System.out.println("And too happy");
		super.sayHello();
	}
	public void chilBro(){
		System.out.println("Chilax");
	}
		
}

class VeryMuchHappyUser extends TooHappyUser{
	@Override
	public void sayHello() {
		System.out.println("Verymuch too happy");
		super.sayHello();
	}
}