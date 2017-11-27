package com.projecteuler.math.palindromenumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestThreeDigitProductPalindromeTest {
	private LargestPalindromeProduct largestPalindromeProduct;

	@Before
	public void setUp() throws Exception {
		this.largestPalindromeProduct = new LargestPalindromeProduct();
	}

	@Test
	public void testLargestThreeDigitProductsPalindrome() {
		assertEquals(9009l, largestPalindromeProduct.findLargestPalindromeOfTwoDigitNumbersProduct());
		assertEquals(906609l, largestPalindromeProduct.findLargestPalindromeOfThreeDigitNumbersProduct());
	}

}
