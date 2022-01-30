package com.java;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random rand = new Random();
		
		double var1= rand.nextDouble()*10;
		double var2= rand.nextDouble()*10;
		double var3= rand.nextDouble()*10; 

		double suma = var1 + var2 + var3;
		double resta = var1 - var2 - var3;
		double multi = var1 * var2 * var3;
		double div = var1 / var2 / var3;
		
		System.out.println("Los numeros fueron: var1=" + var1 + " var2= " + var2+ " y var3= "+var3);
		System.out.println("Esta es la suma "+suma);
		System.out.println("Esta es la resta "+resta);
		System.out.println("Esta es la multiplicacion "+multi);
		System.out.println("Esta es la division "+ div);
	}	

}
