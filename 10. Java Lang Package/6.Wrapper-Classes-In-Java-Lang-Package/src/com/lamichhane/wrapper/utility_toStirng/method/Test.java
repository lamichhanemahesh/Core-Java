package com.lamichhane.wrapper.utility_toStirng.method;

public class Test {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		String s = i.toString();
		System.out.println(s);
		
		String ss = Integer.toString(20);
		System.out.println(ss);
		
		String sss = Boolean.toString(true);
		System.out.println(sss);
		
		
		String sx = Integer.toString(15,2);
		System.out.println(sx);
		
		String sy = Integer.toBinaryString(15);
		System.out.println(sy);

		String sz = Integer.toOctalString(15);
		System.out.println(sz);
		
		String zo = Integer.toHexString(15);
		System.out.println(zo);

	}

}
