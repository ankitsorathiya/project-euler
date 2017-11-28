package com.projecteuler.math.prime;

public class NThPrimeNumber {
	public static int calcualaeNthPrimeNumber(int n) {
		if (n <= 0) {
			return -1;
		}
		int current = 2;
		int currentPrimeIndex = 0;
		while (true) {
			if (Prime.isPrime(current)) {
				currentPrimeIndex++;
			}
			if (currentPrimeIndex == n) {
				return current;
			}
			current++;
		}
	}

}
