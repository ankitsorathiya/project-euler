package com.projecteuler.math.addition;

/**
 * 
 * Problem Definition:The sum of the squares of the first ten natural numbers
 * is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025 −
 * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * formulas
 * 
 * 1. sum of square of n numbers= n(n+1)(2n+1)/6
 * 
 * 2. sum of n numbers =n(n+1)/2
 */
public class SumOfSquareVariation {

	public int findDiffBetweenSumOfSquareAndSqareOfSumInRange(int range) {
		return this.findSquareOfSumOfRange(range) - this.findSumOfSquaresOfRange(range);
	}

	private int findSumOfSquaresOfRange(int range) {
		int result = range * (range + 1) * (2 * range + 1);
		return result / 6;
	}

	private int findSquareOfSumOfRange(int range) {
		int result = range * (range + 1);
		result = result / 2;
		return (int) Math.pow(result, 2);
	}
}
