package com.java;

public class MegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kiloBytes = -2500;

		printMegaBytesAndKiloBytes(kiloBytes);
	}
	
	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
		int megaBytes = 0;
		int remainingKb = 0;
		if(kiloBytes <0) {
			System.out.println("Invalid Value");
			return;
		}
		megaBytes = kiloBytes/1024;
		remainingKb = kiloBytes % 1024;
		
		System.out.println(kiloBytes+" KB = " + megaBytes + " MB and "+ remainingKb + " KB");
		return;
	}

}
