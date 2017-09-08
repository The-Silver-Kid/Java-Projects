package DevTSK.Units;

public class Unit {
	private int hp = 0, atk = 0, def = 0, res = 0, spd = 0, skl = 0, luck = 0, mov = 0, level = 0;
	private Weapon w;
	private Xlass c;
	private final String nom;
	public int[] statUp = new int[7];
	public final boolean isCommander;

	public static final int LEVEL = 0, ATTACK = 1, DEFENSE = 2, RESISTANCE = 3, SPEED = 4, SKILL = 5, LUCK = 6, MOVEMENT = 7, HP = 8;

	public Unit(String name, Xlass clas, Weapon wep, boolean isCommander) {
		w = wep;
		c = clas;
		nom = name;
		this.isCommander = isCommander;
	}

	public Unit(String name, Xlass clas, Weapon wep, boolean isCommander, int[] statGains) {
		w = wep;
		c = clas;
		nom = name;
		level = statGains[0];
		atk = statGains[1];
		def = statGains[2];
		res = statGains[3];
		spd = statGains[4];
		skl = statGains[5];
		luck = statGains[6];
		mov = statGains[7];
		hp = statGains[8];
		this.isCommander = isCommander;
	}

	public void doLevel() {
		//TODO : Handle this
	}

	public void doClass() {
		//TODO : Handle this
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

	public int getStat(int statNumber) {
		switch (statNumber) {
		case 0:
			return level;
		case 1:
			return atk;
		case 2:
			return def;
		case 3:
			return res;
		case 4:
			return spd;
		case 5:
			return skl;
		case 6:
			return luck;
		case 7:
			return mov;
		case 8:
			return hp;
		}
		return 0;
	}

	public Weapon getWeapon() {
		return w;
	}

	public void setWeapon(Weapon w) {
		this.w = w;
	}

	public String getNom() {
		return nom;
	}
}
