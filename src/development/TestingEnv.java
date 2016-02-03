package development;

public class TestingEnv {

	public static void main(String[] args) {
		main(new String[] {});
	}

	public static long newFib(int n) {
		if (n <= 3) {
			return 1;
		} else {
			return newFib(n - 1) + newFib(n - 2) + newFib(n - 3);
		}
	}
}
