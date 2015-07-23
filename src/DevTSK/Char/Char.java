package DevTSK.Char;

import java.awt.Color;
import java.io.*;

import DevTSK.Exception.*;

public class Char {
	//private static final File f = new File("./config/Poniiconfig.ini");
	private static String lastCmd;
	private static String[] sl;
	
	private static FileOutputStream send;
	
	private static Window poni = new Window("Ponii Program 3.0", 1, 0, 0, 0);
	
	private static String[] chars;
	private static String[] allias;
	private static String[] cannon;
	
	private static final String[] commands = new String[] {
		"Colour", "Color", "InputColour", "InputColor", "OutputColour", "OutputColor", "Music", "Exit",
		"OutputTextColor", "InputTextColor", "OutputTextColour", "InputTextColour", "errorcheck" , "extract",
		"breed", "breedrand", "last", "l", "lastcmd"
	};
	
	private static Boolean musik = false;
	
	private static Ponii[] OC;
	private static Ponii[] show;
	
	public Char(String[] ch, String[] al, String[] cn, Ponii[] o, Ponii[] c){
		chars = ch;
		allias = al;
		cannon = cn;
		OC = o;
		show = c;
		poni.lblInfo.setText("If you see this press the button before doing anything.");
		poni.lblTextArea.setText("errorcheck");
		poni.frmPoniiPic.setVisible(true);
	}

	public static void errorCheck() throws Exception{
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

	public static void handle(String s) throws Exception {
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
			sl = s.split("\\s+");
			if (commands[i].equalsIgnoreCase(sl[0])){
				controlVar = true;
			}
		}
		if (!sl[0].equalsIgnoreCase("last") && !sl[0].equalsIgnoreCase("lastcmd") && !sl[0].equalsIgnoreCase("l")){
			lastCmd = poni.lblTextArea.getText();
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
	
	@SuppressWarnings("deprecation")
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
			errorCheck();
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
		if (sl[0].equalsIgnoreCase("breed") || sl[0].equalsIgnoreCase("Breedrand")) {
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
						if (sl[0].equalsIgnoreCase("breed")) {
							poni.lblInfo.setText(poni.lblInfo.getText() + "\n" + b.breed());
						} else {
							poni.lblInfo.setText(poni.lblInfo.getText() + "\n" + b.breedrand());
						}
					}
				} else {
					b.check();
					if (sl[0].equalsIgnoreCase("breed")) {
						poni.lblInfo.setText(b.breed());
					} else {
						poni.lblInfo.setText(b.breedrand());
					}
				}
			}
		}
		if (sl[0].equalsIgnoreCase("last") || sl[0].equalsIgnoreCase("lastcmd") || sl[0].equalsIgnoreCase("l")){
			poni.lblTextArea.setText(lastCmd);
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
		poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
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
		poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
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
		poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
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
			byte[] out = new byte[Char.class.getResourceAsStream("/images/" + charToExtract).available()];
			Char.class.getResourceAsStream("/images/" + charToExtract).read(out);
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

	public static double getDefVer() {
		return 3.5;
	}

	public static String[] getDefinitions(int i) {
		String[] ret = new String[] {};
		if (i == 0)
			ret = chars;
		if (i == 1)
			ret = allias;
		if (i == 2)
			ret = cannon;
		return ret;
	}

	public static Ponii[] getPoniiDefinitions(int i) {
		Ponii[] ret = new Ponii[] {};
		if (i == 0)
			ret = OC;
		if (i == 1)
			ret = show;
		return ret;
	}
	
	public void punch(){
		poni.action.actionPerformed(null);
	}
}
