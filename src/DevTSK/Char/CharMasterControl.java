package DevTSK.Char;

public class CharMasterControl {
	
	public static void main(String[] args) {
		System.err.println(args.length);
		if (args.length == 0){
			Char c = new Char(
					new String[] {"Shadow", "Steve", "Shyne", "Blitz", "Charrie", "Slanger", "Tree", "Jack", "Zane", "Axel", "Dark-Rainbow", "C418", "C523", "Steven", "Galecia", "Blaze"}, 
					new String[] {"Radon", "Orange", "Shyne", "Jet", "Firefly", "Radium", "Tree", "Jack", "Zane", "Axel", "Dark", "C4", "C5", "Pizza-ponii", "Galecia", "Blazer"}, 
					new String[] {"Sunset-Shimmer", "Apple-Jack", "Rainbow-Dash"}, 
					new Ponii[] {
						/* Married with kids: Name, Description, Cutii Mark, Mother, Father, Married to, INT age, INT amount of kids, STRING[] child names, Image path, CMImage path, PonycreatorV2 code
						 * Not Married      : Name, Description, Cutii Mark, Mother, Father, INT age, Image path, CMImage path, PonycreatorV2 code
						 * Married no kids  : Name, Description, Cutii Mark, Mother, Father, Married to, INT age, Image path, CMImage path, PonycreatorV2 code
						 * 
						 * DESCRIPTIONS (Pony and Cutii mark) MUST START WITH \n OTHERWISE IT WILL LOOK BAD.
						 * NEW LINES IN DESCRIPTIONS LOOK SOMETHING LIKE THIS "\nDescription\nmore description" NOTE THAT THERE IS NO SPACE BETWEEN \n AND THE NEXT WORD!
						 * DESCRIPTION FORMAT IS: GENDER (M/S), RACE, COLOUR, SOMETHING SPECIAL, MANE COLOUR
						 * DO NOT FOR ANY REASON PUT THE CUTII MARK DESCRIPTION IN THE PONII DESCRIPTION! IF YOU DO I WILL HUNT YOU DOWN!
						 *
						*/
						new Ponii("Shadow Radon", "\nStallion\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Member", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 2, new String[] {"Tree Lighting", "Shadow Jack"}, "radon.png", "null.png", "bgm.ogg", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
						new Ponii("Steve (Orange) Radon", "\nStallion\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it\nGigaplex Member", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", 19, "orange.png", "null.png", "2S2S000200FF8800FFFF0003001FF0000UN183720F02000141FF8800FFFF001B107F3FCC004CB2"),
						new Ponii("Shyne Radon", "\nMare\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color\nPrefers to not take sides", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", 20, "shyne.png", "null.png", "2S3H000004006FFF008AFF000010000FFUN183700300000141009FFF007FFF1B107F3FCC004CB2"),
						new Ponii("Blitz Radon", "\nMare\nPegasus\nDull Grey colour\nHas a boyfrind that makes pizza\nmane colour is a copper colour", "\nan airplane", "Charrie", "Slanger", 18, "blitz.png", "kloud.ogg", "null.png", "2S2S0000204F4F4F800000000019F4F4FUN1837000020001417F2F2F9F4F4F1B107F3FCC004CB2"),
						new Ponii("Charrie (Firefly) Sychace Radon", "\nMare\nPegasus\nPink Colour\nOld but cares allot about everyponii\nWhite Mane", "\nBlack Outlined White Thunderbolt", "Keri", "Craider", "Slanger", 67, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "charrie.png", "null.png", "2S2S000000FF89898000000000100FFFFUN1837000000001W17F2F2F9F4F4F1B107F3FCC004CB2"), 
						new Ponii("Slanger (Radium) Radon", "\nStallion\nEarth Ponii\nDark Purple colour\nJust like any old person (that isnt grouchy) he WILL make you laugh\nYellow Mane", "\nAncient symbol for magic", "Bradier", "George", "Charrie", 65, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "slanger.png", "null.png", "2S3H0001008000FF008AFF00000FFFF00UN183700000000141FFFF000000000K107F3FCC004CB2"),
						new Ponii("Tree Lighting Radon", "\nMare\nEarth Ponii\nSlightly darker orange then AJ\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes the Blaze.\nMane is just a little more yellow then AJ's", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Apple Jack", "Shadow Radon", 4, "lightning.png", "null.png", "credits.ogg", "003H000000FDA00000000003B0188FF00UN1837002000000I1FAFE730000001B107F3FCC004CB2"),
						new Ponii("Shadow Jack Radon", "\nStallion\nUnicorn\nSame colour as AJ\nSecond Ponii on the AJ-Radon Line\nMane is like Radon's but slightly paler", "\nDosen't have yet...\nA cloud with snowflakes", "Apple Jack", "Shadow Radon", 0, "jack.png", "null.png", "002S000000FDA000800000000000FBE00UN1839000220001412F2F2FF9FD721B107F3FCC004CB2"),
						new Ponii("Zane Fireshine", "\nStallion\nUnicorn\nBlack coloured\nDosent like leaving the ground\nBlack and Green Mane\nGigaplex Leader", "\nA Sandy coloured crossed box", "Solar Flare", "Earth Quakes", 20, "zane.png", "null.png", "2S3H000200000000008AFF0000000BA95UN1837204000001010000005F000012107F3FCC004CB2"),
						new Ponii("Axel Fireshine", "\nStallion\nUnicorn\nA bright orange colour\nCan stand in intence flames and come out unharmed\nmane of fire\nLight Industries member", "\nfireball", "Solar Flare", "Earth Quakes", 18, "axel.png", "null.png", "2S2S000200FF00008000000300000FF00UN183720002000101FF8000FFFF0012107F3FCC004CB2"),
						new Ponii("Dark Rainbow", "\nStallion\nAlicorn\nGrey coloured\nHe is an alicorn but only looks like a pegasus because laws and crap\nRainbow like Rainbow Dash's", "\nan atom", "Franda", "Slaziur", "Rainbow Dash", 20, "DR.png", "null.png", "2S2S0002304F4F4F80000000001FF0000UN1837200000000O17F2F2F9F4F4F0M107F3FCC004CB2"),
						new Ponii("C418 (C4)", "\nStallion\nBlack colour\nMachine ponii built by radon that Looks almost exactly like him...", "\nDosent have one as he is a machine\nMane is the same as radon's only green instead of yellow", "N/A", "Shadow Radon", "C523", 5, "C4.png", "null.png", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
						new Ponii("C523 (C5)", "\nMare\nCream sort of colour\nAnother machine ponii built by radon however she was built for C4 to have a friend\nHas the same coloured mane as AJ", "\nDosent have one because she is a machine", "N/A", "Shadow Radon", "C418", 3, "C5.png", "null.png", "2S2S000000FDFEDF8000000000100FF00UN1837000000000N0F9FD729F4F4F0J107F3FCC004CB2"),
						new Ponii("Steven Stralanger", "\nStallion\nPegasus\nLight brown coloured\nDelivers Pizza\nLikes Blitz", "\nPizza slice", "Splater", "Plazza", 17, "steven.png", "null.png", "2S3H0000109F9F4F008AFF00000AFAFAFUN1837000000001D1DA5E11ADE51112107F3FCC004CB2"),
						new Ponii("Galecia Frostia", "\nMare\nUnicorn\nLight blue coloured\nWas Radon's Marefriend for a while. Likes the cold\nMane Even Lighter Blue", "\nIcicle", "Krystla", "Starliner", 20, "Galecia.png", "null.png", "2W2O0001000095B900CCCC030010080FFUN1837000000000N10080FF00C0FF0N107F3FCC004CB2"),
						new Ponii("Blaze ?", "\nStallion\nUnicorn\nCross Breed of Ponii and Quilava\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.\nMane is firelike", "\nDosent have it yet...\nVolcanic storm", "Lavé", "Sharader", 4, "blaze.png", "null.png", "002S000200000000FF800003000F00000UN1839200210001D18000004000001B01800000400000")
					}, 
					new Ponii[] {
						new Ponii("Sunset Shimmer", "\nMare\nUnicorn\nYou know from EQG?", "\nThe yellow and red sun thing", "?", "?", 19, "null.png", "null.png", "null"),
						new Ponii("Apple Jack Radon", "\nMare\nEarth Ponii\nIts Apple Jack... yall know her", "\nThree red apples", "?", "?", "Shadow Radon", 22, 2, new String[] {"Tree Lighting", "Shadow Jack"}, "AJ.png", "null.png", "2S2S000000FEA100FEB19E0040110BF00UN1837000100000I0FAFE73FF7FFF0H107F3FCC004CB2"),
						new Ponii("Rainbow Dash", "\nMare\nPegasus\nRainbow Dash... need i say more?", "\nThe Rainbow lightning bolt", "?", "?", "Dark Rainbow", 23, "RD.png", "null.png", "2S2S0000207ADAFFFFC49D00001C6006FUN1837000000000O07F3FCCFF7FFF0M107F3FCC004CB2"),
					}
			);
			c.punch();
			//  ██╗    ██╗ █████╗ ██████╗ ███╗   ██╗██╗███╗   ██╗ ██████╗ ██╗
			//  ██║    ██║██╔══██╗██╔══██╗████╗  ██║██║████╗  ██║██╔════╝ ██║
			//  ██║ █╗ ██║███████║██████╔╝██╔██╗ ██║██║██╔██╗ ██║██║  ███╗██║
			//  ██║███╗██║██╔══██║██╔══██╗██║╚██╗██║██║██║╚██╗██║██║   ██║╚═╝
			//  ╚███╔███╔╝██║  ██║██║  ██║██║ ╚████║██║██║ ╚████║╚██████╔╝██╗
			//   ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝
			//
			//  DO NOT MODIFY ANYTHING BEYOND THIS POINT!
			//  IF YOU DO I WILL REVERT ALL YOUR HARD WORK...
			//  AND DONT TELL ME I CANT DO THAT. BECAUSE I CAN.
			//  I DON'T CARE IF IT LOOKS LIKE IT NEEDS TO BE CHANGED
			//  IT DOESN'T.
			//
		} else if (args[0].equalsIgnoreCase("Subset")) {
			Char c = new Char(
					new String[] {"Shadow", "Steve", "Shyne", "Blitz", "Charrie", "Slanger", "Tree", "Jack", "Zane", "Axel", "Dark-Rainbow", "C418", "C523", "Steven", "Galecia", "Blaze"}, 
					new String[] {"Radon", "Orange", "Shyne", "Jet", "Firefly", "Radium", "Tree", "Jack", "Zane", "Axel", "Dark", "C4", "C5", "Pizza-ponii", "Galecia", "Blazer"}, 
					new String[] {"Sunset-Shimmer", "Apple-Jack", "Rainbow-Dash"}, 
					new Ponii[] {
						/* Married with kids: Name, Description, Cutii Mark, Mother, Father, Married to, INT age, INT amount of kids, STRING[] child names, Image path, CMImage path, PonycreatorV2 code
						 * Not Married      : Name, Description, Cutii Mark, Mother, Father, INT age, Image path, CMImage path, PonycreatorV2 code
						 * Married no kids  : Name, Description, Cutii Mark, Mother, Father, Married to, INT age, Image path, CMImage path, PonycreatorV2 code
						 * 
						 * DESCRIPTIONS (Pony and Cutii mark) MUST START WITH \n OTHERWISE IT WILL LOOK BAD.
						 * NEW LINES IN DESCRIPTIONS LOOK SOMETHING LIKE THIS "\nDescription\nmore description" NOTE THAT THERE IS NO SPACE BETWEEN \n AND THE NEXT WORD!
						 * DESCRIPTION FORMAT IS: GENDER (M/S), RACE, COLOUR, SOMETHING SPECIAL, MANE COLOUR
						 * DO NOT FOR ANY REASON PUT THE CUTII MARK DESCRIPTION IN THE PONII DESCRIPTION! IF YOU DO I WILL HUNT YOU DOWN!
						 *
						*/
						new Ponii("Shadow Radon", "\nStallion\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Member", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 7, new String[] {"Tree Lighting", "Shadow Jack", "Rhyne", "Aaron", "Powder", "Thorn", "Nhyte"}, "radon.png", "null.png", "bgm.ogg", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
						new Ponii("Steve (Orange) Radon", "\nStallion\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it\nGigaplex Member", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", 19, "orange.png", "null.png", "2S2S000200FF8800FFFF0003001FF0000UN183720F02000141FF8800FFFF001B107F3FCC004CB2"),
						new Ponii("Shyne Radon", "\nMare\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color\nPrefers to not take sides", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", 20, "shyne.png", "null.png", "2S3H000004006FFF008AFF000010000FFUN183700300000141009FFF007FFF1B107F3FCC004CB2"),
						new Ponii("Blitz Radon", "\nMare\nPegasus\nDull Grey colour\nHas a boyfrind that makes pizza\nmane colour is a copper colour", "\nAn airplane", "Charrie", "Slanger", "Steven", 18, 5, new String[] {"Morgan", "Drone", "Airlinear", "Mira", "Lieutenant"}, "blitz.png", "kloud.ogg", "null.png", "2S2S0000204F4F4F800000000019F4F4FUN1837000020001417F2F2F9F4F4F1B107F3FCC004CB2"),
						new Ponii("Charrie (Firefly) Sychace Radon", "\nMare\nPegasus\nPink Colour\nOld but cares allot about everyponii\nWhite Mane", "\nBlack Outlined White Thunderbolt", "Keri", "Craider", "Slanger", 67, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "charrie.png", "null.png", "2S2S000000FF89898000000000100FFFFUN1837000000001W17F2F2F9F4F4F1B107F3FCC004CB2"), 
						new Ponii("Slanger (Radium) Radon", "\nStallion\nEarth Ponii\nDark Purple colour\nJust like any old person (that isnt grouchy) he WILL make you laugh\nYellow Mane", "\nAncient symbol for magic", "Bradier", "George", "Charrie", 65, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "slanger.png", "null.png", "2S3H0001008000FF008AFF00000FFFF00UN183700000000141FFFF000000000K107F3FCC004CB2"),
						new Ponii("Tree Lighting Radon", "\nMare\nEarth Ponii\nSlightly darker orange then AJ\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes the Blaze.\nMane is just a little more yellow then AJ's", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Apple Jack", "Shadow Radon", 4, "lightning.png", "null.png", "credits.ogg", "003H000000FDA00000000003B0188FF00UN1837002000000I1FAFE730000001B107F3FCC004CB2"),
						new Ponii("Shadow Jack Radon", "\nStallion\nUnicorn\nSame colour as AJ\nSecond Ponii on the AJ-Radon Line\nMane is like Radon's but slightly paler", "\nDosen't have yet...\nA cloud with snowflakes", "Apple Jack", "Shadow Radon", 0, "jack.png", "null.png", "002S000000FDA000800000000000FBE00UN1839000220001412F2F2FF9FD721B107F3FCC004CB2"),
						new Ponii("Zane Fireshine", "\nStallion\nUnicorn\nBlack coloured\nDosent like leaving the ground\nBlack and Green Mane\nGigaplex Leader", "\nA Sandy coloured crossed box", "Solar Flare", "Earth Quakes", 20, "zane.png", "null.png", "2S3H000200000000008AFF0000000BA95UN1837204000001010000005F000012107F3FCC004CB2"),
						new Ponii("Axel Fireshine", "\nStallion\nUnicorn\nA bright orange colour\nCan stand in intence flames and come out unharmed\nmane of fire\nLight Industries member", "\nfireball", "Solar Flare", "Earth Quakes", 18, "axel.png", "null.png", "2S2S000200FF00008000000300000FF00UN183720002000101FF8000FFFF0012107F3FCC004CB2"),
						new Ponii("Dark Rainbow", "\nStallion\nAlicorn\nGrey coloured\nHe is an alicorn but only looks like a pegasus because laws and crap\nRainbow like Rainbow Dash's", "\nan atom", "Franda", "Slaziur", "Rainbow Dash", 20, 2, new String[] {"Skywalker", "Skytracer"}, "DR.png", "null.png", "2S2S0002304F4F4F80000000001FF0000UN1837200000000O17F2F2F9F4F4F0M107F3FCC004CB2"),
						new Ponii("C418 (C4)", "\nStallion\nBlack colour\nMachine ponii built by radon that Looks almost exactly like him...", "\nDosent have one as he is a machine\nMane is the same as radon's only green instead of yellow", "N/A", "Shadow Radon", "C523", 5, "C4.png", "null.png", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
						new Ponii("C523 (C5)", "\nMare\nCream sort of colour\nAnother machine ponii built by radon however she was built for C4 to have a friend\nHas the same coloured mane as AJ", "\nDosent have one because she is a machine", "N/A", "Shadow Radon", "C418", 3, "C5.png", "null.png", "2S2S000000FDFEDF8000000000100FF00UN1837000000000N0F9FD729F4F4F0J107F3FCC004CB2"),
						new Ponii("Steven Stralanger", "\nStallion\nPegasus\nLight brown coloured\nDelivers Pizza\nLikes Blitz", "\nPizza slice", "Splater", "Plazza", "Blitz", 17, 5, new String[] {"Morgan", "Drone", "Airlinear", "Mira", "Lieutenant"},  "steven.png", "null.png", "2S3H0000109F9F4F008AFF00000AFAFAFUN1837000000001D1DA5E11ADE51112107F3FCC004CB2"),
						new Ponii("Galecia Frostia", "\nMare\nUnicorn\nLight blue coloured\nWas Radon's Marefriend for a while. Likes the cold\nMane Even Lighter Blue", "\nIcicle", "Krystla", "Starliner", 20, "Galecia.png", "null.png", "2W2O0001000095B900CCCC030010080FFUN1837000000000N10080FF00C0FF0N107F3FCC004CB2"),
						new Ponii("Blaze ?", "\nStallion\nUnicorn\nCross Breed of Ponii and Quilava\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.\nMane is firelike", "\nDosent have it yet...\nVolcanic storm", "Lavé", "Sharader", 4, "blaze.png", "null.png", "002S000200000000FF800003000F00000UN1839200210001D18000004000001B01800000400000")
					}, 
					new Ponii[] {
						new Ponii("Sunset Shimmer", "\nMare\nUnicorn\nYou know from EQG?", "\nThe yellow and red sun thing", "?", "?", 19, "null.png", "null.png", "null"),
						new Ponii("Apple Jack Radon", "\nMare\nEarth Ponii\nIts Apple Jack... yall know her", "\nThree red apples", "?", "?", "Shadow Radon", 22, 7, new String[] {"Tree Lighting", "Shadow Jack", "Rhyne", "Aaron", "Powder", "Thorn", "Nhyte"}, "AJ.png", "null.png", "2S2S000000FEA100FEB19E0040110BF00UN1837000100000I0FAFE73FF7FFF0H107F3FCC004CB2"),
						new Ponii("Rainbow Dash", "\nMare\nPegasus\nRainbow Dash... need i say more?", "\nThe Rainbow lightning bolt", "?", "?", "Dark Rainbow", 23, 2, new String[] {"Skywalker", "Skytracer"}, "RD.png", "null.png", "2S2S0000207ADAFFFFC49D00001C6006FUN1837000000000O07F3FCCFF7FFF0M107F3FCC004CB2"),
					}
			);
			c.punch();
		} else {
			System.console();
			System.err.println("UNKNOWN CHAR SET!");
			System.exit(1);
		}
	}
	
}
