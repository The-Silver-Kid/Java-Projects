package development.Char;

public class UnMarriedPonii extends Ponii {
	
	public UnMarriedPonii(String Name, Boolean Gender, String Description, String ManeColour, String TailColour,
			String Mother, String Father, int age, int month, int year, String Imagename, String CutiimarkImage) {
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
		this.CutiiMarkPath = CutiimarkImage;
	}
}
