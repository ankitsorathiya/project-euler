package com.projecteuler.math.addition;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SeriesVariationTest {
	private SeriesVariation seriesVariation;

	@Before
	public void initialize() {
		this.seriesVariation = new SeriesVariation();
	}

	@Test
	public void testSumOfOddNumbers() {
		assertEquals(25, seriesVariation.calculateSumOfAllOddInRange(10));
		assertEquals(372100, seriesVariation.calculateSumOfAllOddInRange(1220));
		assertEquals(902500, seriesVariation.calculateSumOfAllOddInRange(1899));
	}

	@Test
	public void testSumOfEvenNumbers() {
		assertEquals(30, seriesVariation.calculateSumOfAllEvenInRange(10));
		assertEquals(2550, seriesVariation.calculateSumOfAllEvenInRange(100));
		assertEquals(10100, seriesVariation.calculateSumOfAllEvenInRange(200));
		assertEquals(10100, seriesVariation.calculateSumOfAllEvenInRange(201));
	}
}
