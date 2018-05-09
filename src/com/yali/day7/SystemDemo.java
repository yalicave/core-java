package com.yali.day7;

import java.io.IOException;
import java.util.Date;

public class SystemDemo {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(new Date());
		runtime.exec("subl");
	}
}
