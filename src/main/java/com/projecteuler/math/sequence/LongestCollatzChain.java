package com.projecteuler.math.sequence;

import java.util.HashMap;
import java.util.Map;

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
		int maxSequenceCount = Integer.MIN_VALUE;
		int sequenceStart = 1;
		Map<Integer, Integer> sequenceMap = new HashMap<>();
		while (sequenceStart < limit) {
			int currentSequenceCount = findSequenceCount(sequenceStart, false, sequenceMap);
			if (currentSequenceCount >= maxSequenceCount) {
				maxSequenceCount = currentSequenceCount;
				collartzNumber = sequenceStart;
			}
			sequenceStart++;
		}
		return collartzNumber;
	}

	private static int findSequenceCount(int sequenceStart, boolean shouldStopAtOne,
			Map<Integer, Integer> sequenceMap) {
		if (shouldStopAtOne && sequenceStart == 1) {
			return 1;
		}
		if (sequenceMap.containsKey(sequenceStart)) {
			return sequenceMap.get(sequenceStart);
		}
		int count = 1;
		if (sequenceStart % 2 == 0) {
			count += findSequenceCount(sequenceStart / 2, true, sequenceMap);
		} else {
			count += findSequenceCount((sequenceStart * 3) + 1, true, sequenceMap);
		}
		sequenceMap.put(sequenceStart, count);
		return count;
	}
}
