package com.yali.day12;

public class InheritenceDemo {

	public static void main(String[] args) {
		Wheel w = new FolkWheel();
		w.roll();
		//w.makeSound();

	}
}

class Wheel {
	String tyre = "Rubber";

	public Wheel() {
		super();
		System.out.println("Whell is getting ready");
	}

	void roll() {

		System.out.println("Wheel Rolling sir.. with " + tyre);
	}
}

class AlloyWheel extends Wheel {

	public AlloyWheel() {
		super();
		super.tyre = "Tubeless";
		System.out.println("AlloyWhell is getting ready");
	}

	@Override
	void roll() {
		super.roll();
		System.out.println("Alloywheel is going to Roll");
	}

}

class FolkWheel extends Wheel {

	@Override
	void roll() {
		System.out.println("Folkwheel is going to Roll");
		super.roll();
	}

	void makeSound() {
		System.out.println("Folk wheel ... soundings");
	}
}
