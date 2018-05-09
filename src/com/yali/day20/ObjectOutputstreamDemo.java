package com.yali.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputstreamDemo {

	public static void main(String[] args) {
		AccountDetails accDetails = new AccountDetails(2, "Minion1");
		try {
			FileOutputStream fos = new FileOutputStream("src/resource/AccountDetails.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(accDetails);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream is;
		try {
			is = new FileInputStream("src/resource/AccountDetails.ser");
			ObjectInputStream ois = new ObjectInputStream(is);
			AccountDetails emp = (AccountDetails) ois.readObject();
			System.out.println(emp);
			ois.close();
			is.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class AccountDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;
	private float salary;
	
	public AccountDetails(int age, String name, float salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public AccountDetails(int age, String name) {
		this(age,name,2.25F);
	}

	@Override
	public String toString() {
		return "AccountDetails [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
