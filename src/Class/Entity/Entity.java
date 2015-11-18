/**
 * @author The_Silver_Kid
 *
 *         uses a third party API for calculating and storing days (BigJava's
 *         Day class)
 */
package Class.Entity;

import DevTSK.Util.Day;

/**
 * Main class that gets extended to create classes for things to integrate into
 * this program
 */
public class Entity {
	protected Boolean Gender = false, /*false = Male, true = Female*/ otherBoolean = false, yaBoolean = false;
	protected int state = 0, kidammount = 0;
	protected String name = "Empty", altName = "Empty", description = "Empty", mother = "Empty", father = "Empty", DNA = "Empty", flag = "Empty", additionalInfo = "Empty";
	protected String imagepath = "null.png", altimagepath = "null.png", colour = "Empty", anotherColour = "Empty";
	protected String[] kids = null, with = null, marriedTo = null;
	protected Day birthday;

	/**
	 * @return Boolean two (otherBoolean)
	 */
	public Boolean getOtherBoolean() {
		return otherBoolean;
	}

	/**
	 * @return Boolean three (yaBoolean)
	 */
	public Boolean getYetAnotherBoolean() {
		return yaBoolean;
	}

	/**
	 * Returns A String containing a named colour
	 * if the given int is 0 it returns the primary colour
	 * if the given int is 1 it reutrns the secondary colour
	 *
	 * @param currently
	 *            an integer 0 or 1
	 * @return a String
	 */
	public String getColour(int i) {
		String col = colour;
		if (i == 1)
			col = anotherColour;
		return col;
	}

	/**
	 * @return the Entity's alternate, shorter or preferred name (altName)
	 */
	public String getAltName() {
		return altName;
	}

	/**
	 * @return a list of whom this entity is married toString[]
	 */
	public String[] getPartner() {
		return marriedTo;
	}

	/**
	 * @return who their kids other parent is if it was outside a marriage
	 */
	public String[] getKidParents() {
		return with;
	}

	/**
	 * @return amount of kids this Entity has
	 */
	public int getKidAmmount() {
		return kidammount;
	}

	/**
	 * @return a list of the kid names
	 */
	public String[] getKidnames() {
		return kids;
	}

	/**
	 * @return The info stored in additionalInfo
	 */
	public String getAddDesc() {
		return additionalInfo;
	}

	/**
	 * Use Override to change the Returned strings
	 *
	 * @return a string based on the given gender boolean and what the male and
	 *         female of the species is named
	 */
	public String getGender() {
		String g = "Male";
		if (Gender)
			g = "Female";
		return g;
	}

	/**
	 * @return the secondary image path name
	 */
	public String getAltImagePath() {
		return altimagepath;
	}

	/**
	 * @return the full name of the entity
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return a description of the given entity
	 */
	public String getDesc() {
		return description;
	}

	/**
	 * @return the entity's mother
	 */
	public String getMother() {
		return mother;
	}

	/**
	 * @return the entity's father
	 */
	public String getFather() {
		return father;
	}

	/**
	 * @return The current age of the Entity
	 */
	public int getAge() {
		int age = new Day().yearsFrom(birthday);
		return age;
	}

	/**
	 * @return the state of the Entity
	 */
	public int getState() {
		return state;
	}

	/**
	 * @return the primary image path
	 */
	public String getImagePath() {
		return imagepath;
	}

	/**
	 * @return The DNA code of the Entity
	 */
	public String getDNA() {
		return DNA;
	}

	/**
	 * @return a flag that can be used for a variety of things...
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * use Overrides to change the information for different entity types
	 *
	 * @return general information on the entity type
	 */
	public String getInfo() {
		return "An Entity is a being or thing with real existance.\n"
				+ "In this case it is any living thing that can be described by\n"
				+ "the following parameters as listed in the appropriate constructor.";

	}

	/**
	 * @return a string with birthday contained in it
	 */
	public String getBirthday() {
		String s = birthday.getMonth() + " " + birthday.getDay() + ", " + birthday.getYear();
		return s;
	}
}
