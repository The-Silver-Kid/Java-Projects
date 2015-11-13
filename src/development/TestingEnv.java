package development;

public class TestingEnv {

	public static final void main(String args[]) {
		int[][] arr = {
				{ 1, 2, 3, 0 },
				{ 4, 5, 6, 0 },
				{ 0, 0, 0, 0 }
		};
		int[][] arr2 = arr;
		System.out.println(arr2[2][1] + arr2[1][2]);
	}
}