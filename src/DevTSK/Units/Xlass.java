package DevTSK.Units;

public class Xlass {
	private final int[] bSt, wpns;
	private final String name;

	private Xlass(String name, int[] baseStats, int[] useableWeapons) {
		this.name = name;
		bSt = baseStats;
		wpns = useableWeapons;
	}

}
