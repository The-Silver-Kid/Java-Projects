package DevTSK.Util;

public class NumGenerator {

	private int max, orignum;
	private boolean useNegative, debug;

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
		int res = (int) (Math.random() * max);
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
		do {
			result[0] = gen();
		} while (result[0] == 0);
		if (debug)
			System.out.println("Generating list of " + max + "...");
		for (int i = 0; i < max - 1; i++) {
			Boolean a;
			int ia = 0;
			int e;
			do {
				a = true;
				ia = ia + 1;
				if (debug)
					System.out.println("Try " + ia);
				e = gen();
				for (int o = 0; o < i + 1; o++) {
					if (e == result[o])
						a = false;
				}
			} while (!a);
			result[i] = e;
		}
		if (debug)
			for (int i = 0; i < result.length; i++)
				System.err.println(result[i]);
		return result;
	}

}
