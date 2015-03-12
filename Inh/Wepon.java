public class Wepon {
	private float damage;
	private int level, req, current;
	private String name;
	
	public void Wepon(String tS) {
		name = tS;
		damage = 2;
		level = 1;
		req = 150;
		current = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCXP() {
		return current;
	}
	
	public 
}