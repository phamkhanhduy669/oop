// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int minRow = grid.length;
		int maxRow = -1;
		int minCol = grid[0].length;
		int maxCol = -1;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == ch) {
					if (row < minRow ) minRow = row;
					if (col < minCol ) minCol = col;
					if (row > maxRow ) maxRow = row;
					if (col > maxCol ) maxCol = col;
				}
			}
		}
		if (maxRow == -1 || maxCol == -1) return 0;

		return (maxRow - minRow + 1)*(maxCol- minCol + 1); // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int count = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if(isCenter(row,col)) count++;
			}
		}
		return count; // YOUR CODE HERE
	}
	private boolean isCenter(int row, int col) {
		char center = grid[row][col];
		int armLen = 1;

		while (row - armLen >= 0 && row + armLen < grid.length &&
				col - armLen >= 0 && col + armLen < grid[0].length && grid[row - armLen][col] == center &&
				grid[row + armLen][col] == center && grid[row][col - armLen] == center &&
				grid[row][col + armLen] == center ) {
			armLen++;

		}
		return armLen > 2;
	}
}
