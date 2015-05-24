/* 
 * Char program to keep thing strait
 * (C) DevTSK Productions 2015
 * 
 * ADD CONTENT ONLY IF YOU KNOW EXACTLY WHAT YOU ARE DOING!
 * COMMENTS ARE THERE TO TELL YOU WHAT YOU SHOULD CHANGE
 * CHANGE ANYTHING ELSE AND IT MIGHT NOT WORK
 * 
 * TO ADD A PONII THERE ARE FOUR THINGS YOU NEED TO DO:
 * 0: ADD NAME TO CHARS ARRAY
 * 1: ADD A NICKNAME TO ALLIAS ARRAY, IF NO NICKNAME JUST PUT NAME IN THERE
 * 2: INITALIZE YOUr PONII CLASS
 * 3: ADD AN IF STATEMENT WITH GETINFO TO YOUR PONII CLASS IN IT
 */

package DevTSK.Char;

import java.util.Scanner;

public class CharRP {
	// THESE HERE ARE CRITICLY IMPORTANT!
	// IF YOU DONT PUT YOUR PONII'S NAME HERE IT WONT RECOGNIZE THE NEW PONII!
	// THE TOP ONE IS FOR THEIR REAL NAME! THE SECOND FOR THEIR NICNAME IF NONE JUST PUT THERE NAME AGAIN!
	public static String[] chars = new String[] {"Shadow", "Shyne", "Steve", "Blitz", "Charrie", "Slanger", "Tree", "Jack", "Zane", "Axel", "Dark Rainbow", "C418", "C523"};
	public static String[] allias = new String[] {"Radon", "Shyne", "Orange", "Jet", "Firefly", "Radium", "Tree", "Jack", "Zane", "Axel", "Dark", "C4", "C5"};
	public static String[] cannon = new String[] {"Apple Jack", "Rainbow Dash"};
	public static String handler;
	public static void main(String[] args){
		// Please don't delete this *beg-face*
		handler = "";
		//
		// CORRECT ANY SPELLING MISTAKES
		//
		// I DISCOURAGE ADDING CANNON PONIIS BUT IF THEY ARE DIRECTLY RELATED TO AN OC (FATHER, MOTHER, MARRIED, CHILD) THEN GO FOR IT.
		// CANNON PONIIS WILL NOT DISPLAY IN THE RECOGNIZED PONIIS LIST
		// ADD CANNON PONIIS TO THE CANNON String[] NOT THE CHARS OR ALLIAS!
		//
		// NEVER EVER CALL YOU PONII A PONY EVEN IN A DESCRIPTION THEY ARE NOT THE SAME AND THE CLASS ITSELF IS PONII NOT PONY!
		// IF YOU WANT TO USE PONY GO MAKE A NEW APP YOURSELF!
		//
		// FORMAT FOR CONSTRUCTORS!
		// ALL ARE STRINGS UNLESS OTHERWISE NOTED!
		//
		// IF THEY HAVE KIDS IT MUST BE A String[]!
		// IF YOU NEED HELP MAKING THE String[] JUST PUT IN null AND COMMENT IN THE KIDS NAMES BELOW I WILL ADD THEM LATER!
		//
		// IMAGES MUST GO IN THE IMAGES FOLDER!
		// IF YOU NEED HELP WITH THE IMAGE PATH JUST PUT THE IMAGE IN THE IMAGES FOLDER AND PUT IN THE CONSTRUCTOR "/null.png"
		//
		// DESCRIPTIONS (Pony and Cutie mark) MUST START WITH \n OTHERWISE IT WILL LOOK BAD.
		// NEW LINES IN DESCRIPTIONS LOOK SOMETHING LIKE THIS "\nDescription\nmore description" NOTE THAT THERE IS NO SPACE BETWENE \n AND THE NEXT WORD!
		// DESCRIPTION FORMAT IS: GENDER (M/S), RACE, COLOUR, SOMETHING SPECIAL, MANE COLOUR
		// DO NOT FOR ANY REASON PUT THE CUTII MARK DESCRIPTION IN THE PONII DESCRIPTION! IF YOU DO I WILL HUNT YOU DOWN!
		//
		// Married with kids: Name, Description, Cutie Mark, Mother, Father, Married to, int age, int amount of kids, String[] child names, Image path
		// Not Married      : Name, Description, Cutie Mark, Mother, Father, int age, Image path
		// Married no kids  : Name, Description, Cutie Mark, Mother, Father, Married to, int age, MUST BE 0! OR ELSE!, Image path
		//
		/*
		 * Declare Poniis here
		 */
		Ponii shadow = new Ponii("Shadow Radon", "\nStallion\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Member", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 6, new String[] {"Tree Lighting", "Shadow Jack"}, "/null.png");
		Ponii steve = new Ponii("Steve (Orange) Radon", "\nStallion\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it\nGigaplex Member", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", "Shyne", 19, 0, "/null.png");
		Ponii shyne = new Ponii("Shyne Radon", "\nMare\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color\nPrefers to not take sides", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", "Orange", 20, 0, "/null.png");
		Ponii blitz = new Ponii("Blitz Radon", "\nMare\nPegasus\nDull Grey colour\nHas a boyfrind that makes pizza\nmane colour is a copper colour", "\n airplane with similar wing structure as her own", "Charrie", "Slanger", "Steven", 18, 0, "/null.png");
		Ponii charrie = new Ponii("Charrie (Firefly) Sychace Radon", "\nMare\nPegasus\nPink Colour\nOld but cares allot about everyponii\nWhite Mane", "\nBlack Outlined White Thunderbolt", "Keri", "Craider", "Slanger", 67, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "/null.png");
		Ponii slanger = new Ponii("Slanger (Radium) Radon", "\nStallion\nUnicorn\nDark Purple colour\nJust like any old person (that isnt grouchy) he WILL make you laugh\nYellow Mane", "\nAncient symbol for magic", "Bradier", "George", "Charrie", 65, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "/null.png");
		Ponii tree = new Ponii("Tree Lighting Radon", "\nMare\nEarth Ponii\nSlightly darker orange then AJ\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes the Blaze.\nMane is just a little more yellow then AJ's", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Apple Jack", "Shadow Radon", 4, "/null.png");
		Ponii jack = new Ponii("Shadow Jack Radon", "\nStallion\nUnicorn\nSame colour as AJ\nSecond Ponii on the AJ-Radon Line\nMane is like Radon's but slightly paler", "\nDosen't have yet...\nA cloud with snowflakes", "Apple Jack", "Shadow Radon", 0, "/null.png");
		Ponii zane = new Ponii("Zane Fireshine", "\nStallion\nUnicorn\nBlack coloured\nDosent like leaving the ground\nBlack and Green Mane\nGigaplex Leader", "\nA Sandy coloured crossed box", "Solar Flare", "Earth Quakes", 20, "/null.png");
		Ponii axel = new Ponii("Axel Fireshine", "\nStallion\nUnicorn\nA bright orange colour\nCan stand in intence flames and come out unharmed\nmane of fire\nLight Industries member", "\nfireball", "Solar Flare", "Earth Quakes", 18, "/null.png");
		Ponii dark = new Ponii("Dark Rainbow", "\nStallion\nAlicorn\nGrey coloured\nHe is an alicorn but only looks like a pegasus because laws and crap\nRainbow like Rainbow Dash's", "\nan atom", "Franda", "Slaziur", "Rainbow Dash", 20, 0, "/null.png");
		Ponii AJ = new Ponii("Apple Jack Radon", "\nMare\nEarth Ponii\nIts Apple Jack... yall know her", "\nThree red apples", "?", "?", "Shadow Radon", 22, 2, new String[] {"Tree Lighting", "Shadow Jack"}, "/null.png");
		Ponii RD = new Ponii("Rainbow Dash", "\nMare\nPegasus\nRainbow Dash... need i say more?", "\nThe Rainbow lightning bolt", "?", "?", "Dark Rainbow", 23, 0, "/null.png");
		Ponii c418 = new Ponii("C418 (C4)", "\nStallion\nBlack colour\nMachine ponii built by radon that Looks almost exactly like him...", "\nDosent have one as he is a machine\nMane is the same as radon's only green instead of yellow", "N/A", "Shadow Radon", "C523", 5, 0, "/null.png");
		Ponii c523 = new Ponii("C523 (C5)", "\nMare\nCream sort of colour\nAnother machine ponii built by radon however she was built for C4 to have a friend\nHas the same coloured mane as AJ", "\nDosent have one because she is a machine", "N/A", "Shadow Radon", "C418", 3, 0, "/null.png");
		
		if (chars.length != allias.length) {
			System.out.println("CHAR AND ALLIAS ARE DIFFERENT LENGTHS! THIS WILL CAUSE ERRORS!");
		}
		
		System.out.println("Enter Exit to exit (such amaze)");
		System.out.println("Enter Ponii name here:");
		Scanner keiboard = new Scanner(System.in);
		while (!(handler.equalsIgnoreCase("Exit"))){
			String th = "";
			handler = keiboard.nextLine();
			for (int i = 0; i < chars.length; i++){
				if (handler.equalsIgnoreCase(chars[i])) {
					th = chars[i];
				}
				if (handler.equalsIgnoreCase(allias[i])){
					th = chars[i];
				}
			}
			for (int i = 0; i < cannon.length; i++) {
				if (handler.equalsIgnoreCase(cannon[i])){
					th = cannon[i];
				}
			}
			if (handler.equalsIgnoreCase("Exit")) {
				th = "closing app";
			}
			if (handler.equalsIgnoreCase("cls") || handler.equalsIgnoreCase("clear")) {
				klear();
				th = "klearing!";
			}
			if (th.equals("")) {
				getHelp();
			} else {
				/*
				 * IMPORTANT THAT YOU PUT AN IF HERE IF YOU DONT IT WONT SHOW ANY INFORMATION!
				 */
				if (th.equalsIgnoreCase("shadow")){
					getInfo(shadow);
				}
				if (th.equalsIgnoreCase("steve")){
					getInfo(steve);
				}
				if (th.equalsIgnoreCase("shyne")){
					getInfo(shyne);
				}
				if (th.equalsIgnoreCase("blitz")){
					getInfo(blitz);
				}
				if (th.equalsIgnoreCase("charrie")){
					getInfo(charrie);
				}
				if (th.equalsIgnoreCase("slanger")){
					getInfo(slanger);
				}
				if (th.equalsIgnoreCase("jack")){
					getInfo(jack);
				}
				if (th.equalsIgnoreCase("tree")){
					getInfo(tree);
				}
				if (th.equalsIgnoreCase("zane")){
					getInfo(zane);
				}
				if (th.equalsIgnoreCase("axel")){
					getInfo(axel);
				}
				if (th.equalsIgnoreCase("dark rainbow")){
					getInfo(dark);
				}
				if (th.equalsIgnoreCase("Apple Jack")){
					getInfo(AJ);
				}
				if (th.equalsIgnoreCase("Rainbow Dash")){
					getInfo(RD);
				}
				if (th.equalsIgnoreCase("C418")){
					getInfo(c418);
				}
				if (th.equalsIgnoreCase("C523")){
					getInfo(c523);
				}
			}
		}
		keiboard.close();
	}
	
	private static void getInfo(Ponii t){
		int tstate = t.getState(474201);
		if (tstate == 0){
			System.out.println("ERROR 766 : Null Pony Exception");
			System.out.println("The Ponii " + handler + " has not been initilized!");
		}
		if (tstate == 1){
			getMK(t);
		}
		if (tstate == 2){
			getS(t);
		}
		if (tstate == 3){
			getMNK(t);
		}
	}
	
	private static void getMK(Ponii tp){
		String[] tSA = null;
		System.out.println("Name : " + tp.getName());
		System.out.println("Age : " + tp.getAge());
		System.out.println();
		System.out.println("Description : " + tp.getDesc());
		System.out.println();
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println();
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println();
		System.out.println("Married to : " + tp.getSp());
		System.out.println("Number of Kids : " + tp.getKidAmmount());
		System.out.println("Kids names : ");
		tSA = tp.getKids();
		for (int i = 0; i < tSA.length; i++){
			System.out.println(tSA[i]);
		}
		System.out.println();
		System.out.println("::End of Ponii::");
		System.out.println();
	}
	
	private static void getS(Ponii tp){
		System.out.println("Name : " + tp.getName());
		System.out.println("Age : " + tp.getAge());
		System.out.println();
		System.out.println("Description : " + tp.getDesc());
		System.out.println();
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println();
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println();
		System.out.println("::End of Ponii::");
		System.out.println();
	}
	
	private static void getMNK(Ponii tp){
		System.out.println("Name : " + tp.getName());
		System.out.println("Age : " + tp.getAge());
		System.out.println();
		System.out.println("Description : " + tp.getDesc());
		System.out.println();
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println();
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println();
		System.out.println("Married to : " + tp.getSp());
		System.out.println("No Kids");
		System.out.println();
		System.out.println("::End of Ponii::");
		System.out.println();
	}
	
	private static void getHelp() {
		System.out.println("Recognized Poniis:");
		for (int i = 0; i < chars.length; i++){
			System.out.print(i + " : ");
			System.out.print(chars[i]);
			System.out.println();
		}
	}
	private static void klear() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Enter Ponii name here:");
	}
}