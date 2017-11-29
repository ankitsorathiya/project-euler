package com.projecteuler.math.sequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCollatzChainTest {
	@Test
	public void testLongetstCollatzChain() {
		assertEquals(9, LongestCollatzChain.findStartingNumberWhoProducesLongestChainUnder(13));
		assertEquals(19, LongestCollatzChain.findStartingNumberWhoProducesLongestChainUnder(20));
	}
}
