package DevTSK.Entity;

import DevTSK.Util.Day;

public class MarriedQuilava extends Quilava {

	public MarriedQuilava(String Name, String AlternateName, Boolean Gender, Boolean Shiny, String Description, String oTrainer, String Trainer, Day CaptureDate, String Imagename, String PokeballTypeImage, String marriedTo, int ammountOfKids, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.father = Trainer;
		this.birthday = CaptureDate;
		this.marriedTo = new String[] { marriedTo };
		this.kidammount = ammountOfKids;
		this.kids = kidNames;

		this.mother = oTrainer;
		this.yaBoolean = Shiny;
		this.imagepath = Imagename;
		this.altimagepath = PokeballTypeImage;
		this.altName = AlternateName;
	}

	public MarriedQuilava(String Name, String AlternateName, Boolean Gender, Boolean Shiny, String Description, String oTrainer, String Trainer, Day CaptureDate, String Imagename, String PokeballTypeImage, String marriedTo[], int ammountOfKids, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.father = Trainer;
		this.birthday = CaptureDate;
		this.marriedTo = marriedTo;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;

		this.mother = oTrainer;
		this.yaBoolean = Shiny;
		this.imagepath = Imagename;
		this.altimagepath = PokeballTypeImage;
		this.altName = AlternateName;
	}

	@Override
	public String toString() {
		String vpni = "", partnrs = "", kdz = "None";
		for (int i = 0; i < marriedTo.length; i++)
			if (i == 0) {
				partnrs += " " + marriedTo[i];
			} else if (i != 0) {
				partnrs += ", " + marriedTo[i];
			}
		if (kids.length != 0) {
			kdz = kidammount + "\n";
			for (int i = 0; i < kids.length; i++)
				kdz = kdz + kids[i] + "\n";
		}
		if (otherBoolean)
			vpni = "\nShiny";
		String s = "Name : " + name + " AKA " + altName +
				"\nCaptured : " + birthday.toString() +
				"\n\n" + super.getGender() +
				"\n\n" + description + vpni +
				"\n\nOriginal Trainer : " + mother + "\nTrainer : " + father +
				"\n\nMarried to : " + partnrs +
				"\n\nKids : " + kdz +
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
