package com.lamichhane.demo;
class Student{

}
public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Object Created For="+o.getClass().getName());
		
		

	}

}
