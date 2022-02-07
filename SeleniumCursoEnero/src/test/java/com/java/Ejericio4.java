package com.java;
import java.util.Random;

import org.apache.poi.util.SystemOutLogger;

public class Ejericio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		double var1= rand.nextDouble()*10;
		double var2= rand.nextDouble()*10;
		
		System.out.println("Los valores son var1 = " + var1 + " var2 = "+var2);
		
		if (var1 == var2) {
			System.out.println("var1 y var2 son iguales");
		}else {
			if(var1>var2) {
				System.out.println("var1 es mayor");
			}
			else {
				System.out.println("var2 es mayor");
			}
		}

	}

}
