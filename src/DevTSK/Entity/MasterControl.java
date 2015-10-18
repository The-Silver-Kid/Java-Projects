package DevTSK.Entity;

import DAG.Config.ConfigException;

public class MasterControl {

	public static void main(String[] args) throws ConfigException {
		//Unmarried : Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
		EntityLoader h = new EntityLoader(new Entity[] {
				new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, "\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", 22, 20, 7, 1993, "Radon.png", "kloud.png", "Apple Jack", 3, new String[] { "Tree Lighting", "Shadow Jack", "Powder" }, new String[] { "Apple Jack", "Apple Jack", "Galecia Frostia" }),
				new UnMarriedPonii("Tree Lighting Radon", "Tree", "", true, "\nEarth\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes Blaze.", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Lttle more yellow then AJ's", "Slightly darker orange then AJ", "Apple Jack", "Shadow Radon", 4, 11, 9, 2011, "lightning.png", "null.png"),
				new UnMarriedPonii("Shadow Jack Radon", "Jack", "", false, "\nUnicorn\nSecond Ponii on the AJ-Radon Line.", "\nDosen't have yet...\nA cloud with snowflakes", "Pale White and yellow", "Pale White and yellow", "Apple Jack", "Shadow Radon", 0, 25, 12, 2015, "jack.png", "null.png"),
				new UnMarriedPoniiWithKids("Galecia Frostia", "Galecia", "", true, "\nUnicorn\nWas Radon's Marefriend for a while.... er, well still his marefreind.\nLikes the cold", "\nIcicle", "Light blue", "Light blue", "Krystla", "Starliner", 22, 20, 7, 1993, "Galecia.png", "null.png", 1, new String[] { "Powder" }, new String[] { "Shadow Radon" }),
				new UnMarriedPonii("Powder Frostia", "Powder", "", true, "\nEarth\nAccedental Child of Radon and Galecia when he went to visit.", "\nCloud with snowflakes", "Light blue", "Light blue", "Galecia", "Shadow Radon", 0, 25, 12, 2015, "PowderBlue.png", "null.png"),
				new UnMarriedPlane("Blitz Radon", "Blitz", "", true, "\nStandard\nHas a boyfrind that makes pizza", "\n\u2708", "Copper Colour", "Copper Colour", "Charrie", "Slanger", 18, 12, 12, 1997, "blitz.png", "null.png"),
				new UnMarriedPonii("Steven Shuttleknight", "Steven", "", false, "\nPegasus\nDelivers Pizza\nLikes Blitz Radon", "\nPizza Box", "", "", "Speedometere", "Plizzia", 17, 28, 2, 1998, "steven.png", "null.png"),
				new UnMarriedFirePonii("Blaze Oxydation", "Blaze", "", false, "\nUnicorn\nCross Breed of a Ponii and Quilava\nMane acts a little like fire.\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.", "\nDosent have it yet...\nVolcanic storm type thing", "Deep Red", "Deep Red", "Lavé", "?", 4, 19, 11, 2001, "blaze.png", "null.png"),
				new UnMarriedMachinePonii("C418", "C4", "", false, "\nMachine ponii built by radon that Looks almost exactly like him...", "\nC418", "Yellow and Black", "Yellow and Black", "N/A", "N/A", 5, 3, 12, 2010, "C4.png", "null.png"),
				new UnMarriedMachinePonii("C523", "C5", "", true, "\nAnother machine ponii built by radon however she was built for C4 to have a friend", "\nC523", "Pale Yellow", "Pale Yellow", "N/A", "N/A", 3, 12, 3, 2012, "C5.png", "null.png"),
				
				//check
				//new UnMarriedPoniiWithKids/*then change the constructor till then.*/("Cosmos Darkstar", "Cosmos", "\u26e7", false, "\nZebra pegasus\nIs half demon and is also a vampony\nLives in the old castle in Everfree", "\nPentagram", "Purple with gray stripes", "Gray", "Nighmare Moon", "King of Hell", 851, 21, 8, 1164 /*1, new String[] {""}, new String[] {""},*/, "null.png", "null.png", 1, new String[] { "" }, new String[] { "Cadence" }),
				new UnMarriedDargonPonii("Miiryanth", "Miir", "", false, "\nDragon ponii\nStill young but takes care of his younger brother Gorlanth.","Firey orange-red color", "Very dark gray and scale covered like the body, then the firery orange-red for the tuft at the tip",  "Unknown", "Unknown", 19, 4, 8, 1996, "null.png"),
		}, new Entity[] {
				new MarriedPonii("Apple Jack Radon", "AJ", "", true, "\nEarth\nIts Apple Jack... y'all know her", "\nThree red apples", "Pale Yellow", "Pale Yellow", "?", "?", 22, 3, 4, 1993, "AJ.png", "AJMark.png", "Shadow Radon", 2, new String[] { "Tree Lighting", "Shadow Jack" }),
				//check
				//new UnMarriedPoniiWithKids/*Same as on Cosmos.*/("Princess Cadence", "Cadence", "\u2764", true, "\nAlicorn\nPretty pink ponii princess", "\nCrystal Heart", "Pink as can be", "Yellow, purple, and pink", "Queen Galaxia", "Unknown", 11489, 16, 6, -9474, "null.png", "null.png", /*"3547006110FFC7DAFFC49D00101740096UI1G3C002000000817F3FA2DF44A50Q107F3FCC004CB2"*/ 1, new String[] { "" }, new String[] { "Cosmos" }),
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}
}
