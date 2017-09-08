package DevTSK.Units;

public class Battle {
	private Unit[] a, e;
	private boolean[] aa, ea;
	private int[] ac, ec;

	public Battle(Unit[] allies, Unit[] opponents) {
		a = allies;
		e = opponents;
		aa = new boolean[a.length];
		ea = new boolean[e.length];
		ac = new int[a.length];
		ec = new int[e.length];
		for (int i = 0; i < a.length; i++) {
			aa[i] = true;
			ac[i] = a[i].getStat(Unit.HP);
		}
		for (int i = 0; i < e.length; i++) {
			ea[i] = true;
			ec[i] = e[i].getStat(Unit.HP);
		}
	}

	public void doBattle(int ally, int opponent) {

	}
}
