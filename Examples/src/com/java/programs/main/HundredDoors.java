package com.java.programs.main;

/**
 * @author neeraj_girolkar
 * 
 *  You have 100 doors in a row that are all initially closed. 
 *  You make 100 passes by the doors starting with the first door every time.
 *  The first time through you visit every door and toggle the door (if the door is closed, you open it, if it’s open, you close it).
 *  The second time you only visit every 2nd door (door #2, #4, #6).
 *  The third time, every 3rd door (door #3, #6, #9), etc.
 *  Until you only visit the 100th door.
 *  
 *  Question: what state are the doors in after the last pass? Which are open which are closed?
 *  
 *  Solution 1: Write 2 for loops: First loop will indicate the pass (or runs) from 1 to 100.
 *  Inner for loop indicates the door number.
 *  
 *  Toggle the state of door if the door is visited by the pass.
 *  
 *  If door number is divisible by the pass number that is being run, it indicates that the door will be visited by the pass.
 *  
 *  E.g. Door No. 42 will be visited during following passes: 1, 2, 3, 6, 7, 14, 21, 42.
 *  
 *  Solution 2: Only the doors which are perfect squares will be open.
 *  
 *  Reason: Only the perfect squares have odd number of divisors.
 *  All the other numbers except perfect squares have even number of divisors.
 *  If the divisors are even numbered, then consecutive number pair reverts the state of the door back to original.
 *  
 *  E.g. divisors(16) = 1, 2, 4, 8, 16 = O, C, O, C, O = End State: Open
 *  divisors(42) = 1, 2, 3, 6, 7, 14, 21, 42 = O, C, O, C, O, C, O, C = End State: Closed
 *
 */

public class HundredDoors {
	public static void main(String[] args) {
		boolean[] doors = new boolean[101];
		for (int pass = 1; pass <= 100; pass++) {
			for (int door = pass; door <= 100; door++) {
				if (door % pass == 0) {
					doors[door] = !doors[door];
				}
			}
		}
		for (int i = 1; i <= 100; i++) {
			System.out.printf("Door %d: %s%n", i, doors[i] ? "open" : "closed");
		}
	}
}
