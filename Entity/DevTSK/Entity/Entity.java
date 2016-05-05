package DevTSK.Entity;

import DevTSK.Util.Day;

public abstract class Entity {
	protected Boolean Gender = false, /*false = Male, true = Female*/ otherBoolean = false, yaBoolean = false;
	protected int state = 0, kidammount = 0;
	protected String name = "Empty", altName = "Empty", description = "Empty", mother = "Empty", father = "Empty", DNA = "Empty", flag = "Empty", additionalInfo = "Empty", imagepath = "null.png", altimagepath = "null.png", colour = "Empty", anotherColour = "Empty";
	protected DNA dna;
	protected String[] kids = null, with = null, marriedTo = null;
	protected Day birthday;

	public abstract String toString();

	public String getGender() {
		if (Gender) {
			return "Female";
		}
		return "Male";
	}

	public void addDNA(DNA dna) {
		this.dna = dna;
	}

	public abstract String getInfo();

	public abstract String getName();

	public abstract String getAltName();

	public abstract String getImagePath();

	public abstract String getAltImagePath();
}
