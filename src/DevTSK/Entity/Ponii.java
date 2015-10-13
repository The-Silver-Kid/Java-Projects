package DevTSK.Entity;

public class Ponii extends Entity {

	public Ponii() {
	}

	@Override
	public String getGender() {
		String g = "Stallion";
		if (Gender)
			g = "Mare";
		return g;
	}

	@Override
	public String getInfo() {
		return "A Ponii is an Entity that is the most common accurance in Equestria.\n"
				+ "And as such have special Features that other Entitys might not have.\n"
				+ "This also results in them having special constructors.";

	}
}
