package com.projecteuler.math.prime;

public class Prime {
	public static int[] getPrimesInRange(int number) {
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

	public static boolean isPrime(int number) {
		int divisibleCount = 1;
		for (int current = 2; current * current <= number; current++) {
			if (number % current == 0 && current != number) {
				divisibleCount++;
			}
		}
		return divisibleCount == 1;
	}
}
