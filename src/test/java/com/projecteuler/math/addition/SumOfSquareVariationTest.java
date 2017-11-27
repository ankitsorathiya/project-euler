package com.projecteuler.math.addition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfSquareVariationTest {

	@Test
	public void testDifferenceBetweenSumOfSquareAndSquareOfSumOfRange() {
		SumOfSquareVariation sumOfSquareVariation = new SumOfSquareVariation();
		assertEquals(2640, sumOfSquareVariation.findDiffBetweenSumOfSquareAndSqareOfSumInRange(10));
		assertEquals(25164150, sumOfSquareVariation.findDiffBetweenSumOfSquareAndSqareOfSumInRange(100));
	}


}
