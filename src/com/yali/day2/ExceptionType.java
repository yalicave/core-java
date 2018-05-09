package com.yali.day2;

import java.sql.SQLException;

public class ExceptionType<T extends Exception> {
	
	private void pleaseThrow(final Exception t) throws T{
		 	throw(T)t;

	}
	public static void main(String[] args) {
		try {
			new ExceptionType<RuntimeException>().pleaseThrow(new SQLException());
		} catch (Exception e) {
			System.out.println("test");
			e.printStackTrace();
		}
	}
	
}
