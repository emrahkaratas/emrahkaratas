package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {
		// Modulus (%) - remainder in division
		
		int a= 25;
		int b= 4;
		int div, remainder;
		
		div= 25/4; //25/4 --> 6 (lost whateer is after decimal point)
		remainder= a%b; //checks if 25 is fully divisible
		System.out.println(div);
		System.out.println(remainder);
		
		int c=13;
		int d= 5;
		int rem= c%d;
		System.out.println(rem);
		
		double d1, d2;
		d1= 3.567;
		d2= 4.345;
		double d3= d1/d2;
		System.out.println(d3);
		
		
				
				

	}

}
