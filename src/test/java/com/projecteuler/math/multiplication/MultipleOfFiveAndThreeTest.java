package com.projecteuler.math.multiplication;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MultipleOfFiveAndThreeTest {
	private MultipleOfFiveAndThree multipleOfFiveAndThree;

	@Before
	public void initialize() {
		this.multipleOfFiveAndThree = new MultipleOfFiveAndThree();
	}

	@Test
	public void testNumbers() {
		assertEquals(23l, multipleOfFiveAndThree.sumOfMultilpleOfFive(10));
		assertEquals(2318l, multipleOfFiveAndThree.sumOfMultilpleOfFive(100));
		assertEquals(233168l, multipleOfFiveAndThree.sumOfMultilpleOfFive(1000));
	}

}
