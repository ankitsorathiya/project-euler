package com.projecteuler.math.multiplication;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.projecteuler.math.fibonacci.FibonacciVariation;

public class FibonacciVariationTest {
	private FibonacciVariation fibVariation;

	@Before
	public void setUp() throws Exception {
		this.fibVariation = new FibonacciVariation();
	}

	@Test
	public void test() {
		assertEquals(0l, fibVariation.sumOfEvenNumberInFibonacciRange(0));
		assertEquals(0l, fibVariation.sumOfEvenNumberInFibonacciRange(1));
		assertEquals(2l, fibVariation.sumOfEvenNumberInFibonacciRange(2));
		assertEquals(44l, fibVariation.sumOfEvenNumberInFibonacciRange(100));
		assertEquals(798l, fibVariation.sumOfEvenNumberInFibonacciRange(1000));
		assertEquals(3382l, fibVariation.sumOfEvenNumberInFibonacciRange(10000));
	}

}
