package DevTSK.Units;

public class Xlass {
	private final int[] bSt, wpns;
	private final double[] sG;
	private final String name;

	public static final int HP = 0, ATTACK = 1, DEFENSE = 2, SKILL = 3, SPEED = 4, LUCK = 5, RESISTANCE = 6, MOVEMENT = 7;

	public Xlass(String name, int[] baseStats, int[] useableWeapons, double[] statGains) {
		this.name = name;
		bSt = baseStats;
		sG = statGains;
		wpns = useableWeapons;
	}

	public String getName() {
		return name;
	}

	public int getBaseStat(int stat) {
		return bSt[stat];
	}

	public boolean canUse(Weapon w) {
		//TODO : Handle this
		return true;
	}

	public double getGrowthRate(int stat) {
		return sG[stat];
	}

}
