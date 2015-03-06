public class BattleAx extends Wepon {
	private Boolean pierce = false;
	private int sharp;
	
	public void sDealt(float def, float cH) {
		if (!pierce) {
			int z = damage + sharp - def;
			if (z <= 0) {
				z = 0;
			}
		} else {
			z = damage + sharp;
		}
		cH = cH - z;
		System.out.println("You dealt " + z + " damage!");
		System.out.println("Remaining Health: " + cH + "!");
		System.out.println(name + " Gains 1 XP!")
		current = current + 1;
	}
}