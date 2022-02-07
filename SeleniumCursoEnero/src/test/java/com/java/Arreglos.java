package com.java;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arreglo Bidimensional
				String[][] nombres = new String[2][2];
				nombres[0][0] = "Ricardo";
				nombres[0][1] = "Adonai";
				nombres[1][0] = "Alejandro";
				nombres[1][1] = "Juan";
				
							
				for(int i =0; i<nombres.length; i++) {
					for (int j=0;j<nombres[i].length;j++) {
						System.out.println("El nombre en la posicion " + i + " , " + j+ " es "+ nombres[i][j]);
					}
					
				}

	}

}
