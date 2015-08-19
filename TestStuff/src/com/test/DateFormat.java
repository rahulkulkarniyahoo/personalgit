package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

	public static void main(String[] args) {
		String PATTERN="dd/MM/yyyy";
		SimpleDateFormat dateFormat=new SimpleDateFormat();
		dateFormat.applyPattern(PATTERN);
		System.out.println(dateFormat.format(Calendar.getInstance().getTime()));

	}

}
