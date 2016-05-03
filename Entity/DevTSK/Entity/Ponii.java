package DevTSK.Entity;

public abstract class Ponii extends Entity {

	@Override
	public String getInfo() {
		return "A Ponii is an Entity that is the most common accurance in Equestria.\n"
				+ "And as such have special Features that other Entitys might not have.\n"
				+ "This also results in them having special constructors.";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
