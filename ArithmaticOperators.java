package com.neotech.lesson03;

public class ArithmaticOperators {

	public static void main(String[] args) {
		int num1, num2;
		num1= 25;
		num2= 5;
		int sum = num1+num2;
		int div= num1/num2;
		int mult = num1*num2;
		int sub = num1-num2;
		
		System.out.println(num1+num2);
		System.out.println("Sum:"+sum);
		System.out.println("Div " +div);
		System.out.println("Mult " +mult);
		System.out.println("Sub " +sub);
		
		double d1, d2;
		d1 = 27;
		d2 = 4;
		double div_doubles = d1/d2;
		double div_int = num1/num2;
		
		System.out.println(div_doubles);
		System.out.println(div_int);
		

	}

}
