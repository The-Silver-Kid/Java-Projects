package DevTSK.Entity;

import DevTSK.Util.Day;

public class UnMarriedQuilava extends Quilava {

	public UnMarriedQuilava(String Name, String AlternateName, Boolean Gender, Boolean Shiny, String Description, String oTrainer, String Trainer, Day CaptureDate, String Imagename, String PokeballTypeImage) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.father = Trainer;
		this.birthday = CaptureDate;

		this.mother = oTrainer;
		this.yaBoolean = Shiny;
		this.imagepath = Imagename;
		this.altimagepath = PokeballTypeImage;
		this.altName = AlternateName;
	}

	@Override
	public String toString() {
		String vpni = "";
		if (otherBoolean)
			vpni = "\nShiny";
		String s = "Name : " + name + " AKA " + altName +
				"\nCaptured : " + birthday.toString() +
				"\n\n" + super.getGender() +
				"\n\n" + description + vpni +
				"\n\nOriginal Trainer : " + mother + "\nTrainer : " + father +
				"\n::End Of Info::";
		return s;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAltName() {
		return altName;
	}

	@Override
	public String getImagePath() {
		return imagepath;
	}

	@Override
	public String getAltImagePath() {
		return altimagepath;
	}
}
