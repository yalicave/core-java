package com.yali.day7;

public class StudentMain {
	public static void main(String[] args) {
		//StudentMarkSheet sms = new StudentMarkSheet(0,"Arya",100,38);
		
		//sms.isPassed();
	}
}

class StudentMarkSheet {
	int id = 0;
	String name = null;
	int englishMark = 0;
	int tamilMark = 0;
	
	public StudentMarkSheet(int id, String name, int englishMark, int tamilMark) {
		this.id = id;
		this.name = name;
		this.englishMark = englishMark;
		this.tamilMark = tamilMark;
	}

	public StudentMarkSheet(String name, int englishMark, int tamilMark) {
		 this(0,name,englishMark,tamilMark);
	}


	public void isPassed() {
		if (englishMark >= 35 && tamilMark >= 36) {
			System.out.println(name + " is Passed");
		} else {
			System.out.println(name + "is Failed");
		}
	}
}