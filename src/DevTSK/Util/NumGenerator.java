package DevTSK.Util;

public class NumGenerator {
	
	private int max;
	
	public NumGenerator(int maximum){
		max = maximum;
	}
	
	public int gen() {
		int res = (int) (Math.random() * max);
		return res;
	}
	
	public int[] gen(int times){
		int[] result = new int[times];
		for (int i = 0; i > times; i++)
			result[i] = gen();
		return result;
	}

}
