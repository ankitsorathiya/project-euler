package com.projecteuler.math.addition;

import java.math.BigDecimal;

public class PowerDigitSum {
	public static long find2sPowerDigitSum(long number) {
		BigDecimal bigDecimal = new BigDecimal(Math.pow(2, number));
		String charRepresentation = String.valueOf(bigDecimal);
		long sum = 0;
		for (int index = 0; index < charRepresentation.length(); index++) {
			sum += Character.getNumericValue(charRepresentation.charAt(index));
		}
		return sum;
	}
}
