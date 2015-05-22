/*
 * Char program to keep thing strait
 * (C) DevTSK Productions 2015
 * 
 * ADD CONTENT ONLY IF YOU KNOW EXACTLY WHAT YOU ARE DOING!
 * COMMENTS ARE THERE TO TELL YOU WHAT YOU SHOULD CHANGE
 * CHANGE ANYTHING ELSE AND IT MIGHT NOT WORK
 * 
 */

package DevTSK.Char;

import java.util.Arrays;
import java.util.Scanner;

public class Char {
	public static String[] chars = new String[] {"Shadow", "Shyne", "Steve", "Blitz"};
	public static String[] allias = new String[] {"Radon", "Shyne", "Orange", "Jet"};
	public static void main(String[] args){
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
		// DESCRIPTIONS (Pony and Cutii mark) MUST START WITH \n OTHERWISE IT WILL LOOK BAD.
		// NEW LINES IN DESCRIPTIONS LOOK SOMETHING LIKE THIS "\nDescription\nmore description" NOTE THAT THERE IS NO SPACE BETWENE \n AND THE NEXT WORD!
		// DESCRIPTION FORMAT IS: GENDER (M/S), RACE, COLOUR, ANY FEATURES OF THE BODY (if none don't include this), MANE COLOUR
		// DO NOT FOR ANY REASON PUT THE CUTII MARK DESCRIPTION IN THE PONII DESCRIPTION! IF YOU DO I WILL HUNT YOU DOWN!
		//
		//Married with kids: Name, Description, Cutie Mark, Mother, Father, Married to, int age, int ammount of kids, String[] child names, Image path
		//Not Married      : Name, Description, Cutie Mark, Mother, Father, int age, Image path
		//Married no kids  : Name, Description, Cutie Mark, Mother, Father, Married to, int age, MUST BE 0! OR ELSE!, Immage path
		String handler = "";
		/*
		 * Declare Poniis here
		 */
		Ponii shadow = new Ponii("Shadow Radon", "\nS\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 6, null, "/null.png");
		Ponii steve = new Ponii("Steve (Orange) Radon", "\nS\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", "Shyne", 19, 0, "/null.png");
		Ponii shyne = new Ponii("Shyne Radon", "\nM\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", "Orange", 20, 0, "/null.png");
		Ponii blitz = new Ponii("Blitz Radon", "\nM\nPlane Ponii\nlight grey coloured\nhas the wings of a airplane, turbines and all\nMane is roughly the same colour as her body", "\n airplane with similar wing structure as her own", "Charrie", "Slanger", "Steven", 18, 2, null, "/null.png");
		
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
				if (th.equalsIgnoreCase("blitz")) {
					getInfo(blitz);
				}
			}
		}
		keiboard.close();
	}
	
	private static void getInfo(Ponii t){
		int tstate = t.getState(474201);
		if (tstate == 0){
			System.out.println("ERROR 766 : Null Pony Exception");
			System.out.println("The Ponii has not been initilized!");
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
		System.out.println("Kids names : " + Arrays.toString(tp.getKids()));
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