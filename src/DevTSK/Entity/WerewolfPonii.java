package DevTSK.Entity;

public class WerewolfPonii extends Ponii {
	
	public WerewolfPonii(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String CutiiMarkInfo, String ManeColour, String TailColour,
			String Mother, String Father, int age, int day, int month, int year, String Imagename, String CutiimarkImage) {
		this.name = Name;
		this.Gender = Gender;
		this.description = Description;
		this.Mane = ManeColour;
		this.Tail = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.age = age;
		this.month = month;
		this.year = year;
		this.imagepath = Imagename;
		this.altimagepath = CutiimarkImage;
		this.additionalInfo = CutiiMarkInfo;
		this.altName = AlternateName;
		this.day = day;
		this.flag = Flag;
	}
	
	@Override
	public String toString(){
		return "UnMarriedPonii";
	}
}
