package com.projecteuler.math.division;

public class SmallerstDivisableNumber {
	public int findSmallestDivisableNumberInRange(int range) {
		int start = 1;
		int end = range;
		int possibleNumber = range;
		while (true) {
			boolean divisibleByAll = true;
			for (int rangeStart = start; rangeStart < end; rangeStart++) {
				if (possibleNumber % rangeStart != 0) {
					divisibleByAll = false;
					break;
				}
			}
			if (divisibleByAll) {
				return possibleNumber;
			}
			possibleNumber++;
		}
	}
}
