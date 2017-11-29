package com.projecteuler.math.path;

public class LatticePath {
	public static int findLatticePath(int dimension) {
		int[][] grid = new int[dimension + 1][dimension + 1];
		initializeBoundry(grid, dimension + 1);
		return findLatticePath(grid, dimension);
	}

	private static int findLatticePath(int[][] grid, int dimension) {
		for (int row = dimension - 1; row >= 0; row--) {
			for (int col = dimension - 1; col >= 0; col--) {
				grid[row][col] = grid[row + 1][col] + grid[row][col + 1];
			}
		}
		return grid[0][0];
	}

	private static void initializeBoundry(int[][] grid, int size) {
		for (int row = size - 1; row >= 0; row--) {
			for (int col = size - 1; col >= 0; col--) {
				grid[size - 1][col] = 1;
				grid[row][size - 1] = 1;
			}
		}
	}
}
