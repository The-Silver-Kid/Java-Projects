package DevTSK.Units;

public class Weapon {
	private final int rng, atk, crit, type;
	private final double hit;
	private final String efns, name;
	public static final int SWORD = 0,
			AX = 1,
			SPEAR = 2,
			BOW = 3;

	public final boolean isMagic, isReaver;

	public Weapon(String name, int type, int rng, int atk, int crit, double hit, String effectiveness, boolean magic, boolean reaver) {
		this.name = name;
		this.type = type;
		this.atk = atk;
		this.rng = rng;
		this.crit = crit;
		this.hit = hit;
		efns = effectiveness;
		isMagic = magic;
		isReaver = reaver;
	}
}
