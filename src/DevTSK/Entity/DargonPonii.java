package DevTSK.Entity;

public abstract class DargonPonii extends Ponii {

	@Override
	public String getInfo() {
		return "Dragon and pony hybrid. Don't ask how it works it just does.\n"
				+ "The more dragon-like ones don't have cutie marks while the more pony-like do.\n"
				+ "Some have wings while others don't, along with fur or scales, horns, or a spike on the end of the tail.";

	}

	public String getGender() {
		String s = "Stallion";
		if (super.Gender)
			s = "Mare";
		return s;
	}
}
