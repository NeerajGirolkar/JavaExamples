package com.java.programs.main;

/**
 * @author neeraj_girolkar
 * * GCD - The largest positive integer that divides the 2 numbers without a remainder.
 * E.g. gcd(54, 24) is 6
 * --------------------------------------------------------------------------------------
 * Steps to find GCD - Method 1 - Manual Method
 * a) 54 = 2 x 3 x 3 x 3
 * b) 24 = 2 x 2 x 2 x 3
 * c) Find out the common numbers and multiply them. It is the GCD.
 *    GCD = 2 x 3 = 6
 * --------------------------------------------------------------------------------------
 * Steps to find GCD - Method 2 - Euler's Method
 * a) Divide the larger number (dividend) by smaller number (divisor).
 * b) If remainder is 0, then the smaller number (divisor) is the GCD.
 * c) If the remainder is not 0, then divide the smaller number by remainder and follow step (b).
 * d) E.g. gcd(25, 15) = 5
 * 1. 25 / 15 gives remainder = 10. Since remainder != 0, follow the loop.
 * 2. 15 / 10 gives remainder = 5. Since remainder != 0, follow the loop.
 * 3. 10 / 5 gives remainder = 0. So, gcd(25, 15) = 5.
 * --------------------------------------------------------------------------------------
 * E.g. 40 / 8 = 5
 * 40 = Dividend
 * 8 = Divisor
 * 5 = Quotient
 * 		Quotient
 * 	     -----------------------	
 * Divisor |	Dividend
 * ---------------------------------
 * 		Reminder
 *
 */

public class GcdEuclid {
	private int dividend;
	private int divisior;
	private int reminder;
	
	public int calculateGcd(int num1, int num2) {
		if(num1 > num2) {
			dividend = num1;
			divisior = num2;
		} else {
			dividend = num2;
			divisior = num1;
		}
		do{
			reminder = dividend % divisior;
			dividend = divisior;
			divisior = reminder;
		} while (reminder != 0);
		System.out.println("GCD of " + num1 + "  and " + num2 + " is " + dividend);
		return dividend;
	}
	
	public static void main(String[] args) {
		GcdEuclid euclid = new GcdEuclid();
		euclid.calculateGcd(60, 24);
		euclid.calculateGcd(15, 25);
		euclid.calculateGcd(5, 8);
		euclid.calculateGcd(15, 5);
	}
}