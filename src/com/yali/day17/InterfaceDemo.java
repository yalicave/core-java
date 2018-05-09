package com.yali.day17;

public class InterfaceDemo {

	public static void main(String[] args) {
		ComputerLabStudent cls  = new Student();
		cls.donNotEatOnTheTable();
		ChemistryLabStudent chemistLab = (Student) cls;
		chemistLab.dontShakeTooMuch();
	}
}

interface ComputerLabStudent {
	abstract void donNotEatOnTheTable();
}

interface ChemistryLabStudent {
	void dontShakeTooMuch();
}

class Student implements ComputerLabStudent, ChemistryLabStudent {

	Laptop laptop;

	@Override
	public void donNotEatOnTheTable() {
		System.out.println("Not eatch sir");
	}

	@Override
	public void dontShakeTooMuch() {
		System.out.println("Doing right sir");

	}

}

class Laptop {

}
