public class Wepon {
	private float damage;
	private int level, req, current;
	private String name;
	
	public void adToInventorii(String tS) {
		name = tS;
		damage = 2;
		level = 1;
		req = 150;
		current = 0;
	}
}