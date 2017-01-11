package DevTSK.JavaMon;

public class MoveSet {

	private byte[] level;
	private Attack[] attack;

	public MoveSet(byte[] level, Attack[] attack) {
		this.level = level;
		this.attack = attack;
	}

	public Attack getMove(byte level) {
		Attack ret = new Attack();
		for (int i = 0; i < attack.length; i++)
			if (this.level[i] == level)
				ret = attack[i];

		return ret;
	}
}
