package com.neotech.lesson03;

public class HomeWork2 {

	public static void main(String[] args) {
	

		// 1. Write a java program to display the area and perimeter of a circle that
		// has a radius of 5. Use pi = 3.

		double radius = 5;
		double pi = 3;
		double perimeter = 2 * radius * pi;
		double area = radius * radius * pi;
		System.out.println(perimeter);
		System.out.println(area);

		// 2. Write a java program that converts mile to km and km to miles.
		// Use scale 1 mile = 1.609344.

		double km = 1;
		double mile = 1.609344;
		double kmtoMile = km /= mile;
		System.out.println(10*kmtoMile);

		mile = 1;
		km = 0.621371;
		double miletoKm = mile /= km;
		System.out.println(20 * miletoKm);

	}

}
