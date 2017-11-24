package com.projecteuler.math.fibonacci;

public class FibonacciVariation {
	public long sumOfEvenNumberInFibonacciRange(long range) {
		if (range < 2) {
			return 0;
		}
		long first = 1;
		long second = 2;
		long result = 0;
		while (second <= range) {
			if (second % 2 == 0) {
				result += second;
			}
			long third = first + second;
			first = second;
			second = third;
		}
		return result;
	}
}
