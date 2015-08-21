package com.java.programs;

/**
 * @author neeraj_girolkar
 * 
 * 			|  Quotient
 * ---------------------
 * Divisor	|  Dividend
 * ---------------------
 * 			|  Reminder
 * 
 * 2  |  56  |  0	^
 * ---------------	|
 * 2  |  28  |  0	|
 * ---------------	|
 * 2  |  14  |  0	|
 * ---------------	|
 * 2  |  7   |  1	|
 * ---------------	|
 * 2  |  3   |  1	|
 * ---------------	|
 * 2  |  1   |  1	|
 * ---------------	|
 * 	  |  0   |  	|
 * ---------------	|
 *
 */
public class DecimalToBinary {
	private String binary = "";
	private int reminder;
	private int quotient;
	
	public String convert(int decimal){
		while(decimal != 1){
			reminder = decimal % 2;
			quotient = decimal / 2;
			decimal = quotient;
			binary += reminder;
		}
		binary += decimal;
		return reverse(binary);
	}
	
	private String reverse(String item){
		String reversedString = "";
		int length = item.length();
		for(int i = length - 1; i >= 0; i--){
			reversedString += item.charAt(i);
		}
		return reversedString;
	}
}