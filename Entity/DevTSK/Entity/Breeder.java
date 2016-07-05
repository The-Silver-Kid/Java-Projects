package DevTSK.Entity;

public class Breeder {

	public final static int INTACT_COLOURS = 0;

	public final static int SAMERGB_COLOURS = 1;

	public final static int RANDOM = 2;

	private int mode = 0;

	public Breeder(int mode) {
		this.mode = mode;
	}

	public String breed(Entity Mother, Entity Father) {
		String m = "", f = "";

		m = Mother.getDNA();
		f = Father.getDNA();

		if (m.equals(null) || f.equals(null)) {
			return Mother.getName() + " and " + Father.getName() + " did not want to have kids. (Some pony is missing DNA)";
		} else if (m.equals("") || f.equals("")) {
			return Mother.getName() + " and " + Father.getName() + " did not want to have kids. (Some pony has void DNA)";
		} else {
			switch (mode) {
			case 0:
				return breedCol(m, f);
			case 1:
				return breedIntact(m, f);
			case 2:
				return breedrand(m, f);
			}
			return null;
		}
	}

	public void switchMode(int mode) {
		this.mode = mode;
	}

	@Deprecated
	private String breedrand(String mother, String father) {
		String res = "";
		String process = "00";
		char[] m = mother.toCharArray();
		char[] f = father.toCharArray();

		for (int i = 2; i < m.length; i++) {
			int e = (int) (Math.random() * 2 + 1);
			if (e == 1)
				process += f[i];
			if (e == 2)
				process += m[i];
		}
		res = process;
		return res;
	}

	@Deprecated
	private String breedIntact(String Mother, String Father) {
		String res = "00";
		String[] mother = init(Mother), father = init(Father);

		for (int i = 0; i < mother.length; i++) {
			int e = (int) (Math.random() * 2 + 1);
			if (e == 1)
				res = res + mother[i];
			if (e == 2)
				res = res + father[i];
		}
		return res;
	}

	private String breedCol(String Mother, String Father) {
		String res = "00";
		String[] mother = initCol(Mother), father = initCol(Father);

		for (int i = 0; i < mother.length; i++) {
			int e = (int) (Math.random() * 2 + 1);
			if (e == 1)
				res = res + mother[i];
			if (e == 2)
				res = res + father[i];
		}
		return res;
	}

	private String[] init(String s) {
		String[] done = new String[47];
		if (s.length() < 78 || s.length() > 78) {
			done[1] = "ERROR!";
		} else {
			done[1] = "Error!";
			int pos = 2;
			for (int i = 0; i < done.length; i++) {
				switch (i) {
				case 0:
				case 1:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 17:
				case 18:
				case 19:
				case 28:
				case 30:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
					done[i] = s.substring(pos, pos + 2);
					pos = pos + 2;
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 20:
				case 21:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 29:
				case 31:
				case 39:
				case 40:
					done[i] = s.substring(pos, pos + 1);
					pos = pos + 1;
					break;
				case 22:
					done[i] = s.substring(pos, pos + 4);
					pos = pos + 4;
				}
			}
		}
		return done;
	}

	private String[] initCol(String s) {
		String[] done = new String[33];
		if (s.length() < 78 || s.length() > 78) {
			done[1] = "ERROR!";
		} else {
			done[1] = "Error!";
			int pos = 2;
			for (int i = 0; i < done.length; i++) {
				switch (i) {
				case 0:
				case 1:
				case 22:
				case 24:
				case 28:
					done[i] = s.substring(pos, pos + 2);
					pos = pos + 2;
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 14:
				case 15:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 23:
				case 25:
				case 29:
				case 30:
					done[i] = s.substring(pos, pos + 1);
					pos = pos + 1;
					break;
				case 16:
					done[i] = s.substring(pos, pos + 4);
					pos = pos + 4;
					break;
				case 6:
				case 7:
				case 13:
				case 26:
				case 27:
				case 31:
				case 32:
					done[i] = s.substring(pos, pos + 6);
					pos = pos + 6;
					break;
				}
			}
		}
		return done;
	}
}
