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
	
/*	public void dDealt(float def, float cH) {
		int z = damage - def;
		if (z <= 0) {
			z = 0;
		}
		cH = cH - z;
		System.out.println("You dealt " + z + " damage!");
		System.out.println("Remaining Health: " + cH + "!");
		System.out.println(name + " Gains 1 XP!");
		current = current + 1;
	} */ 
}