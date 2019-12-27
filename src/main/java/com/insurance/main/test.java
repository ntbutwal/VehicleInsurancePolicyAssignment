package com.insurance.main;

import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 6);
		Date date= cal.getTime();
		
		
		System.out.println(date);

	}

}
