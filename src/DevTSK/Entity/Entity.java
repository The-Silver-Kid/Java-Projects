package DevTSK.Entity;

import DevTSK.Util.Day;

public class Entity {
	protected Boolean Gender = false, /*false = Male, true = Female*/ otherBoolean = false, yaBoolean = false;
	protected int state = 0, kidammount = 0;
	protected String name = "Empty", altName = "Empty", description = "Empty", mother = "Empty", father = "Empty", DNA = "Empty", flag = "Empty", additionalInfo = "Empty";
	protected String imagepath = "null.png", altimagepath = "null.png", colour = "Empty", anotherColour = "Empty";
	protected String[] kids = null, with = null, marriedTo = null;
	protected Day birthday;

	public Entity() {
	}

	public Boolean getOtherBoolean() {
		return otherBoolean;
	}

	public Boolean getYetAnotherBoolean() {
		return yaBoolean;
	}

	public String getColour(int i) {
		String col = colour;
		if (i == 1)
			col = anotherColour;
		return col;
	}

	public String getAltName() {
		return altName;
	}

	public String[] getPartner() {
		return marriedTo;
	}

	public String[] getKidParents() {
		return with;
	}

	public int getKidAmmount() {
		return kidammount;
	}

	public String[] getKidnames() {
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

	public String getAltImagePath() {
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
		int age = new Day().yearsFrom(birthday);
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

	public String getFlag() {
		return flag;
	}

	public String getInfo() {
		return "An Entity is a being or thing with real existance.\n"
				+ "In this case it is any living thing that can be described by\n"
				+ "the following parameters as listed in the appropriate constructor.";

	}

	public String getBirthday() {
		String s = birthday.getMonth() + " " + birthday.getDay() + ", " + birthday.getYear();
		return s;
	}
}
