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
		return "UnMarriedPoniiWithKids";
	}
}
