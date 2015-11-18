/**
 * @author The_Silver_Kid
 *
 *         (broken)
 */

package Class.Entity;

public class Breeder {

	private Entity m;

	private Entity f;

	private String[] mother, father;

	private static Boolean checked = false;

	private static String md = "", fd = "";

	public Breeder(Entity mt, Entity ft) {
		md = mt.getDNA();
		fd = ft.getDNA();
		m = mt;
		f = ft;
	}

	public void check() {
		if (md.length() != fd.length()) {
			checked = false;
		} else {
			checked = true;
		}
	}

	@Deprecated
	/**
	 * Randomly picks a parent to pull the DNA node from
	 *
	 * @return Result of inputed codes
	 */
	public String breedrand() {
		String res = "";
		String process = "00";
		if (!checked)
			res = "Cannot Breed something went wrong.";
		if (checked) {
			char[] df = fd.toCharArray();
			char[] dm = md.toCharArray();
			char[] k = new char[dm.length];
			for (int i = 2; i < fd.length(); i++) {
				int e = (int) (Math.random() * 2 + 1);
				if (e == 1)
					k[i] = dm[i];
				if (e == 2)
					k[i] = df[i];
				process = process + k[i];
				res = process;
			}
		}
		return res;
	}

	/**
	 * Randomly picks a parent to pull the DNA node groups from according to the
	 * PC2 (broken) Generated DNA code
	 *
	 * @return
	 */
	public String breed() {
		String res = "00";
		mother = init(md);
		father = init(fd);
		if (mother[1].equalsIgnoreCase("ERROR!") || father[1].equalsIgnoreCase("ERROR!")) {
			res = "Something went wrong...\n" + f.getName() + " and " + m.getName() + " did not want to breed.";
		}

		for (int i = 0; i < mother.length; i++) {
			int e = (int) (Math.random() * 2 + 1);
			if (e == 1)
				res = res + mother[i];
			if (e == 2)
				res = res + father[i];
		}
		return res;
	}

	/**
	 * Prepares the given DNA code for Breeding procedure
	 *
	 * @param DNA-code
	 * @return DNA code in a String[] according to the PC2 (broken) Generated
	 *         DNA code groups
	 */
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
}
