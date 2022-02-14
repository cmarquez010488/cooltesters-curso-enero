package com.java;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 26;
		boolean verano = false;
		System.out.println(isCatPlaying(verano,temperatura));
	}
	
	public static boolean isCatPlaying (boolean verano, int temperatura) {
		boolean isPlaying = false;
		if (verano == true) {
			if((temperatura>=25)&&(temperatura <=45)) {
				isPlaying=true;
			}
		}else if((temperatura>=25)&&(temperatura <=35)) {
					isPlaying = true;
				}
		
				
		return isPlaying;
		}
	
}
