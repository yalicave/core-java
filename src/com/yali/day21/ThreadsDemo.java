package com.yali.day21;

import java.util.Date;

public class ThreadsDemo {

	public static void main(String[] args) {
		CurrentDate currentDate = new CurrentDate();
		currentDate.show();
		
		CurrentDateThread currentDateThread = new CurrentDateThread();
		currentDateThread.start();
		System.out.println("Done");
		
	}

	static class CurrentDateThread extends Thread {

		@Override
		public void run() {
			show();
		}

		public void show() {
			new PrintDate().show();
		}

	}

	static  class CurrentDate {

		public void show() {
			new PrintDate().show();
		}

	}

	static class PrintDate {
		public void show() {
			System.out.println(new Date() + " Current thread name : " + Thread.currentThread().getName());
		}
	}
}