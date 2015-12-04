package DevTSK.Entity;

import DevTSK.Util.Day;

public class UnMarriedPlane extends PlanePonii {

	public UnMarriedPlane(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nPlane" + Description;
		this.colour = ManeColour;
		this.otherBoolean = IsVamponii;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;

	}

	@Override
	public String toString() {
		String vpni = "";
		if (otherBoolean)
			vpni = "\nIs a Vamponii";
		String s = "Name : " + name + " AKA " + altName +
				"\nAge : " + new Day().yearsFrom(birthday) +
				"\n\n" + super.getGender() +
				"\n\n" + description + vpni +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nCutii Mark : " + additionalInfo +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\nFlag : '" + flag + "'" +
				"\n::End Of Ponii::";
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
