package com.lamichhane.without.generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		list.add("durga");
		list.add("ravi");
		list.add(new Integer(10));
		
		String s1 = (String)list.get(0);
		String s2 = (String)list.get(1);
		//String s3 = (String)list.get(2);
		//RE:ClassCastException 
		
		System.out.println(s1);
		System.out.println(s2);
		// System.out.println(s3);

	}

}
