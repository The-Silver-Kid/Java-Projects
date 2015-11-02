package DevTSK.Entity;

public class VikingCarribou extends Entity {

	public VikingCarribou() {
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
		return "Carribou went extinct long ago because of their inability to mesh with other cultures, being marked as 'Vikings,' or 'Barbarians.'"
				+ "For some reason they have short distance blinking (teleporting) powers.";

	}
}
