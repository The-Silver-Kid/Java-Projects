package development;

import DevTSK.Util.NumGenerator;

public class TestingEnv {

	public static void main(String[] args) {
		NumGenerator ng = new NumGenerator(1, true);
		for (int i = 0; i < 10; i++) {
			System.out.println(ng.gen());
		}
	}
}
