package com.projecteuler.math.prime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeSumTest {
	@Test
	public void testPrimeSumInRange() {
		assertEquals(17, PrimeSum.calculateSumOfPrimesInRange(10));
		assertEquals(28, PrimeSum.calculateSumOfPrimesInRange(11));
	}
}
