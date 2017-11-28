package com.projecteuler.math.prime;

public class NThPrimeNumber {
	public static int calcualaeNthPrimeNumber(int n) {
		if (n <= 0) {
			return -1;
		}
		int current = 2;
		int currentPrimeIndex = 0;
		while (true) {
			if (isPrime(current)) {
				currentPrimeIndex++;
			}
			if (currentPrimeIndex == n) {
				return current;
			}
			current++;
		}
	}

	private static boolean isPrime(int number) {
		int divisibleCount = 1;
		for (int current = 2; current * current <= number; current++) {
			if (number % current == 0 && current != number) {
				divisibleCount++;
			}
		}
		return divisibleCount == 1;
	}

}
