package DevTSK.Units;

public class Test {

	public static void main(String[] args) {
		Weapon w = new Weapon("Falchion", Weapon.SWORD, 1, 10, 0, .8, null, false, false);
		Xlass baron = new Xlass("Baron", new int[] { 40, 22, 18, 6, 4, 0, 7, 4 }, null, new double[] { 1.2, .5, .5, .5, .3, 0, 0 });
		Unit chrom = new Unit("Chrom", baron, w, true, new int[] { 1, 2, 4, 2, 6, 6, 4 });
		Unit alm = new Unit("Alm", baron, w, true, new int[] { 1, 5, 4, 3, 2, 1, 4 });
	}

}
