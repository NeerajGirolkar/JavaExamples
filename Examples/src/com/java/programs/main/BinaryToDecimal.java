package com.java.programs.main;

public class BinaryToDecimal {
	private int decimal;
	private int reminder;
	private int i;
	
	public int convert(int number){
		while(number != 0){
			reminder = number % 10;
			number = number/10;
			decimal = (int) (decimal + reminder * Math.pow(2, i));
			i++;
		}
		return decimal;
	}
}