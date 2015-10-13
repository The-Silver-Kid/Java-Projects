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
}
