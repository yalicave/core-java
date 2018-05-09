package com.yali.day19;

import java.io.IOException;
import java.util.Scanner;

public class CustomExceptionTester {

	public static void main(String[] args){
		Transaction t = new Transaction();
		int widrawlAmount =100;
		 
			 
				try(Scanner sc= new Scanner(System.in)) {
					t.canWidtraw(widrawlAmount);
				 
				} catch (InsufficientException e) {
					e.printStackTrace();
					 
				} catch(Exception e){
					System.err.println(	e.getMessage());
				}
					 
			 
		 
	}
}

class Transaction{
	
	int canWidtraw(int widrawlAmount) throws InsufficientException{
		int balance = 10;
		
		if(balance < widrawlAmount){
			InsufficientException ex = new InsufficientException("not able to widrawl the given amount.");
			throw ex;
		}
		return balance; 
	}
}