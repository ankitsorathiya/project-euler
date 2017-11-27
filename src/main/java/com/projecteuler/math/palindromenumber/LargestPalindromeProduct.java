package com.projecteuler.math.palindromenumber;

public class LargestPalindromeProduct {
	public long findLargestPalindromeOfTwoDigitNumbersProduct() {
		return this.findLargestPalindromeOfProduct(99l, 10l);
	}

	public long findLargestPalindromeOfThreeDigitNumbersProduct() {
		return this.findLargestPalindromeOfProduct(999l, 100l);
	}

	public long findLargestPalindromeOfProduct(long range, long limit) {
		long first = range;
		long second = range;
		long maxProduct = Long.MIN_VALUE;
		for (long firstStart = first; firstStart >= limit; firstStart--) {
			for (long secondStart = second; secondStart >= limit; secondStart--) {
				long product = firstStart * secondStart;
				if (isPalindrome(product)) {
					if (maxProduct < product) {
						maxProduct = product;
					}
				}
			}
		}
		return maxProduct;

	}

	private boolean isPalindrome(long number) {
		String possiblePalindrome = String.valueOf(number);
		int start = 0;
		int end = possiblePalindrome.length() - 1;
		while (start < end) {
			if (possiblePalindrome.charAt(start) != possiblePalindrome.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
