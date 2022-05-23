package com.lamichhane.current.date_time.with.uk.us.italy.style;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("US Style Dates");
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(0,0,Locale.US).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(1,1,Locale.US).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(2,2,Locale.US).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(3,3,Locale.US).format(new Date()));
		
		System.out.println();
		
		System.out.println("UK Style Dates");
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(0,0,Locale.UK).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(1,1,Locale.UK).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(2,2,Locale.UK).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(3,3,Locale.UK).format(new Date()));
		
		System.out.println();
		System.out.println("Italy Style Dates");
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(0,0,Locale.ITALY).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(1,1,Locale.ITALY).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(2,2,Locale.ITALY).format(new Date()));
		System.out.println("Full form is = "+DateFormat.getDateTimeInstance(3,3,Locale.ITALY).format(new Date()));
	}

}
