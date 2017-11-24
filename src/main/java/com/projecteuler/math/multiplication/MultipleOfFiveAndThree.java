package com.projecteuler.math.multiplication;

public class MultipleOfFiveAndThree {
	public long sumOfMultilpleOfFive(long range) {
		long result = 0;
		for (long number = 3; number < range; number += 3) {
			result += number;
		}
		for (long number = 5; number < range; number += 5) {
			if (number % 3 == 0) {
				continue;
			}
			result += number;
		}
		return result;
	}
}
