package com.lamichhane.addIfAbsent.Method;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
	
		CopyOnWriteArrayList l  = new CopyOnWriteArrayList();
		l.add("A");
		l.add("A");
		l.addIfAbsent("B");
		l.addIfAbsent("B");
		System.out.println(l);

	}

}
