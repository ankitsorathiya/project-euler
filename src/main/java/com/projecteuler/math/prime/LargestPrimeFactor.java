package com.projecteuler.math.prime;

public class LargestPrimeFactor {
	public int getLargestPrimeFactor(int number) {
		if (number <= 1) {
			return -1;
		}
		int[] primes = Prime.getPrimesInRange(number);
		return this.findLargestPrimeFactorFrom(primes, number);
	}

	private int findLargestPrimeFactorFrom(int[] primes, int number) {
		for (int primeIndex = primes.length - 1; primeIndex >= 0; primeIndex--) {
			if (primes[primeIndex] == 0 && number % primeIndex == 0) {
				return primeIndex;
			}
		}
		return -1;
	}

}
