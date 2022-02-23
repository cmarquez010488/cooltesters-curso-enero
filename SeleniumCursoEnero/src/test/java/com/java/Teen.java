package com.java;

public class Teen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 22;
		int num2 = 23;
		int num3 = 34;
		
		System.out.println(hasTeen(num1,num2,num3));
		System.out.println(isTeen(num1));

	}
	
	public static boolean hasTeen(int num1, int num2, int num3) {
		boolean hasTeen = false;
		if ((num1 >= 13 && num1 <= 19)||(num2 >= 13 && num2 <= 19)||(num3 >= 13 && num3 <= 19)) {
			hasTeen = true;
		}
		return hasTeen;
	}
	
	public static boolean isTeen(int num1) {
		boolean isTeen = false;
		if(num1 >= 13 && num1 <= 19) {
			isTeen = true;
		}
		return isTeen;
	}

}
