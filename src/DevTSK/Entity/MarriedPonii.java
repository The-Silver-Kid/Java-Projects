package DevTSK.Entity;

public class MarriedPonii extends Ponii {

	public MarriedPonii(String Name, String AlternateName, String Flag, Boolean Gender, Boolean IsVamponii, String Description, String CutiiMarkInfo, String ManeColour, String TailColour, String Mother, String Father, int age, int day, int month, int year, String Imagename, String CutiimarkImage, String MarriedTo, int ammountOfKids, String[] kidNames) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nRegular" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.otherBoolean = IsVamponii;
		this.father = Father;
		this.age = age;
		this.month = month;
		this.year = year;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.marriedto = MarriedTo;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.day = day;
		this.flag = Flag;
	}

	@Override
	public String toString() {
		return "MarriedPonii";
	}
}
