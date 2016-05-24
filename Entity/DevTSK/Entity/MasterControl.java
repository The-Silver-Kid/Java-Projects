package DevTSK.Entity;

import java.io.IOException;
import DAG.Config.ConfigException;
import DevTSK.Util.Day;

public class MasterControl {

	private static EntityLoader h;
	public static String charsetname = "null";
	public static Window poni;

	public static void main(String[] args) throws ConfigException, IOException {
		if (args.length != 0)
			for (int i = 0; i < args.length; i++)
				System.out.println(args[i]);
		//Unmarried : Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
		if (h != null) {
			poni.vape();
		}
		if (args.length < 1 || args[0].equalsIgnoreCase("actual") || args[0].equalsIgnoreCase("Default")) {
			charsetname = "RP";
			h = new EntityLoader(new Entity[] {
					new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, true, "\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", new Day(20, 7, 1993), "Radon.png", "kloud.png", new String[] { "Apple Jack", "Galecia Frostia" }, 3, new String[] { "Tree Lighting", "Shadow Jack", "Powder" }, new String[] { "Apple Jack", "Apple Jack", "Galecia Frostia" }),
					new UnMarriedPonii("Tree Lighting Radon", "Tree", "", true, true, "\nEarth\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes Blaze.", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Lttle more yellow then AJ's", "Slightly darker orange then AJ", "Apple Jack", "Shadow Radon", new Day(11, 9, 2011), "lightning.png", "null.png"),
					new UnMarriedPonii("Shadow Jack Radon", "Jack", "", false, false, "\nUnicorn\nSecond Ponii on the AJ-Radon Line.", "\nDosen't have yet...\nA cloud with snowflakes", "Pale White and yellow", "Pale White and yellow", "Apple Jack", "Shadow Radon", new Day(25, 12, 2015), "jack.png", "null.png"),
					new MarriedPonii("Galecia Frostia", "Galecia", "", true, false, "\nUnicorn\nWas Radon's Marefriend for a while.... er, well still his marefriend. It's complicated.\nLikes the cold", "\nIcicle", "Light blue", "Light blue", "Krystla", "Starliner", new Day(20, 7, 1993), "Galecia.png", "null.png", "Shadow Radon", 1, new String[] { "Powder" }),
					new UnMarriedPonii("Powder Frostia", "Powder", "", true, false, "\nEarth\nAccedental Child of Radon and Galecia when he went to visit.", "\nCloud with snowflakes", "Light blue", "Light blue", "Galecia", "Shadow Radon", new Day(25, 12, 2015), "PowderBlue.png", "null.png"),
					new UnMarriedPlane("Blitz Radon", "Blitz", "", true, true, "\nStandard\nHas a boyfrind that makes pizza", "\n\u2708", "Copper Colour", "Copper Colour", "Charrie", "Slanger", new Day(12, 12, 1997), "blitz.png", "null.png"),
					new UnMarriedPonii("Steven Shuttleknight", "Steven", "", false, false, "\nPegasus\nDelivers Pizza\nLikes Blitz Radon", "\nPizza Box", "", "", "Speedometere", "Plizzia", new Day(28, 2, 1998), "steven.png", "null.png"),
					new UnMarriedFirePonii("Blaze Oxydation", "Blaze", "", true, false, false, "\nUnicorn\nCross Breed of a Ponii and Quilava\nMane acts a little like fire.\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.", "\nDosent have it yet...\nVolcanic storm type thing", "Deep Red", "Deep Red", "Lavé", "?", new Day(19, 11, 2001), "blaze.png", "null.png"),
					new UnMarriedMachinePonii("C418", "C4", "", false, "\nMachine ponii built by radon that Looks almost exactly like him...", "\nC418", "Yellow and Black", "Yellow and Black", "N/A", "N/A", new Day(3, 12, 2010), "C4.png", "null.png"),
					new UnMarriedMachinePonii("C523", "C5", "", true, "\nAnother machine ponii built by radon however she was built for C4 to have a friend", "\nC523", "Pale Yellow", "Pale Yellow", "N/A", "N/A", new Day(12, 3, 2012), "C5.png", "null.png"),
					new MarriedPonii("Charrie (Firefly) Sychace Radon", "Charrie", "", true, false, "\nPegasus\nOld but cares allot about everyponii", "\nBlack Outlined White Thunderbolt", "Pinkish brown", "Pinkish brown", "Keri", "Craider", new Day(13, 7, 1948), "charrie.png", "null.png", "Slanger", 4, new String[] { "Shadow", "Shyne", "Steve", "Blitz" }),
					new UnMarriedPonii("Maven RedHeart", "Maven", "", false, false, "\nUnicorn\nKnows almost as much as his mother about taking care of poniis", "\nRed cross", "Red", "Red", "Nurse RedHeart", "Raygle", new Day(1, 1, 2010), "Maven.png", "null.png"),
					new UnMarriedPlane("Belle Carbone", "Belle", "", true, false, "\nAir Bus Plone\nLikes Bowing", "\nAn 'A' with Airplane in it", "n/a", "n/a", "unknown", "unknown", new Day(12, 8, 1994), "null.png", "null.png"),
					new MarriedQuilava("Lavé", "Lave", true, false, "\nNo Information Avalable", "Unknown", "Unknown", new Day(24, 8, 1991), "null.png", "null.png", "Unknown", 2, new String[] { "Unknown", "Blaze" }),

					// Hill made pones
					new UnMarriedPonii("Cosmos Darkstar", "Cosmos", "\u26e7", false, true, "\nZebra pegasus\nIs half demon\nLives in the old castle in Everfree", "\nPentagram", "Purple with gray stripes", "Gray", "Nighmare Moon", "King of Hell", new Day(21, 8, 1164), "null.png", "null.png"),
					new UnMarriedDargonPonii("Miiryanth", "Miir", "", false, "\nDragon ponii\nStill young but takes care of his younger brother Gorlanth.", "Firey orange-red color", "Very dark gray and scale covered like the body, then the firery orange-red for the tuft at the tip", "Unknown", "Unknown", new Day(4, 8, 1996), "null.png"),
					new UnMarriedPoniiDargon("Gorlanth", "Lance", "", false, "\nPonii dragon\nExists", "Dark blue", "Dark blue", "\nHasn't gotten it yet...Triangle beaker thing", "Unknown", "Unknown", new Day(12, 7, 2010), "null.png", "null.png"),
					new UnMarriedPlane("Boewing Stratoliner", "Boewing", "", false, false, "\nF16 fighter jet plone\nUsually has a bandana around mouth when flying that has the shark face design thinger on it", "Missile", "Fire-red", "Fire-red", "Unknown", "Unknown", new Day(13, 7, 1994), "null.png", "null.png"),
					new UnMarriedCarribou("Hrodmar Thorhalson", "Hrodmar", "", false, false, "\nViking Carribou\nHe's a fekkin viking, what more exists need?\nCame through a time rift while hunting Cosmos", "\nThree white swirls", "Red with white highlights", "Red with white highlights", "Nina Faralddottir", "Thoral Kiotvason", new Day(12, 1, 1992), "null.png", "null.png" /*"39230B4000705000FFC49D0010000BB96QN1D3A00800000191BA3000FFFFEE0001705000FFFFEE"*/ ),
					new UnMarriedPlane("Banshee Nighthawk", "Nighthawk", "", false, true, "\nMilitary plone\nHead of the NLRAF and the LAF", "Targeting reticle", "Black", "Black", "REDACTED", "REDACTED", new Day(12, 9, 1989), "null.png", "null.png"),
					new UnMarriedPonii("Agent V42666J", "Octave", "", true, false, "\nRefer to Nova.png for outfit and weapon\nPegasus\nMember of group of elite assasins known as Ghosts\nOctave is pronounced with a hard A sound", "Targeting reticle", "Silver", "Silver", "REDACTED", "REDACTED", new Day(5, 1, 1995), "null.png", "null.png"),
					new UnMarriedPonii("Snowfall Glacier", "Snowy", "", false, true, "\nPegasus\nHalf sister of Galecia\nRecently came back from living with the griffons for a while", "Glacier", "Blue", "Blue", "Unknown (She ran off as soon as Snowy was born)", "Ice Blue", new Day(13, 6, 1994), "null.png", "null.png"),
					new UnMarriedMachinePonii("D105", "Bit", "", false, "\nKid of C4 and C5\nUsually found playing with Tree and Blaze", "\nD105", "Blue and red", "Blue and red", "C523", "C418", new Day(4, 6, 2015), "null.png", "null.png"),

			}, new Entity[] {
					new MarriedPonii("Apple Jack Radon", "AJ", "", true, false, "\nEarth\nIts Apple Jack... y'all know her", "\nThree red apples", "Pale Yellow", "Pale Yellow", "?", "?", new Day(3, 4, 1993), "AJ.png", "AJMark.png", "Shadow Radon", 2, new String[] { "Tree Lighting", "Shadow Jack" }),
					new UnMarriedPonii("Nurse RedHeart", "RedHeart", "", true, false, "\nEarth\nShe's a nurse.", "\nRed cross with hearts", "Light pink", "Light pink", "?", "?", new Day(9, 8, 1982), "null.png", "null.png"),
					new UnMarriedPonii("Princess Cadence", "Cadence", "\u2764", true, false, "\nAlicorn\nPretty pink pone princess", "\nCrystal Heart", "Pink as can be", "Yellow, purple, and pink", "Queen Galaxia", "Unknown", new Day(16, 6, -9474), "null.png", "null.png"),
			});
		}
		/*
		 * use for your own set of poniis that arent included or planed
		 * to be used in the rp thing
		 */
		if (args.length >= 1) {
			if (args[0].equalsIgnoreCase("Hill")) {
				charsetname = "Hill";
				h = new EntityLoader(new Entity[] {
						//oc
				}, new Entity[] {
						//non-oc
				});
			}
			/* CODES
			 * Maven : 2S2S000100FFFFFEFFC49D000014080FFUN1837001200000N1800000FF00000L01800000FF0000
			 *
			 * Snowfall: 3K24006010CCCCCCFFFFFF022010092BBUN1837000200000800040FFFF7FFF0B107F3FCC004CB2
			 *
			 * Cosmos: 3B240J41004E4E4E6B6B6B02000B49600UN1837205030001Q05F6366FF7FFF00107F3FCC004CB2
			 * Cadence: 3547006110FFC7DAFFC49D00101740096UI1G3C002000000817F3FA2DF44A50Q107F3FCC004CB2
			 * Cosmos/cadence daughter who needs name: 112A08711118181864646400101513247MN1C35008300001U12F005C00377221107F3FCC004CB2
			 * cosmos son (winged unicorn not alicon; because there is so much difference...): 112A08711118181864646400101513247MN1C35008300001U12F005C00377221107F3FCC004CB2
			 * cosmos+pinkamena daughter1: 112A086090DDDD000070CD02101006600MN1C35008310001D112345645A9471A107F3FCC004CB2
			 * cosmos+pinkamena daughter2: 112A08711118181864646400101513247MN1C35008300001U12F005C00377221107F3FCC004CB2
			 * radon alt : 2S2S000200000000FFFF0000000FFFF00UN1837204020000N1000000FFFF000L107F3FCC004CB2 
			 */
			if (args[0].equalsIgnoreCase("Reggii")) {
				charsetname = "Reggii";
				h = new EntityLoader(new Entity[] {
						new MarriedPoniiWithOtherKids("Shadow Radon", "Radon", "", false, true, "\nUnicorn\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nLight Industries Admin", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Yellow and Black", "Yellow and Black", "Charrie", "Slanger", new Day(20, 7, 1993), "Radon.png", "kloud.png", new String[] { "Apple Jack", "Galecia Frostia", "Night Glider" }, 20, new String[] { "Tree Lightning", "Shadow Jack", "Rhyne", "Aaron", "Powder", "Thorn", "Nhyte", "?", "Blue Powder", "Icicle", "Morgan", "Drone", "Lineair", "Anna", "Blaze", "Copper", "Alloy", "Drop Forge", "Blast Flame", "Night Strider" }, new String[] { "Apple Jack", "Apple Jack", "Apple Jack", "Apple Jack", "Apple Jack", "Apple Jack", "Apple Jack", "Apple Jack", "Galecia Frostia", "Galecia Frostia", "Blitz Radon", "Blitz Radon", "Blitz Radon", "Lavé", "Lavé", "Lavé", "Lavé", "Lavé", "Lavé", "Night Glider" }),
						new MarriedPonii("Tree Lighting Radon", "Tree", "", true, false, "\nEarth\nCutest little filly ever sparkling with the same spark that her dad has.", "\nApple tree with lightning bolt behind it", "Lttle more yellow then AJ's", "Slightly darker orange then AJ", "Apple Jack", "Shadow Radon", new Day(11, 9, 2011), "lightning.png", "null.png", "Blaze Oxydation", 1, new String[] { "Flame Oxydation" }),
						new UnMarriedPonii("Shadow Jack Radon", "Jack", "", false, true, "\nUnicorn\nSecond Ponii on the AJ-Radon Line.\nJerk\nMostly spends time with Rhyne", "\nA cloud with snowflakes", "Pale White and yellow", "Pale White and yellow", "Apple Jack", "Shadow Radon", new Day(25, 12, 2012), "jack.png", "null.png"),

						new MarriedPonii("Galecia Frostia", "Galecia", "", true, false, "\nUnicorn\nWas Radon's Marefriend for a while.... er, well still his marefreind.\nLikes the cold", "\nIcicle", "Light blue", "Light blue", "Krystla", "Starliner", new Day(20, 7, 1993), "Galecia.png", "null.png", "Shadow Radon", 1, new String[] { "Powder" }),
						new UnMarriedPonii("Powder Frostia", "Powder", "", true, false, "\nEarth\nA Pony that looks and acts exactly like Powder from the Radon-AJ group except she is blue.", "\nCloud with snowflakes", "Light blue", "Light blue", "Galecia", "Shadow Radon", new Day(25, 12, 2013), "PowderBlue.png", "null.png"),

						new UnMarriedQuilava("Lavé", "Lave", true, false, "\nRadon's Pet (more or less)", "Reggii", "Radon", new Day(24, 8, 1991), "null.png", "null.png"),

						new MarriedPlaneWithOtherKids("Blitz Radon", "Blitz", "", true, true, "\nStandard\nWas geneticly modifyed by her brother, Shadow Radon, to be a plane", "\n\u2708", "Copper Colour", "Copper Colour", "Charrie", "Slanger", new Day(12, 12, 1997), "blitz.png", "null.png", "Steve ShuttleKnight", 5, new String[] { "Morgan", "Drone", "Lineair", "Lieutenant", "Captain" }, new String[] { "Shadow Radon", "Shadow Radon", "Shadow Radon", "Steve", "Steve" }),
						new MarriedPonii("Steven Shuttleknight", "Steven", "", false, false, "\nPegasus\nDelivers Pizza and ocasionally works the night shift", "\nPizza Box", "", "", "Speedometere", "Plizzia", new Day(28, 2, 1998), "steven.png", "null.png", "Blitz Radon", 2, new String[] { "Lieutenant", "Captain" }),

						//new UnMarriedFirePonii("Blaze Oxydation", "Blaze", "", false, false, false, "\nUnicorn\nCross Breed of a Ponii and Quilava\nMane acts a little like fire.\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.", "\nDosent have it yet...\nVolcanic storm type thing", "Deep Red", "Deep Red", "Lav�", "?", 4, 19, 11, 2001, "blaze.png", "null.png"),
						//new UnMarriedMachinePonii("C418", "C4", "", false, "\nMachine ponii built by radon that Looks almost exactly like him...", "\nC418", "Yellow and Black", "Yellow and Black", "N/A", "N/A", 5, 3, 12, 2010, "C4.png", "null.png"),
						//new UnMarriedMachinePonii("C523", "C5", "", true, "\nAnother machine ponii built by radon however she was built for C4 to have a friend", "\nC523", "Pale Yellow", "Pale Yellow", "N/A", "N/A", 3, 12, 3, 2012, "C5.png", "null.png"),
						//new MarriedPonii("Charrie (Firefly) Sychace Radon", "Charrie", "", true, false, "\nPegasus\nOld but cares allot about everyponii", "\nBlack Outlined White Thunderbolt", "Pinkish brown", "Pinkish brown", "Keri", "Craider", 67, 13, 7, 1948, "charrie.png", "null.png", "Slanger", 4, new String[] { "Shadow", "Shyne", "Steve", "Blitz" }),
						//new UnMarriedPoniiWithKids("Cosmos Darkstar", "Cosmos", "\u26e7", false, true, "\nZebra pegasus\nIs half demon\nLives in the old castle in Everfree", "\nPentagram", "Purple with gray stripes", "Gray", "Nighmare Moon", "King of Hell", 851, 21, 8, 1164, "null.png", "null.png", 1, new String[] { "" }, new String[] { "Cadence" }),
				}, new Entity[] {
						new MarriedPonii("Apple Jack Radon", "AJ", "", true, false, "\nEarth\nIts Apple Jack... y'all know her", "\nThree red apples", "Pale Yellow", "Pale Yellow", "?", "?", new Day(3, 4, 1993), "AJ.png", "AJMark.png", "Shadow Radon", 2, new String[] { "Tree Lightning", "Shadow Jack", "Rhyne", "Aaron", "Powder", "Thorn", "Nhyte", "?", }),
						new UnMarriedPoniiWithKids("Nurse RedHeart", "RedHeart", "", true, false, "\nEarth\nShe's a nurse.", "\nRed cross with hearts", "Light pink", "Light pink", "?", "?", new Day(9, 8, 1982), "null.png", "null.png", 1, new String[] { "Maven" }, new String[] { "Unknown" }),
				});
			}
		}
		poni = new Window("Ponii Program 4.0", 1, 0, 0, 0, h);
		/*h.punch();
		h.setupConfig(charsetname);
		h.punch();*/
	}
}
