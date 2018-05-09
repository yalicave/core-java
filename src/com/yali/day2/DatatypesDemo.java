package com.yali.day2;

import java.math.BigInteger;

public class DatatypesDemo {

	public static void main(String[] args) {
		byte roomNumber = -128; // 8 bits == 1 byte 2^8
		short rank = 32767; // 16 bites == 2 byte 2^16
		int distance = 914748364; // 32 bites == 4 byte 2^32
		long randomId = 9223477580766667L; // 64 bits = 8 byte 2^64
		float salary = 3.00f; // 32 bits == 4 byte decimal number
		double stockValue = 300.00d; // 64 bits == 8 byte decimal number
		System.out.println(distance*distance* randomId);
		//System.out.println( new BigInteger("922337203685477580766667444444444444444444444444444444444"));
		
	}
	
}