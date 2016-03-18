package Class.Entity;

import DevTSK.Util.Day;

/**
 * The main data holding class for this program.
 *
 * @author The_Silver_Kid
 */

public class Entity {
	protected Boolean Gender = false/*false = Male, true = Female*/;
	protected int kidammount = 0;
	protected String name = "Empty", alternateName = "Empty", description = "Empty", mother = "Empty", father = "Empty", additionalInfo = "Empty", imagePath = "null.png", smallImagePath = "null.png", colour = "Empty", anotherColour = "Empty";
	protected String[] kids = null, kidsOtherParent = null, marriedTo = null;
	protected Day birthday;

	/**
	 * Returns a basic description of the entity and all its parts
	 *
	 * @return String
	 */
	public String toString() {
		String partnrs = "", kdz = "None";
		for (int i = 0; i < marriedTo.length; i++)
			if (i == 0) {
				partnrs += " " + marriedTo[i];
			} else if (i != 0) {
				partnrs += ", " + marriedTo[i];
			}
		if (kids.length != 0) {
			kdz = kidammount + "\n";
			for (int i = 0; i < kids.length; i++)
				kdz = kdz + kids[i] + "\n";
		}
		String s = "Name : " + name + " AKA " + alternateName +
				"\nAge : " + new Day().yearsFrom(birthday) +
				"\n\n" + getGender() +
				"\n\n" + description +
				"\nMane : " + colour + "\nTail : " + anotherColour +
				"\nBirthday : " + birthday.getMonth() + " " + birthday.getDay() + " " + birthday.getYear() +
				"\n\nCutii Mark : " + additionalInfo +
				"\n\nMother : " + mother + "\nFather : " + father +
				"\n\nMarried to : " + partnrs +
				"\n\nKids : " + kdz +
				"\n::End Of Ponii::";
		return s;
	}

	/**
	 * Returns a string containing Male or Female
	 *
	 * @return String
	 */
	public String getGender() {
		if (Gender) {
			return "Female";
		}
		return "Male";
	}

	/**
	 * Returns the name of the Entity
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the alternate name of the Entity
	 *
	 * @return alternateName
	 */
	public String getAltName() {
		return alternateName;
	}
}
