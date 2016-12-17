package DevTSK.Toast;

public class Monster {

	private int[] EVYield = new int[] { 1, 1, 1, 1, 1, 1 }, EV = new int[] { 1, 1, 1, 1, 1, 1 };

	private int[] IV = new int[] { 1, 1, 1, 1, 1, 1 };

	private int bhp, bAtk, bDef, bSAtk, bSDef, bSpd;

	private int hp, atk, def, sAtk, sDef, spd;

	private int cHP;

	private byte level = 1;

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
	}

	public Monster(byte level, int bhp, int bAtk, int bDef, int bSAtk, int bSDef, int bSpd, int[] EVYield) {
		this.level = level;

		this.EVYield = EVYield;

		this.hp = bhp + CalculateLevelUP(true, level);
		this.atk = bAtk + CalculateLevelUP(true, level);
		this.def = bDef + CalculateLevelUP(true, level);
		this.sAtk = bSAtk + CalculateLevelUP(true, level);
		this.sDef = bSDef + CalculateLevelUP(true, level);
		this.spd = bSpd + CalculateLevelUP(true, level);

		this.bhp = bhp;
		this.bAtk = bAtk;
		this.bDef = bDef;
		this.bAtk = bAtk;
		this.bSAtk = bSAtk;
		this.bSDef = bSDef;
		this.bSpd = bSpd;
	}

	public byte getLevel() {
		return level;
	}

	public void levelUp() {
		level = (byte) (level + 1);
		hp = hp + CalculateLevelUP(false, 1);
		atk = atk + CalculateLevelUP(false, 1);
		def = def + CalculateLevelUP(false, 1);
		sAtk = sAtk + CalculateLevelUP(false, 1);
		sDef = sDef + CalculateLevelUP(false, 1);
		spd = spd + CalculateLevelUP(false, 1);
	}

	private int CalculateLevelUP(boolean isWild, int levels) {
		int ret = 0;

		return ret;
	}

	public int getCurrentHP() {
		return cHP;
	}

	public void setCurrentHP(int cHP) {
		this.cHP = cHP;
	}

}
