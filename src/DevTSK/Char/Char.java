/*
 * Char program to keep thing strait
 * (C) DevTSK Productions
 */

package DevTSK.Char;

import java.util.Arrays;
import java.util.Scanner;

public class Char {
	public static String[] chars = new String[] {"Shadow", "Shyne", "Steve", "Blitz"};
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		//String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm
		//String n, String d, String cm, String mother, String father, int aje, String imm
		//String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String imm
		String handler = "";
		Ponii shadow = new Ponii("Shadow Radon", "Test Desc", "Description of cutiemark here", "Charrie", "Slanger", "AJ", 21, 6, null, "/null.png");
		Ponii steve = new Ponii("Steve (Orange) Radon", "Moar test", "Test", "Charrie", "Slanger", "Shyne", 19, 0, "/null.png");
		Ponii shyne = new Ponii("Shyne Radon", "TEst", "Test", "Charrie", "Slanger", "Orange", 20, 0, "/null.png");
		Ponii blitz = new Ponii("Blitz Radon", "Test Desc", "Description of cutiemark here", "Charrie", "Slanger", "Steven", 18, 2, null, "/null.png");
		
		
		Scanner keiboard = new Scanner(System.in);
		while (!(handler.equals("Exit"))){
			String th = "";
			handler = keiboard.nextLine();
			for (int i = 0; i > chars.length; i++){
				if (handler.equals(chars[i])) {
					th = chars[i];
				}
			}
			if (handler.equals("Exit")) {
				th = "Exit";
			}
			if (th.equals("")) {
				getHelp();
			} else {
				//getInfo(th);
			}
		}
	}
	
	private static void getInfo(String s){
		System.out.println(s);
		Ponii t = new Ponii();
		int tstate = t.getState(474201);
		if (tstate == 0){
			System.out.println("ERROR 766 : Null Pony Exception");
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
		System.out.println("Description : " + tp.getDesc());
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println("Married to : " + tp.getSp());
		System.out.println("Age : " + tp.getAge());
		System.out.println("Number of Kids : " + tp.getKidAmmount());
		System.out.println("Kids names : " + Arrays.toString(tp.getKids()));
		System.out.println();
	}
	
	private static void getS(Ponii tp){
		System.out.println("Name : " + tp.getName());
		System.out.println("Description : " + tp.getDesc());
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println("Age : " + tp.getAge());
		System.out.println();
	}
	
	private static void getMNK(Ponii tp){
		System.out.println("Name : " + tp.getName());
		System.out.println("Description : " + tp.getDesc());
		System.out.println("Cutie Mark : " + tp.getCMDesc());
		System.out.println("Mother : " + tp.getMother());
		System.out.println("Father : " + tp.getFather());
		System.out.println("Married to : " + tp.getSp());
		System.out.println("Age : " + tp.getAge());
		System.out.println("Number of Kids : " + tp.getKidAmmount());
		System.out.println();
	}
	
	private static void getHelp() {
		System.out.println();
		System.out.println("Recognized Poniis:");
		for (int i = 0; i > chars.length; i++){
			System.out.print(i + ":");
			System.out.print(chars[i]);
			System.out.println();
		}
	}
}