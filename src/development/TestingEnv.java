package development;

public class TestingEnv {

	public static void main(String args[]) {

		System.out.println(fact(20));
	}

	public static long fact(int n) {
		if (n == 1)
			return 1l;
		return n * fact(n - 1);
	}
}
