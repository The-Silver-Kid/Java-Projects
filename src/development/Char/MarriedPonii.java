package development.Char;

public class MarriedPonii extends Ponii {
	
	protected String[] kids;
	protected int kidammount;
	protected String marriedto;

	public MarriedPonii(String Name, Boolean Gender, String Description, String ManeColour, String TailColour,
			String Mother, String Father, int age, int month, int year, String Imagename, String CutiimarkImage,
			String MarriedTo, int ammountOfKids, String[] kidNames) {
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
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.marriedto = MarriedTo;
	}
	
	public String getPartner(){
		return marriedto;
	}
	
	public int getKidAmmount(){
		return kidammount;
	}
	
	public String[] Kidnames(){
		return kids;
	}
}
