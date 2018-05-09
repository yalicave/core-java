package com.yali.day8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormaterDemo {
	public static void main(String[] args) {
		 NumberFormat f = NumberFormat.getInstance(Locale.GERMAN);
		 //DecimalFormat f = new DecimalFormat("###,###");
		System.out.println(f.format(1000.000001));
	}
}
