package com.java.programs.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.programs.main.DuplicateNumbersInArray;

public class DuplicateNumbersArrayTest {
	private DuplicateNumbersInArray duplicateNumbersArray;
	private int[] testArray;
	
	@Before
	public void init(){
		duplicateNumbersArray = new DuplicateNumbersInArray();
		testArray = new int[] {4, 3, 6, 8, 8, 3, 5, 4};
	}
	
	@Test
	public void testBruteForce(){
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(4);
		expected.add(3);
		expected.add(8);
		Assert.assertTrue(expected.equals(duplicateNumbersArray.bruteForce(testArray)));
	}
	
	@Test
	public void testSortAndCompare(){
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(4);
		expected.add(8);
		Assert.assertTrue(expected.equals(duplicateNumbersArray.sortAndCompare(testArray)));
	}
	
	@Test
	public void testUseHashSet(){
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(8);
		expected.add(3);
		expected.add(4);
		Assert.assertTrue(expected.equals(duplicateNumbersArray.useHashSet(testArray)));
	}
	
	@After
	public void shutdown(){
		duplicateNumbersArray = null;
		testArray = null;
	}
}
