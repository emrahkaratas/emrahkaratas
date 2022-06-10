package com.neotech.lesson03;

public class VariableValues {

	public static void main(String[] args) {
		byte a=5;
		short b =150;
		int c=2500;
		long d= 123456789123456L;
		float e	=	2.123456f;
		double f = 3.1234567789;
		boolean g = false;
		char h = 'h';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//*You can change values, and print using same name, and it will give you the new value from that point on.	
		a=6;
		b=250;
		c=15000;
		d=251;
		e=3.666f;
		f=2.4;
		g=true;
		h='g';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
				
		
	}

}
