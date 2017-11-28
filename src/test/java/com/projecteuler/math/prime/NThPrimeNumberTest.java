package com.projecteuler.math.prime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NThPrimeNumberTest {
	@Test
	public void testNthPrime() {
		assertEquals(13, NThPrimeNumber.calcualaeNthPrimeNumber(6));
		assertEquals(104743, NThPrimeNumber.calcualaeNthPrimeNumber(10001));
		assertEquals(29, NThPrimeNumber.calcualaeNthPrimeNumber(10));
		assertEquals(2, NThPrimeNumber.calcualaeNthPrimeNumber(1));
		assertEquals(-1, NThPrimeNumber.calcualaeNthPrimeNumber(0));
		assertEquals(-1, NThPrimeNumber.calcualaeNthPrimeNumber(-1));
		assertEquals(47, NThPrimeNumber.calcualaeNthPrimeNumber(15));
	}
}
