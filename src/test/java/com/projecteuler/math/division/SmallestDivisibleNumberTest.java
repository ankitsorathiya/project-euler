package com.projecteuler.math.division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestDivisibleNumberTest {

	@Test
	public void testSmallestDivisibleNumber() {
		SmallerstDivisableNumber smallerstDivisableNumber = new SmallerstDivisableNumber();
		int actual = smallerstDivisableNumber.findSmallestDivisableNumberInRange(10);
		assertEquals(2520, actual);
		actual = smallerstDivisableNumber.findSmallestDivisableNumberInRange(20);
		assertEquals(232792560, actual);
	}

}
