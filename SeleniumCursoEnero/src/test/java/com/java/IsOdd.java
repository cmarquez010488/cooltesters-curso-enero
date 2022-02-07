package com.java;

public class IsOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 26;
		int start = 100;
		int end = 1000;
		
		if(isOdd(number)==true) {
			System.out.println("Was Odd");
		} else {
			System.out.println("Was Even");
		}
		
		System.out.println("Sum is "+sumOdd(start,end));
		
	}
	public static boolean isOdd(int number) {
		boolean flag = false;
		if (number > 0) {
			if(number %2 ==0) {
				flag =  false;				
			}else {
				flag = true;
		}
	}
		return flag;
	}
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if((end<start)||(start<0)||(end<0)) {
			sum = -1;
		}else {
			for (int i = start;i<=end;i++) {
				if(isOdd(i)) {
					sum = sum+i;
				}
			}
			
		}
		return sum;
	}
}
