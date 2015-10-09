package DevTSK.Entity;

import DAG.Config.ConfigException;

public class MasterControl {
	
	public static void main(String[] args) throws ConfigException {
		//Unmarried : Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
		EntityLoader h = new EntityLoader(new Entity[] {
				new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, "\nStallion\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", 22, 20, 7, 1993, "Radon.png", "kloud.png", "Apple Jack", 3, new String[] {"Tree Lighting", "Shadow Jack", "Powder"}, new String[] {"Apple Jack", "Apple Jack", "Galecia Frostia"})
		}, new Entity[] {
				new UnMarriedPonii("NOC 1", "NOC one", "", false, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png"),
				new UnMarriedPonii("NOC 2", "NOC two", "", false, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png")
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}

}
