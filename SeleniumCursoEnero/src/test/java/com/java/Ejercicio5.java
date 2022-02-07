package com.java;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a= scan.nextInt();
		
		if (a == 0) {
			System.out.println("Number is zero");
		}else {
			if(a < 0) {
				System.out.println("Numero es negativo");
			}else {
				if(a % 2 == 0) {
					System.out.println("Numero es par");
				}else {
					System.out.println("Numero es impar");
				}
			}
		}
	}

}
