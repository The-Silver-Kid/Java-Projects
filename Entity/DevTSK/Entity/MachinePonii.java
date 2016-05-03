package DevTSK.Entity;

public abstract class MachinePonii extends Entity {

	@Override
	public String getInfo() {
		return "A Machine Ponii is a machine specificly designed to mimic a ponii.\n"
				+ "They were designed by Shadow Radon while he was an intern for Aperature Labritories.\n"
				+ "They run off of a central core that controls all of the other functions of the ponii.\n"
				+ "The current list of systems are:\n"
				+ "-Pre-Core\n"
				+ "-GLaDOS\n"
				+ "-A-System\n"
				+ "-B-System\n"
				+ "-C-System\n"
				+ "-G-System\n"
				+ "The System they are is designated by the first letter of their code.\n"
				+ "They were built in such a way that if a ponii didn't know that it was a machine,\n"
				+ "They would just think it was just another ponii.\n"
				+ "Yes : They can reproduce.";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
