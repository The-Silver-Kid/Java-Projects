package development.Char;

public class MarriedPoniiWithOtherKids extends Ponii{

	protected String[] kids, with;
	protected int kidammount;
	protected String marriedto = "Empty";
	
	public MarriedPoniiWithOtherKids(String Name, Boolean Gender, String Description, String ManeColour, String TailColour,
			String Mother, String Father, int age, int month, int year, String Imagename, String CutiimarkImage,
			String Marriedto, int ammountOfKids, String[] kidNames, String[] kidOtherParent) {
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
		this.marriedto = Marriedto;
		this.kidammount = ammountOfKids;
		this.kids = kidNames;
		this.with = kidOtherParent;
	}
	
	public String getPartner(){
		return marriedto;
	}
	
	public String[] kidParents(){
		return with;
	}
	
	public int getKidAmmount(){
		return kidammount;
	}
	
	public String[] Kidnames(){
		return kids;
	}

}
