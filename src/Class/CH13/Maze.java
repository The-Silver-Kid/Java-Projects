package Class.CH13;

/**
 * Attempts to find a path through a maze.
 */
public class Maze {
	private char[][] maze;
	private int width;
	private int height;
	private String path;

	/**
	 * Create a maze searcher.
	 *
	 * @param aMaze
	 *            character array representation of maze
	 */
	public Maze(char[][] aMaze) {
		maze = aMaze;
		width = maze[0].length;
		height = maze.length;
		path = "";
	}

	/**
	 * Find an escape path.
	 *
	 * @param i
	 *            row position Y
	 * @param j
	 *            column position X
	 * @return if escape is possible
	 */
	public boolean escape(int i, int j) {

		int dir = 0, y = i, x = j;
		System.out.println("Starting at : (" + j + "," + i + ")");
		while (!isExit(y, x)) {

			if (dir == 0) {
				if (maze[x][y - 1] == '*') {
					dir = 1;
				} else {
					System.out.println("Up from : (" + x + "," + y + ")");
					path = path + "Up\n";
					y = y - 1;
				}
			}
			if (dir == 1) {
				if (maze[x + 1][y] == '*') {
					dir = 2;
				} else {
					System.out.println("Right from : (" + x + "," + y + ")");
					path = path + "Right\n";
					x = x + 1;
				}
			}
			if (dir == 2) {
				if (maze[x][y + 1] == '*') {
					dir = 3;
				} else {
					System.out.println("Down from : (" + x + "," + y + ")");
					path = path + "Down\n";
					y = y + 1;
				}
			}
			if (dir == 3) {
				if (maze[x - 1][y] == '*') {
					dir = 0;
				} else {
					System.out.println("Left from : (" + x + "," + y + ")");
					path = path + "Left\n";
					x = x - 1;
				}
			}
		}

		return true;
	}

	/**
	 * Get the path through the maze.
	 *
	 * @return list of coordinates along path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Determine if the row, column location is an exit.
	 *
	 * @return if location is an exit
	 */
	private boolean isExit(int i, int j) {
		return maze[i][j] == ' '
				&& (i == 0 || j == 0 || i == height - 1 || j == width - 1);
	}
}
