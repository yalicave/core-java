package com.yali.problems;

import java.util.Scanner;

public class TeaShop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TeaPreparationArea teaArea = new TeaPreparationArea();

		teaArea.startBoiler();
		System.out.println("What you want?");
		String input = s.next();
		if (input.equals("Coffee")) {
			Glass g = teaArea.makeCoffee();
			System.out.println("Having my " + g);
			teaArea.collectGlass(g);
		} else if (input.equals("Tea")) {
			System.out.println("How many tea?");
			int count = s.nextInt();
			if (count == 1) {
				System.out.println(teaArea.makeTea());
			} else {
				System.out.println(teaArea.makeTea(count));
			}

		} else if (input.equals("Milk")) {

		} else {
			System.out.println("Reading news paper");
		}
	}
}

class TeaPreparationArea {
	boolean isEnoughSugar;
	boolean isEnoughMilk;
	boolean isMilkboiling;
	
	void startBoiler() {
		isMilkboiling = true;
		System.out.println("Started boiler");
	}
	GlassHolder makeTea(int count) {
		System.out.println("Tea order..");
		if (isMilkboiling == true) {
			Glass g = new Glass("Tea");
			GlassHolder gh = new GlassHolder();
			gh.g1 = g;
			gh.g2 = new Glass("Tea");
			return gh;
		} else {
			return null;
		}
	}

	GlassHolder makeTea(int count, float sugar) {
		System.out.println("Tea order..");
		if (isMilkboiling == true) {
			Glass g = new Glass("Tea with " + sugar + "sugar");
			GlassHolder gh = new GlassHolder();
			gh.g1 = g;
			gh.g2 = new Glass("Tea");
			return gh;
		} else {
			return null;
		}
	}

	Glass makeTea() {
		System.out.println("Single tea");
		if (isMilkboiling == true) {
			Glass g = new Glass("Tea");
			return g;
		} else {
			return null;
		}
	}

	Glass makeCoffee() {
		if (isMilkboiling == true) {
			Glass g = new Glass("Coffee");
			return g;
		} else {
			return null;
		}
	}

	void collectGlass(Glass g) {
		System.out.println("Collected " + g);
	}

}

class GlassHolder {
	Glass g1;
	Glass g2;
	Glass g3;
	Glass g4;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return g1 + " " + g2 + " " + g3 + " " + g4;
	}
}

class Glass {
	String content;

	public Glass(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return content;
	}

}