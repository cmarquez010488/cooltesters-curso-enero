package com.java;

public class NumeroDiasMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 400;
		int month = 2;
		System.out.println(isLeapYear(year));
		System.out.println("The given month for the given year has " + getDaysInMonth(month, year) + " days");

	}
	
	public static boolean isLeapYear (int year) {
		boolean leap = false;
		if (year >=1 && year <=9999) {
			if ((year % 4 == 0) && (year%100 != 0)||(year % 400 == 0)) {
				System.out.println("Year has 366 days");
				leap = true;
			}else {
				System.out.println("Year has 365 days");
			}
			
		}
		return leap;
	}
	
	public static int getDaysInMonth (int month, int year) {
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:			
			days = 31;
			break;
		case 2:		
			days= 28;
			if (isLeapYear(year)==true) {
				days = 29;
			}
			break;
		case 4:
		case 6:
		case 9:
			days = 30;
			break;
		}
		return days;
	}

}
