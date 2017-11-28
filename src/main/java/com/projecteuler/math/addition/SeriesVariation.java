package com.projecteuler.math.addition;

public class SeriesVariation {
	public int calculateSumOfAllOddInRange(int range) {
		range = range % 2 == 0 ? range - 1 : range;
		double halfNumbers = ((double) range) / 2;
		double noOfOdds = Math.ceil(halfNumbers);
		double result = noOfOdds * (range + 1);
		return (int) Math.floor(result / 2);
	}

	public int calculateSumOfAllEvenInRange(int range) {
		range = range % 2 == 0 ? range : range - 1;
		double halfNumbers = ((double) range) / 2;
		double noOfEven = Math.ceil(halfNumbers);
		double result = noOfEven * (range + 2);
		return (int) Math.floor(result / 2);
	}
}
