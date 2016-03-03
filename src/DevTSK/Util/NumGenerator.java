package DevTSK.Util;

public class NumGenerator {

	private int max, orignum;
	private boolean useNegative;

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

	public int gen() {
		int res = (int) (Math.random() * max);
		if (useNegative)
			res = res - orignum;
		return res;
	}

	public int[] gen(int times) {
		int[] result = new int[times];
		for (int i = 0; i > result.length; i++)
			result[i] = gen();
		return result;
	}

}
