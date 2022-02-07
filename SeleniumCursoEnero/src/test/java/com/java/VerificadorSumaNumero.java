package com.java;

public class VerificadorSumaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =1;
		int num2 =1;
		int num3 =2;
		if(hasEqualSum(num1,num2,num3)==true) {
			System.out.println("Suma es Igual");
		}else {
			System.out.println("Suma no es igual");
		}
	}
	
	public static boolean hasEqualSum(int num1, int num2, int num3) {
		int sum = num1+num2;
		boolean flag = false;
		if(sum ==num3) {
			flag = true;
		}
		return flag;
	}

}
