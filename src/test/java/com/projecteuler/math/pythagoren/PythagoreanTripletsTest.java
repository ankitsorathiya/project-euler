package com.projecteuler.math.pythagoren;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PythagoreanTripletsTest {
	@Test
	public void testPyathagoreanTriplet() {
		assertEquals(31875000, PythagoreanTriplets.findProductOfPythagoreanTriplet(1000));
	}
}
