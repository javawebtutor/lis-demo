package com.jwt.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LisTest {
	
	private Lis lis;
	
	@Before
	public void setup() {
		lis = new Lis();
	}

	@Test
	public void testLengthOfLIS_is_three() {
		int nums[] = {3, 10, 2, 11};
		int lengthOfLIS = lis.lengthOfLIS(nums);
		assertEquals(3, lengthOfLIS);
	}
	
	
	
	@Test
	public void testLengthOfLIS_is_five() {
		int nums[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
		int lengthOfLIS = lis.lengthOfLIS(nums);
		assertEquals(5, lengthOfLIS);
	}

}
