package DevTSK.Toast;

import DevTSK.Exception.UnexceptableContentException;

public class Type {

	private String[] names = new String[] {
			"Normal", "Fightning", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psycic", "Ice", "Dragon", "Dark", "Fairy"
	};

	private int type;
	private int type2;

	public Type(int t1, int t2) throws UnexceptableContentException {
		if (t1 < 0 || t1 > 17)
			throw new UnexceptableContentException("Illegal type : " + t1);
		if (t2 < 0 || t2 > 17)
			throw new UnexceptableContentException("Illegal type : " + t2);
		this.type = t1;
		this.type2 = t2;
	}

	public int[] getType() {
		return new int[] { type, type2 };
	}

	public String toString() {
		return names[type] + " : " + names[type2];
	}

	public void setType(int[] i) {
		type = i[0];
		type2 = i[1];
	}
}
