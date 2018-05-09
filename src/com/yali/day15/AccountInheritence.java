package com.yali.day15;

public class AccountInheritence {

	public static void main(String[] args) {
		

	}

}

class User{
	String username;
	String password;
}

interface UserAccount{
	User getUser();
}

interface FreeAccount{
	void save();
	void view();
}

interface PremiumAccount{
	void save();
	void edit();
	void view();
	void delete();
}
interface TrailAccount extends PremiumAccount,FreeAccount{
	 
}

