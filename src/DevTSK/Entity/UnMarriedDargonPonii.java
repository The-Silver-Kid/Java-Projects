/**
 * @author CosmosDarkstar
 */

package DevTSK.Entity;

public class UnMarriedDargonPonii extends DargonPonii {

	public UnMarriedDargonPonii(String Name, String AlternateName, String Flag, Boolean Gender, String Description, String ManeColour, String TailColour, String Mother, String Father, int age, int day, int month, int year, String Imagename) {
		this.name = Name;
		this.Gender = Gender;
		this.description = "\nDargon" + Description;
		this.colour = ManeColour;
		this.anotherColour = TailColour;
		this.mother = Mother;
		this.father = Father;
		this.age = age;
		this.month = month;
		this.year = year;
		this.imagepath = Imagename;
		this.altName = AlternateName;
		this.day = day;
		this.flag = Flag;
	}

	@Override
	public String toString() {
		return "UnMarriedDargonPonii";
	}
}
