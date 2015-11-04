package Class;

public class NumGenerator {
	
	private int max;
	
	public NumGenerator(int maximum){
		max = maximum;
	}
	
	public int gen() {
		int res = (int) (Math.random() * max);
		System.out.println(res);
		return res;
	}
	
	public int[] gen(int times){
		int[] result = new int[times];
		for (int i = 0; i > result.length; i++){
			result[i] = gen();
			System.err.println(result[i]);
		}
		return result;
	}

}
