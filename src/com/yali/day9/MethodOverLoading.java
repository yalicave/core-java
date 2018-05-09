package com.yali.day9;

public class MethodOverLoading {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		int output = m.four(10);
		//System.out.println(output);
		 
		/*System.out.println(MyMathVersion2.add(10.0F, 20));
		System.out.println(MyMathVersion2.add(1000000000000000L, 20));
		System.out.println(MyMathVersion2.add("Hello", "World"));*/
		IntMath intMath = new IntMath(10,200);
		System.out.println(intMath.add() + " "+intMath.sub());
		System.out.println();
		System.out.println(intMath.times());
	}
}
class MyMath{
	void one(){
		
	}
	void two(int i){
		
	}
	int three(){
		return 0;
	}
	int four(int i){
		return i;
	}
}

class MyMathVersion2{
	static String add(String i,String j){
		return i + j;
	}
	static  int add(int i,int j){
		return i + j;
	}
	static  long add(long i,long j){
		return i + j;
	}
	static float add(float i,float j){
		return i + j;
	}
}
class IntMath{
	int i;
	int j;
	public IntMath(int i,int j) {
		this.i = i;
		this.j = j;
	}
	 int add(){
		return i + j;
	}
	int sub(){
		return i - j;
	}
	int times(){
		return i * j;
	}
}
