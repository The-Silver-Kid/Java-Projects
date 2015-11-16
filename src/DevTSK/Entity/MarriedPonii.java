package DevTSK.Entity;

import DevTSK.Util.Day;

public class MarriedPonii extends Ponii {

	public MarriedPonii(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String MarriedTo, int ammountOfKids, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.otherBoolean = IsVamponii;
		this.father = Father;
		this.birthday = bday;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.marriedTo = new String[] { MarriedTo };
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.flag = Flag;
	}

	public MarriedPonii(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String[] MarriedTo, int ammountOfKids, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.otherBoolean = IsVamponii;
		this.father = Father;
		this.birthday = bday;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.marriedTo = MarriedTo;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.flag = Flag;
	}

	@Override
	public String toString() {
		return "MarriedPonii";
	}
}
