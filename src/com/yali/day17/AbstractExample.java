package com.yali.day17;

public class AbstractExample {
	public static void main(String[] args) {
		Sweet s = new Jamoon();
		s.shape();
		s.pack();
	}
}

abstract class  Sweet{
	public abstract void color();
	protected abstract void shape();
	public void pack(){
		System.out.println("Added into basket");
	}
}
class Jamoon extends Sweet{

	@Override
	public void color() {
		System.out.println("Brown");
		
	}
	
	@Override
	public void shape() {
		System.out.println("Round");
	}
	
}

class ChocoBiscut extends Sweet{

	@Override
	public void color() {
		System.out.println("Brown");
		
	}
	
	@Override
	public void shape() {
		System.out.println("Circle");
	}

}