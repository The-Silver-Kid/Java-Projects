public class BattleAx extends Wepon {
	private Boolean pierce = false;
	private int sharp;
	private float z;
	
	public void BattleAx(String nom){
		name = nom;
	}
	
	public void sDealt(float def, float cH) {
		if (!pierce) {
			z = damage + sharp - def;
			if (z <= 0) {
				z = 0;
			}
		} else {
			z = damage + sharp;
		}
		cH = cH - 2 * z;
		System.out.println("You dealt " + z + " damage!");
		System.out.println("Remaining Health: " + cH + "!");
		System.out.println(name + " Gains 1 XP!");
		current = current + 1;
	}
}