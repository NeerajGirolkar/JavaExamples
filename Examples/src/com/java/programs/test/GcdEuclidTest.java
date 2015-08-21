package com.java.programs.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.programs.main.GcdEuclid;

public class GcdEuclidTest {
	private GcdEuclid euclid;
	
	@Before
	public void init(){
		euclid = new GcdEuclid();
	}
	

	@Test
	public void testGcdEuclid() {
		Assert.assertEquals(12, euclid.calculateGcd(60, 24));
		Assert.assertEquals(5,  euclid.calculateGcd(15, 25));
		Assert.assertEquals(1,  euclid.calculateGcd(5,  8));
		Assert.assertEquals(5,  euclid.calculateGcd(15, 5));
	}
	
	@After
	public void cleanup(){
		euclid = null;
	}
}