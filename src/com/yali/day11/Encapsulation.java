package com.yali.day11;

public class Encapsulation {

	public static void main(String[] args) {
		Helmet h = new Helmet("Duck");
		Rider ranjith = new Rider("Ranjith", h);
		Rider akshit = new Rider("Akshit", h);
		System.out.println(Rider.group);
		System.out.println(ranjith);
		System.out.println(akshit);
	}
}

class Rider {
	public final static int group = 101;
	private String name;
	private Helmet helmet;

	public Rider(String name, Helmet helmet) {
		this.name = name;
		this.helmet = helmet;
	}

	@Override
	public String toString() {
		return "Rider : Name = " + name + ",Helmet = " + helmet + ",Group =" + group;
	}
}

class Helmet {
	private String brand;

	public Helmet(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Helmet brand : " + brand;
	}
}