package DevTSK.Entity;

import DAG.Config.ConfigException;

public class MasterControl {
	
	public static void main(String[] args) throws ConfigException {
		//Unmarried : Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
		EntityLoader h = new EntityLoader(new Entity[] {
				new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, "\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", 22, 20, 7, 1993, "Radon.png", "kloud.png", "Apple Jack", 3, new String[] {"Tree Lighting", "Shadow Jack", "Powder"}, new String[] {"Apple Jack", "Apple Jack", "Galecia Frostia"}),
				new UnMarriedPoniiWithKids("Galecia Frostia", "Galecia", "", true, "\nUnicorn\nWas Radon's Marefriend for a while.... er, well still his marefreind.\nLikes the cold", "\nIcicle", "Light Blue", "Light Blue", "Krystla", "Starliner", 22, 20, 7, 1993, "Galecia.png", "null.png", 1, new String[] {"Powder"}, new String[] {"Shadow Radon"})
		}, new Entity[] {
				new MarriedPonii("Apple Jack Radon", "AJ", "", true, "\nEarth Ponii\nIts Apple Jack... y'all know her", "\nThree red apples", "Pale Yellow", "Pale Yellow", "?", "?", 22, 3, 4, 1993, "AJ.png", "AJMark.png", "Shadow Radon", 2, new String[] {"Tree Lighting", "Shadow Jack"})
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}

}
