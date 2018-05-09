package com.yali.day21;

import java.io.Serializable;
import java.util.Date;

public class ThreadsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * CurrentDate currentDate = new CurrentDate(); currentDate.show();
		 */

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new CurrentDateThread());
			thread.start();
			//thread.interrupt();
			thread.join();
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
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
		public void show() {
			System.out.println(new Date() + " Current thread name : " + Thread.currentThread().getName());
		}
	}
}