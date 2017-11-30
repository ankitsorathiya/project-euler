package com.projecteuler.math.addition;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PowerDigitSumTest {
	private long twosPower;
	private long expected;

	public PowerDigitSumTest(long twosPower, long expected) {
		this.twosPower = twosPower;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(new Object[][] { { 15l, 26l }, { 1000l, 1366l } });
	}

	@Test
	public void testPowerSum() {
		assertEquals(expected, PowerDigitSum.find2sPowerDigitSum(twosPower));
	}
}
