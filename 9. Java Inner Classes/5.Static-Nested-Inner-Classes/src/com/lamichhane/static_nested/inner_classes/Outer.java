package com.lamichhane.static_nested.inner_classes;

public class Outer {
	
	static class Nested{
		public void m1() {
			System.out.println("Static Nested Inner Class Called");
		}
	}

	public static void main(String[] args) {
		
		Nested nested = new Nested();
		nested.m1();
	}

}
