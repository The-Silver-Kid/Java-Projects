package DevTSK.JavaMon;

public class Type {

	private int[] ID = new int[] { -1, -1 };

	private static final String[] NAMES = new String[] {
			"Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel",
			"Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy"
	};

	private static final double[][] EFFECTIVENESS = new double[][] {
			{ 1, 1, 1, 1, 1, .5, 1, 0, .5, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, //Normal
			{ 2, 1, .5, .5, 1, 2, .5, 0, 2, 1, 1, 1, 1, .5, 2, 1, 2, .5 }, //Fight
			{ 1, 2, 1, 1, 1, .5, 2, 1, .5, 1, 1, 2, .5, 1, 1, 1, 1, 1 }, //Fly
			{ 1, 1, 1, .5, .5, .5, 1, .5, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2 }, //Poison
			{ 1, 1, 0, 2, 1, 2, .5, 1, 2, 2, 1, .5, 2, 1, 1, 1, 1, 1 }, //Ground
			{ 1, .5, 2, 1, .5, 1, 2, 1, .5, 2, 1, 1, 1, 1, 2, 1, 1, 1 }, //Rock
			{ 1, .5, .5, .5, 1, 1, 1, .5, .5, .5, 1, 2, 1, 2, 1, 1, 2, .5 }, //Bug
			{ 0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, .5, 1 }, //Ghost
			{ 1, 1, 1, 1, 1, 2, 1, 1, .5, .5, .5, 1, .5, 1, 2, 1, 1, 1, 2 }, //Steel
			{ 1, 1, 1, 1, 1, .5, 2, 1, 2, .5, .5, 2, 1, 1, 2, .5, 1, 1 }, //Fire
			{ 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, .5, .5, 1, 1, 1, .5, 1, 1 }, //Water
			{ 1, 1, .5, .5, 2, 2, .5, 1, .5, .5, 2, .5, 1, 1, 1, .5, 1, 1 }, //Grass
			{ 1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, .5, .5, 1, 1, .5, 1, 1 }, //Electric
			{ 1, 2, 1, 2, 1, 1, 1, 1, .5, 1, 1, 1, 1, .5, 1, 1, 0, 1 }, //Psychic
			{ 1, 1, 2, 1, 2, 1, 1, 1, .5, .5, .5, 2, 1, 1, .5, 2, 1, 1 }, //Ice
			{ 1, 1, 1, 1, 1, 1, 1, 1, .5, 1, 1, 1, 1, 1, 1, 2, 1, 0 }, //Dragon
			{ 1, .5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, .5, .5 }, //Dark
			{ 1, 2, 1, .5, 1, 1, 1, 1, .5, .5, 1, 1, 1, 1, 1, 2, 2, 1 } //Fairy
	};

	public Type(int primary, int secondary) {
		if (primary < 1 || primary > NAMES.length) {
			System.err.println("Lol\nLook at you trying to create something with a primary type that doesn't exist!");
			primary = -1;
		}
		if (secondary < 1 || secondary > NAMES.length) {
			System.err.println("Lol\nLook at you trying to create something with a secondary type that doesn't exist!");
			secondary = -1;
		}
		this.ID = new int[] { primary, secondary };
	}

	public Type(int type) {
		if (type < 1 || type > NAMES.length) {
			System.err.println("Lol\nLook at you trying to create something with a type that doesn't exist!");
		}
		this.ID = new int[] { type, type };
	}

	public Type(String primaryType, String secondaryType) {
		int primary = -1, secondary = -1;
		for (int i = 0; i < NAMES.length; i++) {
			if (primaryType.equalsIgnoreCase(NAMES[i]))
				primary = i;
			if (secondaryType.equalsIgnoreCase(NAMES[i]))
				secondary = i;
		}
		if (primary == -1) {
			System.err.println("Lol\nLook at you trying to create something with a primary type that doesn't exist!");
		}
		if (secondary == -1) {
			System.err.println("Lol\nLook at you trying to create something with a secondary type that doesn't exist!");
		}

		this.ID = new int[] { primary, secondary };
	}

	public Type(String type) {
		int primary = -1;
		for (int i = 0; i < NAMES.length; i++) {
			if (type.equalsIgnoreCase(NAMES[i]))
				primary = i;
			//System.out.println(NAMES[i]);
		}
		if (primary == -1) {
			System.err.println("Lol\nLook at you trying to create something with a type that doesn't exist!");
		}

		this.ID = new int[] { primary, primary };
	}

	private int[] getID() {
		return ID;
	}

	public static String toString(Type type) {
		return NAMES[type.getID()[0]] + " " + NAMES[type.getID()[1]];
	}

	public static double getTypeEffectiveness(Type attack, Type defend) {
		//TODO
		double effect = 1;

		int[] atk = attack.getID();
		int[] def = defend.getID();

		//[attack][defend]

		//attack and defender are both dual type
		if (atk[0] != atk[1] && def[0] != def[1])
			for (int a = 0; a < attack.getID().length; a++) {
				for (int d = 0; d < defend.getID().length; d++) {
					effect = effect * EFFECTIVENESS[attack.getID()[a]][defend.getID()[d]];
				}
			}
		//attack is single type and defender is dual type
		if (atk[0] == atk[1] && def[0] != def[1])
			for (int d = 0; d < defend.getID().length; d++) {
				effect = effect * EFFECTIVENESS[attack.getID()[0]][defend.getID()[d]];
			}
		//Attack is dual type and defender is single type
		if (atk[0] != atk[1] && def[0] == def[1])
			for (int a = 0; a < attack.getID().length; a++) {
				effect = effect * EFFECTIVENESS[attack.getID()[a]][defend.getID()[0]];
			}
		//Attack and defender are single type
		if (atk[0] == atk[1] && def[0] == def[1])
			effect = effect * EFFECTIVENESS[attack.getID()[0]][defend.getID()[0]];

		return effect;
	}
}
