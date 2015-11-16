package DevTSK.Entity;

import DevTSK.Util.Day;

public class MarriedPoniiWithOtherKids extends Ponii {

	public MarriedPoniiWithOtherKids(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String Marriedto, int ammountOfKids, String[] kidNames, String[] kidOtherParent) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.otherBoolean = IsVamponii;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.marriedTo = new String[] { Marriedto };
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.with = kidOtherParent;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	public MarriedPoniiWithOtherKids(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage, String[] Marriedto, int ammountOfKids, String[] kidNames, String[] kidOtherParent) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.otherBoolean = IsVamponii;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;

		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.marriedTo = Marriedto;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.with = kidOtherParent;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;

		this.flag = Flag;
	}

	@Override
	public String toString() {
		return "MarriedPoniiWithOtherKids";
	}
}
