package com.yali.day7;

public class InstanceOfExample {

	public static void main(String[] args) {
		Object s = "Instance";
		if(s instanceof Integer){
		System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
