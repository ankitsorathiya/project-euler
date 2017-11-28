package com.projecteuler.math.prime;

public class PrimeSum {
	public static int calculateSumOfPrimesInRange(int range) {
		int[] primes = Prime.getPrimesInRange(range);
		int primeSum = 0;
		for (int currentPrime = 2; currentPrime < primes.length; currentPrime++) {
			if (primes[currentPrime] == 0) {
				primeSum += currentPrime;
			}
		}
		return primeSum;
	}
}
