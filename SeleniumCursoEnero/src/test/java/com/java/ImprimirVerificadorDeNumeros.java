package com.java;

public class ImprimirVerificadorDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=1;
		int num3=2;
		
		imprimirVerificadorNumeros(num1,num2,num3);
	}
	
	public static void imprimirVerificadorNumeros (int num1, int num2, int num3) {
		if((num1<0)||(num2<0)||(num3<0)) {
			System.out.println("Valor no valido");
		}else {
			if((num1==num2)&&(num2==num3)) {
				System.out.println("Todos los numeros son iguales");
			}else {
				if((num1!=num2)&&(num1!=num3)&&(num2!=num3)) {
					System.out.println("Todos los numeros son diferentes");
				}else {
					System.out.println("Ni todos son iguales, ni todos son diferentes");
				}
			}
		}
	}

}
