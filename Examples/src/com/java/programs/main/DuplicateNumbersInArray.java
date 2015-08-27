package com.java.programs.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class DuplicateNumbersInArray {
	
	public List<Integer> bruteForce(final int[] numbers){
		List<Integer> duplicates = new ArrayList<Integer>();
		int length = numbers.length;
		for(int i = 0; i < length; i++){
			for(int j = i; j < length; j++){
				if((numbers[j] == numbers[i]) && i != j){
					duplicates.add(numbers[j]);
				}
			}
		}
		return duplicates;
	}
	
	public List<Integer> sortAndCompare(final int[] numbers){
		List<Integer> duplicates = new ArrayList<Integer>();
		Arrays.sort(numbers);
		int length = numbers.length;
		for(int i = 0; i < length - 1; i++){
			if(numbers[i + 1] == numbers[i]){
				duplicates.add(numbers[i + 1]);
			}
		}
		return duplicates;
	}
	
	public List<Integer> useHashSet(final int[] numbers){
		List<Integer> duplicates = new ArrayList<Integer>();
		Set<Integer> uniqueSet = new HashSet<Integer>();
		int length = numbers.length;
		for(int i = 0; i < length; i++){
			if(!uniqueSet.add(numbers[i])){
				duplicates.add(numbers[i]);
			}
		}		
		return duplicates;
	}
}
