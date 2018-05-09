package com.yali.day9;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 10;
		Integer j = 10;
		method(i,j);
		System.out.println(i + " "+j);
		ObjectClass obj = new ObjectClass(i, j);
		System.out.println(obj);
		obj.swap();
		System.out.println(obj);
		
	}
	static void method(int i , int j){
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + " "+j);
	}
}
class ObjectClass{
	int i;
	int j;
	public ObjectClass(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public void swap(){
		int temp = i;
		i = j;
		j = temp;
		
	}
	@Override
	public String toString() {
		return "ObjectClass [i=" + i + ", j=" + j + "]";
	}
	 
}
