package com.yali.day18;

public class MethodOverLoading {

	public static void main(String[] args) {
		new WrapperMath().execute(10, 20);
		new WrapperMath().execute(new Integer(10), new Integer(10));
		int i = 0;
		Integer i1 = i;
	}
}

class Math{
	void execute(int i,int j){
		System.out.println(i+j);
	}
}
class WrapperMath extends Math{
	
	/*void execute(Integer i,Integer j){
		System.out.println("Test wrapper");
		System.out.println(i+j);
	}*/
	void execute(Integer i ,Integer j){
		System.out.println("wrapper");
	}
	/*void execute(int i,int j){
		System.out.println("Test primitive");
		System.out.println(i+j);
	}*/
}
