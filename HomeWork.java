package com.neotech.lesson03;

public class HomeWork {

	public static void main(String[] args) {

		// Write a Java program that will print a sum of two numbers Please use
		// variables to store num1,num2,and sum.
		int num1, num2;
		num1 = 66;
		num2 = 22;
		int sum = num1 + num2;
		System.out.println(sum);

		// Write a Java program to convert Fahrenheit to Celcius.
		int fah;
		fah = 65;
		System.out.println((fah - 32) * 5 / 9);

		// Write a Java program that converts mile to km.
		double mile;
		double km;
		mile = 1;
		km = mile * 1.609344;
		System.out.println(km);

		// Write a Java program that displays the area and perimeter of a circle that
		// has a radius of 5.5.
		double radius = 5.5;
		double pi = 3.16;
		double perimeter = 2 * radius * pi;
		double area = radius * radius * pi;
		System.out.println(perimeter);
		System.out.println(area);

		// Write a Java program that displays the area of a rectangle with a width of
		// 4.5 and a height of 7.9.
		double width = 4.5;
		double height = 7.9;
		area = width * height;

		System.out.println(area);

		// Write a Java program that calculates the average of 3 numbers.
		byte no1 = 10;
		byte no2 = 20;
		byte no3 = 30;
		int avrg = (no1 + no2 + no3) / 3;

		System.out.println(avrg);

		// Declare variable and increase by 100 using shorthand operator

		int num11 = 25;
		int num12 = 20;
		int num13 = 100;
		sum = num11 + num12;
		sum = sum + num13;
		System.out.println(sum);
		sum += 100;
		System.out.println(sum);

		// Declare variable and decrease by 67 using shorthand operator
		sum -= 67;
		System.out.println(sum);

		// Declare variable cakePiece=11 and divide cakePiecebetween 4 people
		int cakePie = 11;
		int people = 4;
		int cakePerPpl = cakePie / people;
		int leftOver = cakePie % people;
		System.out.println(cakePerPpl);
		System.out.println(leftOver);

		// Declare variable cakePiece=25 and divide cakePiecebetween 7 people

		cakePie = 25;
		people = 7;
		leftOver = cakePie %= people;
		System.out.println(leftOver);

	}

}
