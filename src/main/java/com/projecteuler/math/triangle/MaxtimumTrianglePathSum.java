package com.projecteuler.math.triangle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class MaxtimumTrianglePathSum {
	public static int findMaximumTriangleSumPath(String[] triangle) {
		TriangleNode root = buildTriangleTree(triangle);
		int[] maxSum = new int[1];
		findMaximumTriangleSumPath(root, 0, maxSum);
		return maxSum[0];
	}

	private static void findMaximumTriangleSumPath(TriangleNode root, int currentSum, int[] maxSum) {
		if (root == null) {
			if (maxSum[0] < currentSum) {
				maxSum[0] = currentSum;
			}
			return;
		}
		currentSum += root.getValue();
		findMaximumTriangleSumPath(root.getLeftChild(), currentSum, maxSum);
		findMaximumTriangleSumPath(root.getRightChild(), currentSum, maxSum);
	}

	private static TriangleNode buildTriangleTree(String[] triangle) {
		if (triangle == null || triangle.length == 0) {
			return new TriangleNode(-1);
		}
		int rootValue = Integer.parseInt(triangle[0]);
		TriangleNode root = new TriangleNode(rootValue);
		Queue<TriangleNode> parents = new LinkedList<>();
		parents.add(root);
		for (int index = 1; index < triangle.length; index++) {
			int[] currentDepthNodes = convertToInts(triangle[index].split(" "));
			Queue<TriangleNode> goingToBeParents = new LinkedList<>();
			TriangleNode commonChild = null;
			int nodeIndex = 0;
			while (!parents.isEmpty() && nodeIndex < currentDepthNodes.length) {
				TriangleNode node = parents.poll();
				TriangleNode leftChild = null;
				if (commonChild != null) {
					leftChild = commonChild;
				} else {
					leftChild = new TriangleNode(currentDepthNodes[nodeIndex]);
					goingToBeParents.add(leftChild);
				}
				TriangleNode rightChild = new TriangleNode(currentDepthNodes[nodeIndex + 1]);
				node.setLeftChild(leftChild);
				node.setRightChild(rightChild);
				commonChild = rightChild;
				goingToBeParents.add(rightChild);
				nodeIndex++;
			}
			parents = goingToBeParents;
		}

		return root;
	}

	private static int[] convertToInts(String[] values) {
		return Stream.of(values).mapToInt(Integer::parseInt).toArray();
	}
}

class TriangleNode {
	private final int value;
	private TriangleNode leftChild;
	private TriangleNode rightChild;

	public TriangleNode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public TriangleNode getLeftChild() {
		return leftChild;
	}

	public TriangleNode getRightChild() {
		return rightChild;
	}

	public void setLeftChild(TriangleNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(TriangleNode rightChild) {
		this.rightChild = rightChild;
	}

}