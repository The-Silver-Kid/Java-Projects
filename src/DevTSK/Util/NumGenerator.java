package DevTSK.Util;

import java.util.Random;

public class NumGenerator {

	private int max, orignum;
	private boolean useNegative, debug;
	private Random gen = new Random();

	public NumGenerator(int maximum, Boolean a) {
		if (a) {
			max = 2 * maximum + 1;
			orignum = maximum;
			useNegative = true;
		} else {
			max = maximum;
			orignum = 0;
			useNegative = false;
		}
	}

	public NumGenerator(int maximum, Boolean a, Boolean debugInfo) {
		if (a) {
			max = 2 * maximum + 1;
			orignum = maximum;
			useNegative = true;
		} else {
			max = maximum;
			orignum = 0;
			useNegative = false;
		}
		debug = true;
	}

	public int gen() {
		int res = gen.nextInt(max);
		if (useNegative)
			res = res - orignum;
		return res;
	}

	public int[] gen(int times) {
		int[] result = new int[times];
		for (int i = 0; i < result.length; i++)
			result[i] = gen();
		return result;
	}

	public int[] genList() {
		int[] result = new int[max];
		result[0] = gen();
		if (debug)
			System.out.println("Generating list of " + max + "...");
		for (int i = 1; i < max; i++) {
			Boolean a;
			int ia = 0;
			int e;
			do {
				a = true;
				ia = ia + 1;
				e = gen();
				for (int o = 0; o < i; o++) {
					if (e == result[o])
						a = false;
				}
				if (debug)
					System.out.println("Try " + ia + " : " + e + " : " + i);
			} while (!a);
			result[i] = e;
		}
		if (debug)
			for (int i = 0; i < result.length; i++)
				System.err.println(result[i]);
		return result;
	}

	public void setRand() {
		gen = new Random(System.nanoTime());
	}

	public void setRand(int randValue) {
		gen = new Random(randValue);
	}

}
