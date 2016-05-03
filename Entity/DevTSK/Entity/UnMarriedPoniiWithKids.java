package DevTSK.Entity;

import DevTSK.Util.Day;

public class UnMarriedPoniiWithKids extends Ponii {

	public UnMarriedPoniiWithKids(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, int ammountOfKids, String[] kidNames, String[] kidOtherParent) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.otherBoolean = IsVamponii;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.with = kidOtherParent;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	@Override
	public String toString() {
		String vpni = "", kdz = "None";
		if (kids.length != 0) {
			kdz = kidammount + "\n";
			for (int i = 0; i < kids.length; i++)
				kdz = kdz + "With : \t" + with[i] + ":\t" + kids[i] + "\n";
		}
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
				"\n\nKids : " + kdz +
				"\n\nFlag : '" + flag + "'" +
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
