package DevTSK.Entity;

public class Entity {
	protected Boolean Gender = false; //false = Male, true = Female
	protected int age = 0, state = 0, day = 0, month = 0, year = 0, kidammount = 0;
	protected String name = "Empty", altName = "Empty", description = "Empty", mother = "Empty", father = "Empty", DNA = "Empty", flag = "Empty", additionalInfo = "Empty", marriedto = "Empty";
	protected String imagepath = "null.png", altimagepath = "null.png";
	protected String[] kids = null, with = null;
	
	public Entity() {
	}
	
	public String getAltName(){
		return altName;
	}
	
	public String getPartner(){
		return marriedto;
	}
	
	public String[] getKidParents(){
		return with;
	}
	
	public int getKidAmmount(){
		return kidammount;
	}
	
	public String[] getKidnames(){
		return kids;
	}
	
	public String getAddDesc() {
		return additionalInfo;
	}
	
	public String getGender() {
		String g = "Male";
		if (Gender)
			g = "Female";
		return g;
	}
	
	public String getAltImagePath(){
		return altimagepath;
	}

	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return description;
	}
	
	public String getMother() {
		return mother;
	}
	
	public String getFather() {
		return father;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getState(int i) {
		return state;
	}
	
	public String getImagePath() {
		return imagepath;
	}
	
	public String getDNA() {
		return DNA;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public String getMonth() {
		String mnth = "";
		switch (month){
			default:
				mnth = "nil";
				break;
			case 1:
				mnth = "January";
				break;
			case 2:
				mnth = "Febuary";
				break;
			case 3:
				mnth = "March";
				break;
			case 4:
				mnth = "April";
				break;
			case 5:
				mnth = "May";
				break;
			case 6:
				mnth = "June";
				break;
			case 7:
				mnth = "July";
				break;
			case 8:
				mnth = "August";
				break;
			case 9:
				mnth = "September";
				break;
			case 10:
				mnth = "October";
				break;
			case 11:
				mnth = "November";
				break;
			case 12:
				mnth = "December";
				break;
		}
		return mnth;
	}
}
