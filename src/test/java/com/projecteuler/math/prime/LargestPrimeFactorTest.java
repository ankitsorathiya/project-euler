package com.projecteuler.math.prime;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestPrimeFactorTest {
	private LargestPrimeFactor largestPrimeFactor = null;

	@Before
	public void initialize() {
		this.largestPrimeFactor = new LargestPrimeFactor();
	}

	@Test
	public void shouldProductLargestPrimeFactor() {
		assertEquals(29, largestPrimeFactor.getLargestPrimeFactor(13195));
		assertEquals(-1, largestPrimeFactor.getLargestPrimeFactor(0));
		assertEquals(-1, largestPrimeFactor.getLargestPrimeFactor(1));
		assertEquals(2, largestPrimeFactor.getLargestPrimeFactor(2));
		assertEquals(7, largestPrimeFactor.getLargestPrimeFactor(189));
	}

}
