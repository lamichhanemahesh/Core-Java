package com.lamichhane.hashCode.method;

public class Employee {
	
	String name;
	int roll;
	
	public int hashCode() {
		return roll;
	}
	
	Employee(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public String toString() {
		return "[ Name = "+name+", Roll = "+roll+"]";
	}

}
