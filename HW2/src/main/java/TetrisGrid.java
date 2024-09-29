//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid =grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int width = grid.length;
		int height = grid[0].length;
		int newRows = 0;
		boolean[][] newGrid = new boolean[width][height];

		for (int y = 0; y < height; y++) {
			boolean fullRow = true;
			for (int x = 0; x < width; x++) {
				if (!grid[x][y]) {
					fullRow = false;
					break;
				}
			}

			if (!fullRow) {
				for (int x = 0; x < width; x++) {
					newGrid[x][newRows] = grid[x][y];
				}
				newRows++;
			}

		}
		grid = newGrid;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {

		return grid; // YOUR CODE HERE
	}
}
