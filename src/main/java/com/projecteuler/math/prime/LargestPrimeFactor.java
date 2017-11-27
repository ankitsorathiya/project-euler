package com.projecteuler.math.prime;

public class LargestPrimeFactor {
	public int getLargestPrimeFactor(int number) {
		if (number <= 1) {
			return -1;
		}
		int[] primes = this.getPrimesInRange(number);
		return this.findLargestPrimeFactorFrom(primes, number);
	}

	private int[] getPrimesInRange(int number) {
		int[] primes = new int[number + 1];
		for (int currentNumber = 2; currentNumber < primes.length; currentNumber++) {
			int multipleOfNumber = currentNumber * 2;
			while (multipleOfNumber < primes.length) {
				primes[multipleOfNumber] = -1;// not a prime
				multipleOfNumber = multipleOfNumber + currentNumber;
			}
		}
		return primes;
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
