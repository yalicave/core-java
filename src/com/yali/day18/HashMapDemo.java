package com.yali.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,String> m = new TreeMap<>();
		m.put("Siva", "P");
		
		m.put("ranjith", "D");
		System.out.println(m.get("ranjith"));
		
	}
}
