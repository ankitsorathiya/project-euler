package com.projecteuler.math.pythagoren;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a2 + b2 = c2 For example, (3)2 + (4)2 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 *
 */
public class PythagoreanTriplets {
	public static int findProductOfPythagoreanTriplet(int sumOfABC) {
		int a, b, c;
		for (c = 1; c < sumOfABC; c++) {
			for (b = 1; b < c; b++) {
				for (a = 1; a < b; a++) {
					int sum = a + b + c;
					if (sum == sumOfABC) {
						int aSquare = (int) Math.pow(a, 2);
						int bSquare = (int) Math.pow(b, 2);
						int cSquare = (int) Math.pow(c, 2);
						if ((aSquare + bSquare) == cSquare) {
							return a * b * c;
						}
					}
				}
			}
		}
		return -1;
	}
}
