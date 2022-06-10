package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		String language ="Java";
		
		System.out.println("I love "+language+" Programming");
		
		String s1 = "I love ";
		String s2	= " Programming";
		System.out.println(s1+language+s2);
				
		
		//Spacing in strings
		
		System.out.println("I have "+2+4+" apples"); //if not in parantesis it will not do the math
		System.out.println("I have " +(2+4)+ " apples"); //in paranthesis, it does the math

	}

}
