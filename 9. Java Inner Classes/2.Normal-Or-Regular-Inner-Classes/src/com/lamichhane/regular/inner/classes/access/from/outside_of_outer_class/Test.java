package com.lamichhane.regular.inner.classes.access.from.outside_of_outer_class;

public class Test {

	public static void main(String[] args) {
	
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		// we can also write
		// Outer.Inner i = new Outer().new Inner();
		//new Outer().new Inner().m1();

	}

}
