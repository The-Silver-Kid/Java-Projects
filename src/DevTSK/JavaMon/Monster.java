package DevTSK.JavaMon;

public class Monster {

	public static final int HP = 0, ATTACK = 1, DEFENSE = 2, SATTACK = 3, SDEFENSE = 4, SPEED = 5;

	//TODO : Create Learning of moves...
	@SuppressWarnings("unused")
	private MoveSet moveset;

	private static final String[] statNames = new String[] { "HP", "ATTACK", "DEFENSE",
			"SPECIAL ATTACK", "SPECIAL DEFENSE", "SPEED" };

	private int[] EV = new int[] { 0, 0, 0, 0, 0, 0 },
			/*EVgained = new int[] { 0, 0, 0, 0, 0, 0 },*/
			IV = new int[] { 0, 0, 0, 0, 0, 0 },
			baseStats = new int[] { 0, 0, 0, 0, 0, 0 },
			stats = new int[] { 0, 0, 0, 0, 0, 0 };

	private final int[] EVYield;

	private Nature nature;

	@SuppressWarnings("unused")
	private Attack[] attacks = new Attack[] {};

	private int cHP;

	private byte level = 1;

	public Monster(Boolean isWildPokemon, byte level, int[] EVs, int[] baseStats, int[] EVYield, int[] IVs, Nature nature) {
		this.level = level;

		this.EVYield = EVYield;
		this.IV = IVs;
		this.EV = EVs;

		this.baseStats = baseStats;

		this.nature = nature;

		this.stats = calculateLevelUp(new int[] { 0, 0, 0, 0, 0, 0 }, baseStats, EVs, IVs, level);
	}

	public byte getLevel() {
		return level;
	}

	public void levelUp() {
		level = (byte) (level + 1);
		for (int i = 0; i < EV.length; i++)
			EV[i] = EV[i] + EVYield[i];
		stats = calculateLevelUp(stats, baseStats, EV, IV, (byte) 1);
	}

	private int[] calculateLevelUp(int[] stats, int[] baseStats, int[] EVs, int[] IVs, byte level) {
		int[] s = stats;

		for (int i = 0; i < stats.length; i++) {
			if (i == 0)
				s[i] = (((2 * baseStats[i] + IVs[i] + (EVs[i] / 4)) * level) / 100) + level + 10;
			else
				s[i] = (int) (((((2 * baseStats[i] + IVs[i] + (EVs[i] / 4)) * level) / 100) + 5) * nature.getNatureValue(i));
		}

		return s;
	}

	public int getCurrentHP() {
		return cHP;
	}

	public void setCurrentHP(int cHP) {
		this.cHP = cHP;
	}

	public void debug() {
		for (int i = 0; i < EV.length; i++)
			System.out.println(statNames[i] + " : " + stats[i] + " " + EV[i] + " " + IV[i]);
	}

	public void addMoveset(MoveSet moves) {
		this.moveset = moves;
	}
}

/* Old Constructors	
public Monster(byte level, int cHP, int hp, int atk, int def, int sAtk, int sDef, int spd, int bhp, int bAtk, int bDef, int bSAtk, int bSDef, int bSpd, int[] EVYield) {
this.level = level;

this.EVYield = EVYield;

this.cHP = cHP;

this.hp = hp;
this.atk = atk;
this.def = def;
this.sAtk = sAtk;
this.sDef = sDef;
this.spd = spd;

this.bhp = bhp;
this.bAtk = bAtk;
this.bDef = bDef;
this.bAtk = bAtk;
this.bSAtk = bSAtk;
this.bSDef = bSDef;
this.bSpd = bSpd;
}

public Monster(int bhp, int bAtk, int bDef, int bSAtk, int bSDef, int bSpd, int[] EVYield) {
this.EVYield = EVYield;

this.hp = bhp;
this.atk = bAtk;
this.def = bDef;
this.sAtk = bSAtk;
this.sDef = bSDef;
this.spd = bSpd;

this.bhp = bhp;
this.bAtk = bAtk;
this.bDef = bDef;
this.bAtk = bAtk;
this.bSAtk = bSAtk;
this.bSDef = bSDef;
this.bSpd = bSpd;
} */
