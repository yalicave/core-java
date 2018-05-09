package com.yali.day4;

import java.util.Enumeration;
import java.util.Properties;

public class WhileLoop {
	
	public static void main(String[] args) {
		Properties systemProperties = System.getProperties();
		Enumeration<Object> properties = systemProperties.elements();
		while(properties.hasMoreElements()){
			System.out.println(properties.nextElement());
		}
	}
}
