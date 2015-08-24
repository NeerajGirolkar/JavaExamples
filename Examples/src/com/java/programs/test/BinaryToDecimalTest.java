package com.java.programs.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.programs.main.BinaryToDecimal;

public class BinaryToDecimalTest {
	private BinaryToDecimal binaryToDecimal;
	
	@Before
	public void init(){
		binaryToDecimal = new BinaryToDecimal();
	}
	

	@Test
	public void testBinaryToDecimal56() {
		Assert.assertEquals(56, binaryToDecimal.convert(111000));
	}
	
	@Test
	public void testBinaryToDecimal139() {
		Assert.assertEquals(139, binaryToDecimal.convert(10001011));
	}
	
	@After
	public void cleanup(){
		binaryToDecimal = null;
	}
}