package com.projecteuler.math.path;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LatticePathTest {
	@Test
	public void testLatticePath() {
		assertEquals(6l, LatticePath.findLatticePath(2));
		assertEquals(20l, LatticePath.findLatticePath(3));
		assertEquals(137846528820l, LatticePath.findLatticePath(20));
	}
}
