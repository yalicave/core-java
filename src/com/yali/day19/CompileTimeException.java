package com.yali.day19;

import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) {
		exp();
	}

	static int exp() {
		try {
			throwError();
			return 1;
		} catch (IOException e) {
			System.out.println("IO");
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excetion");
			// e.printStackTrace();
			return -1;
		} finally {
			System.out.println("Exist");
		}
	}

	private static void throwError() throws IOException {
		System.out.println(((double) Math.random()) * 100);
		int i = 1;
		if (i == 0) {
			throw new IOException();
		} else {
			throw new ArithmeticException();
		}
	}

	private static void throwNEPError() {
		throw new NullPointerException();
	}
}
