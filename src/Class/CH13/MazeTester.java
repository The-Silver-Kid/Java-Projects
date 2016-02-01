package Class.CH13;

public class MazeTester {
	public static void main(String[] args) {

		char[][] mazeArray = { { '*', ' ', '*', '*', '*', '*', '*', '*', '*' },
				{ '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				{ '*', ' ', '*', '*', '*', '*', '*', ' ', '*' },
				{ '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
				{ '*', ' ', '*', ' ', '*', '*', '*', ' ', '*' },
				{ '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*' },
				{ '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' },
				{ '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				{ '*', '*', '*', '*', '*', '*', '*', ' ', '*' } };
		Maze maze = new Maze(mazeArray);

		System.out.println(maze.escape(3, 3));

		System.out.println("\n" + maze.getPath());
	}
}
