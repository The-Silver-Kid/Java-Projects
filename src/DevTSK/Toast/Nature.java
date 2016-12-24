package DevTSK.Toast;

public class Nature {

	// Hardy Lonely Adamant Naughty Brave Bold Docile Impish Lax Relaxed Modest Mild Bashful Rash Quiet Calm Gentle
	// Careful Quirky Sassy Timid Hasty Jolly Naive Serious

	public static final int HARDY = 0,
			LONELY = 1,
			ADAMANT = 2,
			NAUGHTY = 3,
			BRAVE = 4,
			BOLD = 5,
			DOCILE = 6,
			IMPISH = 7,
			LAX = 8,
			RELAXED = 9,
			MODEST = 10,
			MILD = 11,
			BASHFULL = 12,
			RASH = 13,
			QUIET = 14,
			CALM = 15,
			GENTILE = 16,
			CAREFULL = 17,
			QUIRKY = 18,
			SASSY = 19,
			TIMID = 20,
			HASTY = 21,
			JOLLY = 22,
			NAIVE = 23,
			SERIOUS = 24;

	public static final double[][] MODS = new double[][] {
			new double[] { 1, 1, 1, 1, 1, 1 },
			new double[] { 1, 1.1, .9, 1, 1, 1 },
			new double[] { 1, 1.1, 1, .9, 1, 1 },
			new double[] { 1, 1.1, 1, 1, .9, 1 },
			new double[] { 1, 1.1, 1, 1, 1, .9 },
			new double[] { 1, .9, 1.1, 1, 1, 1 },
			new double[] { 1, 1, 1, 1, 1, 1 },
			new double[] { 1, 1, 1.1, .9, 1, 1 },
			new double[] { 1, 1, 1.1, 1, .9, 1 },
			new double[] { 1, 1, 1.1, 1, 1, .9 },
			new double[] { 1, .9, 1, 1.1, 1, 1 },
			new double[] { 1, 1, .9, 1.1, 1, 1 },
			new double[] { 1, 1, 1, 1, 1, 1 },
			new double[] { 1, 1, 1, 1.1, .9, 1 },
			new double[] { 1, 1, 1, 1.1, 1, .9 },
			new double[] { 1, .9, 1, 1, 1.1, 1 },
			new double[] { 1, 1, .9, 1, 1.1, 1 },
			new double[] { 1, 1, 1, .9, 1.1, 1 },
			new double[] { 1, 1, 1, 1, 1, 1 },
			new double[] { 1, 1, 1, 1, 1.1, .9 },
			new double[] { 1, .9, 1, 1, 1, 1.1 },
			new double[] { 1, 1, .9, 1, 1, 1.1 },
			new double[] { 1, 1, 1, .9, 1, 1.1 },
			new double[] { 1, 1, 1, 1, .9, 1.1 },
			new double[] { 1, 1, 1, 1, 1, 1 } };

	private int nature;

	public Nature(int i) {
		if (i > 24 || i < 0) {
			System.err.println("Nature " + i + " Does not exist!");
			this.nature = 0;
		}
		this.nature = i;
	}

	public double getNatureValue(int stat) {
		return MODS[nature][stat];
	}
}
