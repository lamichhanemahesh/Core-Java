package com.lamichhhane.case_second;

import java.util.ArrayList;

public class Test {
	
	public static void m1(ArrayList<?> l){
		// here we can't add anything except null
		l.add(null);
	}

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<Double> b = new ArrayList<Double>();
		m1(a);
		m1(b);

	}

}
