package DevTSK.Char;

import java.awt.Color;
import java.io.*;

import DevTSK.Exception.*;

public class CharRP {
	
	private static FileOutputStream send;
	
	private static Window poni = new Window("Ponii Program 3.0", 1, 0, 0);
	
	private static final String[] chars = new String[] {"Shadow", "Steve", "Shyne", "Blitz", "Charrie", "Slanger", "Tree", "Jack", "Zane", "Axel", "Dark-Rainbow", "C418", "C523", "Steven", "Galecia", "Blaze"};
	private static final String[] allias = new String[] {"Radon", "Orange", "Shyne", "Jet", "Firefly", "Radium", "Tree", "Jack", "Zane", "Axel", "Dark", "C4", "C5", "Pizza-ponii", "Galecia", "Blazer"};
	private static final String[] cannon = new String[] {"Sunset-Shimmer", "Apple-Jack", "Rainbow-Dash"};
	
	private static final String[] commands = new String[] {
		"Colour", "Color", "InputColour", "InputColor", "OutputColour", "OutputColor", "Music", "Exit",
		"OutputTextColor", "InputTextColor", "OutputTextColour", "InputTextColour", "errorcheck" , "extract",
		"breed"
	};
	
	private static Boolean musik = false;
	
	private static final Ponii[] OC = new Ponii[] {
		/* Married with kids: Name, Description, Cutii Mark, Mother, Father, Married to, INT age, INT amount of kids, STRING[] child names, Image path, PonycreatorV2 code
		 * Not Married      : Name, Description, Cutii Mark, Mother, Father, INT age, Image path, PonycreatorV2 code
		 * Married no kids  : Name, Description, Cutii Mark, Mother, Father, Married to, INT age, Image path, PonycreatorV2 code
		 * 
		 * DESCRIPTIONS (Pony and Cutii mark) MUST START WITH \n OTHERWISE IT WILL LOOK BAD.
		 * NEW LINES IN DESCRIPTIONS LOOK SOMETHING LIKE THIS "\nDescription\nmore description" NOTE THAT THERE IS NO SPACE BETWEEN \n AND THE NEXT WORD!
		 * DESCRIPTION FORMAT IS: GENDER (M/S), RACE, COLOUR, SOMETHING SPECIAL, MANE COLOUR
		 * DO NOT FOR ANY REASON PUT THE CUTII MARK DESCRIPTION IN THE PONII DESCRIPTION! IF YOU DO I WILL HUNT YOU DOWN!
		 *
		*/
		new Ponii("Shadow Radon", "\nStallion\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Member", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 2, new String[] {"Tree Lighting", "Shadow Jack"}, "radon.png", "bgm.ogg", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
		new Ponii("Steve (Orange) Radon", "\nStallion\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it\nGigaplex Member", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", 19, "orange.png", "2S2S000200FF8800FFFF0003001FF0000UN183720F02000141FF8800FFFF001B107F3FCC004CB2"),
		new Ponii("Shyne Radon", "\nMare\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color\nPrefers to not take sides", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", 20, "shyne.png", "2S3H000004006FFF008AFF000010000FFUN183700300000141009FFF007FFF1B107F3FCC004CB2"),
		new Ponii("Blitz Radon", "\nMare\nPegasus\nDull Grey colour\nHas a boyfrind that makes pizza\nmane colour is a copper colour", "\n airplane with similar wing structure as her own", "Charrie", "Slanger", "Steven", 18, "blitz.png", "kloud.ogg", "2S2S0000204F4F4F800000000019F4F4FUN1837000020001417F2F2F9F4F4F1B107F3FCC004CB2"),
		new Ponii("Charrie (Firefly) Sychace Radon", "\nMare\nPegasus\nPink Colour\nOld but cares allot about everyponii\nWhite Mane", "\nBlack Outlined White Thunderbolt", "Keri", "Craider", "Slanger", 67, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "charrie.png", "2S2S000000FF89898000000000100FFFFUN1837000000001W17F2F2F9F4F4F1B107F3FCC004CB2"), 
		new Ponii("Slanger (Radium) Radon", "\nStallion\nEarth Ponii\nDark Purple colour\nJust like any old person (that isnt grouchy) he WILL make you laugh\nYellow Mane", "\nAncient symbol for magic", "Bradier", "George", "Charrie", 65, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "slanger.png", "2S3H0001008000FF008AFF00000FFFF00UN183700000000141FFFF000000000K107F3FCC004CB2"),
		new Ponii("Tree Lighting Radon", "\nMare\nEarth Ponii\nSlightly darker orange then AJ\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes the Blaze.\nMane is just a little more yellow then AJ's", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Apple Jack", "Shadow Radon", 4, "lightning.png", "credits.ogg", "003H000000FDA00000000003B0188FF00UN1837002000000I1FAFE730000001B107F3FCC004CB2"),
		new Ponii("Shadow Jack Radon", "\nStallion\nUnicorn\nSame colour as AJ\nSecond Ponii on the AJ-Radon Line\nMane is like Radon's but slightly paler", "\nDosen't have yet...\nA cloud with snowflakes", "Apple Jack", "Shadow Radon", 0, "jack.png", "002S000000FDA000800000000000FBE00UN1839000220001412F2F2FF9FD721B107F3FCC004CB2"),
		new Ponii("Zane Fireshine", "\nStallion\nUnicorn\nBlack coloured\nDosent like leaving the ground\nBlack and Green Mane\nGigaplex Leader", "\nA Sandy coloured crossed box", "Solar Flare", "Earth Quakes", 20, "zane.png", "2S3H000200000000008AFF0000000BA95UN1837204000001010000005F000012107F3FCC004CB2"),
		new Ponii("Axel Fireshine", "\nStallion\nUnicorn\nA bright orange colour\nCan stand in intence flames and come out unharmed\nmane of fire\nLight Industries member", "\nfireball", "Solar Flare", "Earth Quakes", 18, "axel.png", "2S2S000200FF00008000000300000FF00UN183720002000101FF8000FFFF0012107F3FCC004CB2"),
		new Ponii("Dark Rainbow", "\nStallion\nAlicorn\nGrey coloured\nHe is an alicorn but only looks like a pegasus because laws and crap\nRainbow like Rainbow Dash's", "\nan atom", "Franda", "Slaziur", "Rainbow Dash", 20, "DR.png", "2S2S0002304F4F4F80000000001FF0000UN1837200000000O17F2F2F9F4F4F0M107F3FCC004CB2"),
		new Ponii("C418 (C4)", "\nStallion\nBlack colour\nMachine ponii built by radon that Looks almost exactly like him...", "\nDosent have one as he is a machine\nMane is the same as radon's only green instead of yellow", "N/A", "Shadow Radon", "C523", 5, "C4.png", "3037000200000000FEFF0003001FFFF00TM183720202000141000000FFFF001B107F3FCC004CB2"),
		new Ponii("C523 (C5)", "\nMare\nCream sort of colour\nAnother machine ponii built by radon however she was built for C4 to have a friend\nHas the same coloured mane as AJ", "\nDosent have one because she is a machine", "N/A", "Shadow Radon", "C418", 3, "C5.png", "2S2S000000FDFEDF8000000000100FF00UN1837000000000N0F9FD729F4F4F0J107F3FCC004CB2"),
		new Ponii("Steven Stralanger", "\nStallion\nPegasus\nLight brown coloured\nDelivers Pizza\nLikes Blitz", "\nPizza slice", "Splater", "Plazza", 17, "steven.png", "2S3H0000109F9F4F008AFF00000AFAFAFUN1837000000001D1DA5E11ADE51112107F3FCC004CB2"),
		new Ponii("Galecia", "\nMare\nUnicorn\nLight blue coloured\nWas Radon's Marefriend for a while. Likes the cold\nMane Even Lighter Blue", "\nIcicle", "Krystla", "Starliner", 20, "Galecia.png", "2W2O0001000095B900CCCC030010080FFUN1837000000000N10080FF00C0FF0N107F3FCC004CB2"),
		new Ponii("Blaze ?", "\nStallion\nUnicorn\nCross Breed of Ponii and Quilava\nUsually not seen as his dad prefers to keep him hidden\nHe likes the Tree Radon.\nMane is firelike", "\nDosent have it yet...\nVolcanic storm", "Lavé", "Sharader", 4, "blaze.png", "002S000200000000FF800003000F00000UN1839200210001D18000004000001B01800000400000")
	};
	private static final Ponii[] show = new Ponii[] {
		new Ponii("Sunset Shimmer", "\nMare\nUnicorn\nYou know from EQG?", "\nThe yellow and red sun thing", "?", "?", 19, "null.png", "null"),
		new Ponii("Apple Jack Radon", "\nMare\nEarth Ponii\nIts Apple Jack... yall know her", "\nThree red apples", "?", "?", "Shadow Radon", 22, 2, new String[] {"Tree Lighting", "Shadow Jack"}, "AJ.png", "2S2S000000FEA100FEB19E0040110BF00UN1837000100000I0FAFE73FF7FFF0H107F3FCC004CB2"),
		new Ponii("Rainbow Dash", "\nMare\nPegasus\nRainbow Dash... need i say more?", "\nThe Rainbow lightning bolt", "?", "?", "Dark Rainbow", 23, "RD.png", "2S2S0000207ADAFFFFC49D00001C6006FUN1837000000000O07F3FCCFF7FFF0M107F3FCC004CB2"),
	};
	
	public static void main(String[] args) throws Exception {
		errorCheck();
		
		poni.frmPoniiPic.setVisible(true);
	}

	private static void errorCheck() throws Exception{
		System.out.println("\nChecking out Inputed Resources...\n\nChecking chars and allias String[]s...");
		if (chars.length != allias.length) {
			throw new LengthException("String[] chars and String[] allias arent the same length!");
		}
		System.out.println("chars and allias String[]s checks out...\nChecking Ponii[] OC compatablity...");
		if (chars.length != OC.length) {
			throw new LengthException("String[] chars and Ponii[] OC are different lengths!");
		}
		System.out.println("Ponii[] OC compatablity checks out...\nChecking Ponii[] show compatablity...");
		if (show.length != cannon.length) {
			throw new LengthException("Ponii[] show and String[] cannon are different lengths!");
		}
		System.out.println("Ponii[] show compatablity checks out...\nChecking ponii resources...");
		System.out.println("Everything Checks out fine... Assuming all is well in the land...");
	}

	public static void handle(String s) {
		int handler = -1;
		Boolean origin = true, controlVar = false;
		for (int i = 0; i < chars.length; i++){
			if (chars[i].equalsIgnoreCase(s)) {
				handler = i;
			}
			if (s.equalsIgnoreCase(allias[i])) {
				handler = i;
			}
		}
		for (int i = 0; i < cannon.length; i++){
			if (cannon[i].equalsIgnoreCase(poni.lblTextArea.getText())) {
				handler = i;
				origin = false;
			}
		}
		for (int i = 0; i < commands.length; i ++) {
			String[] sl = s.split("\\s+");
			if (commands[i].equalsIgnoreCase(sl[0])){
				controlVar = true;
			}
		}
		
		poni.lblTextArea.setText("");
		try {
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/null.png"));
		} catch (IOException e) {
		}
		if (handler >= 0) {
			if (origin) {
				getOCInfo(handler);
			} else {
				getCaInfo(handler);
			}
		} else if (!controlVar) {
			poni.println(help());
		} else if (controlVar) {
			try {
				control(s);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void control(String s) throws Exception {
		String cmd = s;
		String[] sl = cmd.split("\\s+");
		if (sl[0].equalsIgnoreCase("Exit"))
			System.exit(0);
		if (sl[0].equalsIgnoreCase("Music")){
			musik = !musik;
			if (musik) {
				poni.musikS.setText("Music On");
				poni.musikS.setForeground(new Color(0, 255, 0));
			} else {
				poni.ss.stop("bgm.ogg");
				poni.musikS.setText("Music Off");
				poni.musikS.setForeground(new Color(255, 0, 0));
			}
		}
		if (sl[0].equalsIgnoreCase("ErrorCheck")){
			poni.frmPoniiPic.setVisible(false);
			main(new String[] {});
		}
		if (sl[0].equalsIgnoreCase("Color") || sl[0].equalsIgnoreCase("Colour")){
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.frmPoniiPic.getContentPane().setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputColor") || sl[0].equalsIgnoreCase("InputColour")){
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblTextArea.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputColor") || sl[0].equalsIgnoreCase("OutputColour")){
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblInfo.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputTextColor") || sl[0].equalsIgnoreCase("OutputTextColour")){
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblInfo.setForeground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputTextColor") || sl[0].equalsIgnoreCase("InputTextColour")){
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblTextArea.setForeground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("extract")) {
			if (sl.length > 1) {
				extract(sl[1]);
			} else { 
				extract();
			}
		}
		if (sl[0].equalsIgnoreCase("breed")) {
			Breeder b = new Breeder(new Ponii(), new Ponii());
			if (sl.length < 3) {
				poni.lblInfo.setText("Syntax is breed <Father>, <Mother>, [times]");
			} else {
				Boolean OCo = true, OCt = true;
				int f = -1, m = -1;
				for (int i = 0; i < chars.length; i ++){
					if (sl[1].equalsIgnoreCase(chars[i])) {
						f = i;
					}
					if (sl[1].equalsIgnoreCase(allias[i])) {
						f = i;
					}
				}
				for (int i = 0; i < cannon.length; i ++){
					if (sl[1].equalsIgnoreCase(cannon[i])) {
						f = i;
						OCo = false;
					}
				}
				for (int i = 0; i < chars.length; i ++){
					if (sl[2].equalsIgnoreCase(chars[i])) {
						m = i;
					}
					if (sl[2].equalsIgnoreCase(allias[i])) {
						m = i;
					}
				}
				for (int i = 0; i < cannon.length; i ++){
					if (sl[2].equalsIgnoreCase(cannon[i])) {
						m = i;
						OCt = false;
					}
				}
				if (OCo && OCt)
					b = new Breeder(OC[f], OC[m]);
				if (OCo && !OCt)
					b = new Breeder(OC[f], show[m]);
				if (!OCo && OCt)
					b = new Breeder(show[f], OC[m]);
				if (!OCo && !OCt)
					b = new Breeder(show[f], show[m]);
				if (sl.length == 4) {
					poni.printCl();
					b.check();
					for (int i = 0; i < Integer.parseInt(sl[3]); i ++) {
						poni.lblInfo.setText(poni.lblInfo.getText() + "\n" + b.breed());
					}
				} else {
					b.check();
					poni.lblInfo.setText(b.breed());
				}
			}
		}
	}

	private static void getOCInfo(int i) {
		int s = OC[i].getState(474201);
		poni.printCl();
		if (s == 1) {
			getInfoMWK(OC[i]);
		}
		if (s == 2) {
			getInfoSNG(OC[i]);
		}
		if (s == 3) {
			getInfoMNK(OC[i]);
		}
		if (s == 4) {
			getInfoMWK(OC[i]);
			if (musik) {
				poni.plaimusik(OC[i].getMusicPath());
			}
		}
		if (s == 5) {
			getInfoSNG(OC[i]);
			if (musik) {
				poni.plaimusik(OC[i].getMusicPath());
			}
		}
		if (s == 6) {
			getInfoMNK(OC[i]);
			if (musik) {
				poni.plaimusik(OC[i].getMusicPath());
			}
		}
		try{ 
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/" + OC[i].getImagePath()));
		} catch (IOException e) {
			System.out.println("This Shouldn't Have Happened... But it did...");
			e.printStackTrace();
		}
	}
	
	private static void getCaInfo(int i) {
		int s = show[i].getState(474201);
		if (s == 1) {
			getInfoMWK(show[i]);
		}
		if (s == 2) {
			getInfoSNG(show[i]);
		}
		if (s == 3) {
			getInfoMNK(show[i]);
		}
		if (s == 4) {
			getInfoMWK(show[i]);
			poni.plaimusik(show[i].getMusicPath());
		}
		if (s == 5) {
			getInfoSNG(show[i]);
			poni.plaimusik(show[i].getMusicPath());
		}
		if (s == 6) {
			getInfoMNK(show[i]);
			poni.plaimusik(show[i].getMusicPath());
		}
		try{ 
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/" + show[i].getImagePath()));
		} catch (IOException e) {
			System.out.println("This Shouldn't Have Happened... But it did...");
			e.printStackTrace();
		}
	}
	
	private static void getInfoMWK(Ponii tp) {
		String[] tSA = null;
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description : " + tp.getDesc());
		poni.println();
		poni.println("Cutii Mark : " + tp.getCMDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Married to : " + tp.getSp());
		poni.println("Number of Kids : " + tp.getKidAmmount());
		poni.println("Kids names : ");
		tSA = tp.getKids();
		for (int i = 0; i < tSA.length; i++){
			poni.println(tSA[i]);
		}
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}
	
	private static void getInfoMNK(Ponii tp) {
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description : " + tp.getDesc());
		poni.println();
		poni.println("Cutii Mark : " + tp.getCMDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Married to : " + tp.getSp());
		poni.println("Number of Kids : " + tp.getKidAmmount());
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}
	
	private static void getInfoSNG(Ponii tp) {
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description : " + tp.getDesc());
		poni.println();
		poni.println("Cutii Mark : " + tp.getCMDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}
	
	private static String help() {
		String XD = "Acceptable Ponii names:\n";
		poni.printCl();
		for (int i = 0; i < chars.length; i++) {
			XD = XD + "\n" + chars[i];
		}
		return XD;
	}
	
	private static void extract(String string) throws IOException {
		Boolean preformAction = false;
		String charToExtract = "null";
		for (int i = 0; i < OC.length; i ++){
			if (string.equalsIgnoreCase(chars[i])) {
				preformAction = true;
				charToExtract = OC[i].getImagePath();
			}
			if (string.equalsIgnoreCase(allias[i])) {
				preformAction = true;
				charToExtract = OC[i].getImagePath();
			}
		}
		if (preformAction) {
			System.out.println("Extracting : " + string);
			File f = new File("./extracted/");
			f.mkdir();
			send = new FileOutputStream(f + "/" + charToExtract);
			byte[] out = new byte[CharRP.class.getResourceAsStream("/images/" + charToExtract).available()];
			CharRP.class.getResourceAsStream("/images/" + charToExtract).read(out);
			send.write(out);
			System.out.println("Extracted : " + charToExtract + " to \"" + f.getAbsoluteFile() + "\"");
			send.close();
		}
	}
	
	private static void extract() throws IOException {
		for (int i = 0; i < OC.length; i ++) {
			extract(chars[i]);
		}
	}
}
