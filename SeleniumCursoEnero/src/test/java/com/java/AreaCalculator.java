package com.java;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 5;
		double x = -1;
		double y = 4;
		
		System.out.println("The area of the circle is " + area(radius));
		System.out.println("The area of the rectangle is " + area(x,y));
	}
	
	public static double area (double radius) {
		double area = 0;
		if(radius>=0) {
			area = Math.PI * radius * radius;
		}
		else {
			area = -1.0;
		}
		return area;		
	}
	
	public static double area (double x, double y) {
		double area = 0;
		if (x >= 0 && y >= 0) {
			area = x * y;
		}else {
			area = -1.0;
		}
		return area;
	}
	

}
