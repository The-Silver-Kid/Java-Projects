package DevTSK.Entity;

import DAG.Config.ConfigException;
import projectArchive.OldCharSystem.Ponii;

public class MasterControl {
	
	public static void main(String[] args) throws ConfigException {
		//Unmarried : Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
		EntityLoader h = new EntityLoader(new Entity[] {
				new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, "\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", 22, 20, 7, 1993, "Radon.png", "kloud.png", "Apple Jack", 3, new String[] {"Tree Lighting", "Shadow Jack", "Powder"}, new String[] {"Apple Jack", "Apple Jack", "Galecia Frostia"}),
				new UnMarriedPoniiWithKids("Galecia Frostia", "Galecia", "", true, "\nUnicorn\nWas Radon's Marefriend for a while.... er, well still his marefreind.\nLikes the cold", "\nIcicle", "Light Blue", "Light Blue", "Krystla", "Starliner", 22, 20, 7, 1993, "Galecia.png", "null.png", 1, new String[] {"Powder"}, new String[] {"Shadow Radon"}),
				new UnMarriedPoniiWithKids("Cosmos Darkstar","Cosmos","\u26e7",false,"\nZebra pegasus\nIs half demon and is also a vampony\nLives in the old castle in Everfree","\nPentagram","Purple with gray stripes","Gray","Nighmare Moon","King of Hell",851,21,8,1164 /*1, new String[] {""}, new String[] {""},*/,"null.png","null.png",1, new String[] {""}, new String[] {"Cadence"} ),
				new UnMarriedPonii("Miiryanth","Miir",/*"\uD83D\uDC09"*/ "",false,"\nDragon ponii\nI can haz dragon?","\nDARGON NO GET ","Very dark gray","Firey orange-red color"/*He's not getting one. He's mostly dragon so no cutie mark.*/,"Unknown","Unknown",19,4,8,1996,"null.png","null.png"),
		}, new Entity[] {
				new MarriedPonii("Apple Jack Radon", "AJ", "", true, "\nEarth Ponii\nIts Apple Jack... y'all know her", "\nThree red apples", "Pale Yellow", "Pale Yellow", "?", "?", 22, 3, 4, 1993, "AJ.png", "AJMark.png", "Shadow Radon", 2, new String[] {"Tree Lighting", "Shadow Jack"}),
				new UnMarriedPoniiWithKids("Princess Cadence","Cadence","\u2764",true,"\nAlicorn\nPretty pink ponii princess","\nCrystal Heart","Pink as can be","Yellow, purple, and pink","Queen Galaxia","Unknown",11489,16,6,-9474,"null.png","null.png",/*"3547006110FFC7DAFFC49D00101740096UI1G3C002000000817F3FA2DF44A50Q107F3FCC004CB2"*/ 1,new String[] {""},new String[] {"Cosmos"}),
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}

}
