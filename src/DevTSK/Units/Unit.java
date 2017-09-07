package DevTSK.Units;

public class Unit {
	private int atk = 0, def = 0, res = 0, spd = 0, skl = 0, luck = 0, mov = 0, level = 0;
	private Weapon w;
	private Xlass c;
	private String nom;
	public int[] statUp = new int[7];

	public Unit(String name, Xlass clas, Weapon wep) {
		w = wep;
		c = clas;
		nom = name;
	}

	public void doLevel() {

	}

	public void doLevel(int time) {
		int[] totals = new int[7];
		for (int i = 0; i < time; i++) {
			doLevel();
			for (int ii = 0; ii < statUp.length; ii++)
				totals[ii] += statUp.length;
		}
		statUp = totals;
	}

	public Weapon getWeapon() {
		return w;
	}

	public void setWeapon(Weapon w) {
		this.w = w;
	}
}
