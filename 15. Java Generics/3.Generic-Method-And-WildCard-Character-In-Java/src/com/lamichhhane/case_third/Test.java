package com.lamichhhane.case_third;

import java.util.ArrayList;

public class Test {
	
	public static void m1(ArrayList<? extends Number> l){
		// we can't add anything to array list here except null
	}

	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Double> b = new ArrayList<Double>(); 
		// ArrayList<Student> c = new ArrayList<Student(); 
		m1(a); //valid
		m1(b); //valid
		// m1(c) //invalid

	}

}
