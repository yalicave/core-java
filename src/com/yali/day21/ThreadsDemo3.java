package com.yali.day21;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThreadsDemo3 {
	static List<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new CurrentDateThread());
			thread.start();
			// thread.join();
		}
		while (numbers.size() != 100) {
			Runnable r = new Runnable() {
				@Override
				public void run() {
				 
						System.out.println(numbers);
					 

				}
			};
			Thread t = new Thread(r);
			t.start();

		}
	}

	static class CurrentDateThread implements Runnable, Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void run() {

			try {
				Thread.sleep(1000);
				show();

			} catch (InterruptedException e) { // TODO Auto-generated catch
				e.printStackTrace();
			}

		}

		public void show() {
			new PrintDate().show();
		}

	}

	static class CurrentDate {

		public void show() {
			new PrintDate().show();
		}

	}

	static class PrintDate {
		public  void  show() {
			Date d = new Date();
			synchronized(numbers){
				numbers.add(d.getMinutes());
				System.out.println(numbers.size());
			}
			// System.out.println( d + "Current thread name : " +
			// Thread.currentThread().getName());
		}
	}
	
}