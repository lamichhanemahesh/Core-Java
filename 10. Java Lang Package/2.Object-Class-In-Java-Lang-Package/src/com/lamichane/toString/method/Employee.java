package com.lamichane.toString.method;

public class Employee {
	
	String name;
	int roll;
	
	Employee(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public String toString() {
		return "[ Name = "+name+", Roll = "+roll+"]";
	}

}
