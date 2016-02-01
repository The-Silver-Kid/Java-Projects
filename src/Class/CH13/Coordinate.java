package Class.CH13;

/**
 * Row,column coordinate.
 */
public class Coordinate {
	private int row;
	private int col;

	/**
	 * Create a row, column coordinate.
	 * 
	 * @param i
	 *            row
	 * @param j
	 *            column
	 */
	public Coordinate(int i, int j) {
		this.row = i;
		this.col = j;
	}

	/**
	 * The row.
	 * 
	 * @return row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * The column.
	 * 
	 * @return column
	 */
	public int getCol() {
		return col;
	}
}
