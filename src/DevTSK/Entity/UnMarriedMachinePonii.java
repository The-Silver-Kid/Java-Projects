package DevTSK.Entity;

import DevTSK.Util.Day;

public class UnMarriedMachinePonii extends MachinePonii {

	public UnMarriedMachinePonii(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String Code, String ManeColour, String TailColour, String Mother, String Father, Day bday, String Imagename, String CutiimarkImage) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.birthday = bday;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.additionalInfo = Code;
		this.altName = AlternateName;
		this.flag = Flag;
	}

	@Override
	public String toString() {
		return "UnMarriedMachinePonii";
	}
}
