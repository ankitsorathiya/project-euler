package com.projecteuler.math.sequence;

/**
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 It can be seen that this sequence
 * (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 */
public class LongestCollatzChain {
	public static int findStartingNumberWhoProducesLongestChainUnder(int limit) {
		int collartzNumber = Integer.MIN_VALUE;
		int sequenceCount = Integer.MIN_VALUE;
		int currentNumber = 1;
		while (currentNumber < limit) {
			int sequenceStart = currentNumber;
			int currentSequence = 1;
			while (true) {
				if (sequenceStart % 2 == 0) {
					sequenceStart /= 2;
				} else {
					sequenceStart = (sequenceStart * 3) + 1;
				}
				currentSequence++;
				if (sequenceStart == 1) {
					break;
				}
			}
			if (currentSequence > sequenceCount) {
				sequenceCount = currentSequence;
				collartzNumber = currentNumber;
			}
			currentNumber++;
		}
		return collartzNumber;
	}
}
