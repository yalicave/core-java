package com.yali.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date newDate;
		try {
			newDate = sdf.parse("12-12-2012");
			out.println(d.after(newDate)); //is d after newDate or not?
			out.println(d);
			SimpleDateFormat onlyYear = new SimpleDateFormat("yyyy");
			String s = onlyYear.format(d);
			out.println(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}
