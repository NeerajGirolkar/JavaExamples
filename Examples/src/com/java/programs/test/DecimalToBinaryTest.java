package com.java.programs.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.programs.main.DecimalToBinary;

public class DecimalToBinaryTest {
	private DecimalToBinary decimalToBinary;
	
	@Before
	public void init(){
		decimalToBinary = new DecimalToBinary();
	}
	

	@Test
	public void testDecimalToBinary56() {
		Assert.assertEquals("111000", decimalToBinary.convert(56));
	}
	
	@Test
	public void testDecimalToBinary99999() {
		Assert.assertEquals("11000011010011111", decimalToBinary.convert(99999));
	}
	
	@After
	public void cleanup(){
		decimalToBinary = null;
	}
}