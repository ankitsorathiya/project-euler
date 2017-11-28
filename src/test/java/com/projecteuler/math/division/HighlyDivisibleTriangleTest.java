package com.projecteuler.math.division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighlyDivisibleTriangleTest {

	@Test
	public void testHighlyDivisibleTriangle() {
		assertEquals(28l, HighlyDivisibleTriangle.FindNumberWhoHasMoreThanGivenDivisor(5));
		assertEquals(25200l, HighlyDivisibleTriangle.FindNumberWhoHasMoreThanGivenDivisor(50));
		assertEquals(73920l, HighlyDivisibleTriangle.FindNumberWhoHasMoreThanGivenDivisor(100));
		assertEquals(6l, HighlyDivisibleTriangle.FindNumberWhoHasMoreThanGivenDivisor(2));
	}

}
