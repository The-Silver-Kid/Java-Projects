package DevTSK.Toast;

public class Type {

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

	public String toString(Type type) {
		//TODO
		return NAMES[0];
	}

	public double getTypeEffectiveness(Type attack, Type defendPrimaryType, Type defendSecondaryType) {
		//TODO
		double effect = 1;

		if (defendPrimaryType.equals(defendSecondaryType)) {
			effect = EFFECTIVENESS[1][1];
		} else {
			effect = EFFECTIVENESS[1][1] * EFFECTIVENESS[1][2];
		}

		return effect;
	}
}
