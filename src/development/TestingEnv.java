package development;

import DevTSK.Util.NumGenerator;

public class TestingEnv {

	public static final NumGenerator ng = new NumGenerator(20);

	public static final void main(String args[]) {
		int[][][][] i = new int[10][10][10][10];
		for (int ii = 0; ii < 10; ii++) {
			for (int iii = 0; iii < 10; iii++) {
				for (int iiii = 0; iiii < 10; iiii++) {
					for (int iiiii = 0; iiiii < 10; iiiii++)
						System.out.println(ii + ":" + iii + ":" + iiii + ":" + iiiii + ":" + ng.gen());
				}
			}
		}
	}

}