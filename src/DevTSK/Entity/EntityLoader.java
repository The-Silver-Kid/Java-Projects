package DevTSK.Entity;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import DAG.Config.Config;
import DAG.Config.ConfigException;

public class EntityLoader {
	// private static final File f = new File("./config/Poniiconfig.ini");
	private static String lastCmd;
	private static String[] sl;

	private static FileOutputStream send;

	private static Window poni = new Window("Ponii Program 3.0", 1, 0, 0, 0);

	private static final String[] commands = new String[] { "Colour", "Color", "InputColour", "InputColor",
			"OutputColour", "OutputColor", "Exit", "OutputTextColor", "InputTextColor", "OutputTextColour",
			"InputTextColour", "errorcheck", "extract", "breed", "breedrand", "last", "l", "lastcmd", "cfg", "config",
			"listNonOC", "listall", "info" };

	private static Entity[] OC;
	private static Entity[] show;

	public EntityLoader(Entity[] o, Entity[] c) {
		OC = o;
		show = c;
		poni.lblInfo.setText("If you see this press the button before doing anything.");
		poni.lblTextArea.setText("errorcheck");
		poni.frmPoniiPic.setVisible(true);
	}

	public static void errorCheck() throws Exception {
		System.out.println("\nChecking out Inputed Resources...\n\nChecking chars and allias String[]s...");
		System.out.println("chars and allias String[]s checks out...\nChecking Ponii[] OC compatablity...");
		System.out.println("Ponii[] OC compatablity checks out...\nChecking Ponii[] show compatablity...");
		System.out.println("Ponii[] show compatablity checks out...\nChecking ponii resources...");
		System.out.println("Everything Checks out fine... Assuming all is well in the land...");
	}

	public static void handle(String s) throws Exception {
		int handler = -1;
		Boolean origin = true, controlVar = false;
		for (int i = 0; i < OC.length; i++) {
			if (OC[i].getName().equalsIgnoreCase(s)) {
				handler = i;
			}
			if (s.equalsIgnoreCase(OC[i].getAltName())) {
				handler = i;
			}
		}
		for (int i = 0; i < show.length; i++) {
			if (show[i].getName().equalsIgnoreCase(s)) {
				handler = i;
				origin = false;
			}
			if (show[i].getAltName().equalsIgnoreCase(s)) {
				handler = i;
				origin = false;
			}
		}
		for (int i = 0; i < commands.length; i++) {
			sl = s.split("\\s+");
			if (commands[i].equalsIgnoreCase(sl[0])) {
				controlVar = true;
			}
		}
		if (!sl[0].equalsIgnoreCase("last") && !sl[0].equalsIgnoreCase("lastcmd") && !sl[0].equalsIgnoreCase("l")) {
			lastCmd = poni.lblTextArea.getText();
		}
		poni.lblTextArea.setText("");
		try {
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/null.png"));
			poni.lblCMPic.setIcon(poni.getImageIcn("/images/null.png"));
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
		if (sl[0].equalsIgnoreCase("ErrorCheck")) {
			errorCheck();
		}
		if (sl[0].equalsIgnoreCase("Color") || sl[0].equalsIgnoreCase("Colour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.frmPoniiPic.getContentPane().setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputColor") || sl[0].equalsIgnoreCase("InputColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblTextArea.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputColor") || sl[0].equalsIgnoreCase("OutputColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblInfo.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputTextColor") || sl[0].equalsIgnoreCase("OutputTextColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				poni.lblInfo.setForeground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputTextColor") || sl[0].equalsIgnoreCase("InputTextColour")) {
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
				for (int i = 0; i < OC.length; i++) {
					if (sl[1].equalsIgnoreCase(OC[i].getName())) {
						f = i;
					}
					if (sl[1].equalsIgnoreCase(OC[i].getAltName())) {
						f = i;
					}
				}
				for (int i = 0; i < show.length; i++) {
					if (sl[1].equalsIgnoreCase(show[i].getName())) {
						f = i;
						OCo = false;
					}
					if (sl[1].equalsIgnoreCase(show[i].getAltName())) {
						f = i;
						OCo = false;
					}
				}
				for (int i = 0; i < OC.length; i++) {
					if (sl[2].equalsIgnoreCase(OC[i].getName())) {
						m = i;
					}
					if (sl[2].equalsIgnoreCase(OC[i].getAltName())) {
						m = i;
					}
				}
				for (int i = 0; i < show.length; i++) {
					if (sl[2].equalsIgnoreCase(show[i].getName())) {
						m = i;
						OCt = false;
					}
					if (sl[2].equalsIgnoreCase(show[i].getAltName())) {
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
					for (int i = 0; i < Integer.parseInt(sl[3]); i++) {
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
		if (sl[0].equalsIgnoreCase("listNonOC") || sl[0].equalsIgnoreCase("listall")) {
			poni.printCl();
			if (sl[0].equalsIgnoreCase("listall")) {
				poni.println("Acceptable OC/NonOC Ponii Names: " + (OC.length + show.length));
				for (int i = 0; i < OC.length; i++) {
					poni.println(OC[i].getName() + " AKA " + OC[i].getAltName());
				}
				for (int i = 0; i < show.length; i++) {
					poni.println(show[i].getName() + " AKA " + show[i].getAltName());
				}
			} else {
				poni.println("Acceptable NonOC Ponii Names: " + show.length);
				for (int i = 0; i < show.length; i++) {
					poni.println(show[i].getName() + " AKA " + show[i].getAltName());
				}
			}
		}
		if (sl[0].equalsIgnoreCase("last") || sl[0].equalsIgnoreCase("lastcmd") || sl[0].equalsIgnoreCase("l")) {
			poni.lblTextArea.setText(lastCmd);
		}
		if (sl[0].equalsIgnoreCase("cfg") || sl[0].equalsIgnoreCase("config")) {
			System.out.println("Saving Configuration...");

			byte[] tst = new byte[] {};
			String strnj = "version = 2.0;\n\n" + "bgr = " + poni.frmPoniiPic.getContentPane().getBackground().getRed()
					+ ";\n" + "bgg = " + poni.frmPoniiPic.getContentPane().getBackground().getGreen() + ";\n" + "bgb = "
					+ poni.frmPoniiPic.getContentPane().getBackground().getBlue() + ";\n\n" + "inbr = "
					+ poni.lblTextArea.getBackground().getRed() + ";\n" + "inbg = "
					+ poni.lblTextArea.getBackground().getGreen() + ";\n" + "inbb = "
					+ poni.lblTextArea.getBackground().getBlue() + ";\n\n" + "infr = "
					+ poni.lblTextArea.getForeground().getRed() + ";\n" + "infg = "
					+ poni.lblTextArea.getForeground().getGreen() + ";\n" + "infb = "
					+ poni.lblTextArea.getForeground().getBlue() + ";\n\n" + "outbr = "
					+ poni.lblInfo.getBackground().getRed() + ";\n" + "outbg = "
					+ poni.lblInfo.getBackground().getGreen() + ";\n" + "outbb = "
					+ poni.lblInfo.getBackground().getBlue() + ";\n\n" + "outfr = "
					+ poni.lblInfo.getForeground().getRed() + ";\n" + "outfg = "
					+ poni.lblInfo.getForeground().getGreen() + ";\n" + "outfb = "
					+ poni.lblInfo.getForeground().getBlue() + ";\n\n" + "sep = " + "false;";
			// + "frame = " + framew + ";";
			tst = strnj.getBytes();

			FileOutputStream send = new FileOutputStream("./PoniiConfig.cfg");
			send.write(tst);
			send.close();
		}
		if (sl[0].equalsIgnoreCase("info")) {
			if (sl.length < 2 || sl.length > 2) {
				poni.printCl();
				poni.println(
						"Syntax is info <Entity>\nGives Info on the TYPE of ponii.\nIf the Entity name contains a space it wont work.");
			} else {
				poni.printCl();
				Boolean doop = false, origin = false;
				int loc = -1;
				for (int i = 0; i < OC.length; i++) {
					if (sl[1].equalsIgnoreCase(OC[i].getName()) || sl[1].equalsIgnoreCase(OC[i].getAltName())) {
						doop = true;
						loc = i;
					}
				}
				for (int i = 0; i < show.length; i++) {
					if (sl[1].equalsIgnoreCase(show[i].getName()) || sl[1].equalsIgnoreCase(show[i].getAltName())) {
						doop = true;
						origin = true;
						loc = i;
					}
				}
				if (doop) {
					if (!origin) {
						poni.println(OC[loc].getInfo());
					} else {
						poni.println(OC[loc].getInfo());
					}
				} else {
					System.err.println("Entity not found : " + sl[1]);
				}
			}
		}
	}

	private static void getOCInfo(int i) {
		String s = OC[i].toString();
		System.out.println(s);
		poni.printCl();
		if (s.equalsIgnoreCase("MarriedPonii")) {
			getInfoMWK(OC[i]);
		}
		if (s.equalsIgnoreCase("UnMarriedPonii")) {
			getInfoSNG(OC[i]);
		}
		if (s.equalsIgnoreCase("UnMarriedPoniiWithKids")) {
			getInfoSNGK(OC[i]);
		}
		if (s.equalsIgnoreCase("MarriedPoniiWithOtherKids")) {
			getInfoMWKOMK(OC[i]);
		}

		try {
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/" + OC[i].getImagePath()));
			poni.lblCMPic.setIcon(poni.getImageIcn("/images/" + OC[i].getAltImagePath()));
		} catch (IOException e) {
			System.out.println("This Shouldn't Have Happened... But it did...");
			e.printStackTrace();
		}
	}

	private static void getCaInfo(int i) {
		String s = show[i].toString();
		System.out.println(s);
		poni.printCl();
		if (s.equalsIgnoreCase("MarriedPonii")) {
			getInfoMWK(show[i]);
		}
		if (s.equalsIgnoreCase("UnMarriedPonii")) {
			getInfoSNG(show[i]);
		}
		if (s.equalsIgnoreCase("UnMarriedPoniiWithKids")) {
			getInfoSNGK(show[i]);
		}
		if (s.equalsIgnoreCase("MarriedPoniiWithOtherKids")) {
			getInfoMWKOMK(show[i]);
		}

		try {
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/" + show[i].getImagePath()));
			poni.lblCMPic.setIcon(poni.getImageIcn("/images/" + show[i].getAltImagePath()));
		} catch (IOException e) {
			System.out.println("This Shouldn't Have Happened... But it did...");
			e.printStackTrace();
		}
	}

	private static void getInfoMWKOMK(Entity tp) {
		String[] tSA = null;
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description :\n" + tp.getGender() + "\nMane Colour : " + tp.getColour(0) + "\nTail Colour : "
				+ tp.getColour(1) + tp.getDesc());
		poni.println();
		if (tp.getYear() >= 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
		if (tp.getYear() < 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + (tp.getYear() * -1) + "BC");
		poni.println();
		poni.println("Cutii Mark : " + tp.getAddDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Married to : " + tp.getPartner());
		poni.println("Number of Kids : " + tp.getKidAmmount());
		poni.println("Kids names : ");
		tSA = tp.getKidnames();
		String[] tpk = tp.getKidParents();
		for (int i = 0; i < tSA.length; i++) {
			poni.println("With\t" + tpk[i] + "\t : " + tSA[i]);
		}
		poni.println();
		poni.println("Flag: '" + tp.getFlag() + "'");
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}

	private static void getInfoSNGK(Entity tp) {
		String[] tSA = null;
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description :\n" + tp.getGender() + "\nMane Colour : " + tp.getColour(0) + "\nTail Colour : "
				+ tp.getColour(1) + tp.getDesc());
		poni.println();
		if (tp.getYear() >= 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
		if (tp.getYear() < 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + (tp.getYear() * -1) + "BC");
		poni.println();
		poni.println("Cutii Mark : " + tp.getAddDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Number of Kids : " + tp.getKidAmmount());
		poni.println("Kids names : ");
		tSA = tp.getKidnames();
		String[] tpk = tp.getKidParents();
		for (int i = 0; i < tSA.length; i++) {
			poni.println("With\t" + tpk[i] + "\t : " + tSA[i]);
		}
		poni.println();
		poni.println("Flag: '" + tp.getFlag() + "'");
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}

	private static void getInfoMWK(Entity tp) {
		String[] tSA = null;
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description :\n" + tp.getGender() + "\nMane Colour : " + tp.getColour(0) + "\nTail Colour : "
				+ tp.getColour(1) + tp.getDesc());
		poni.println();
		if (tp.getYear() >= 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
		if (tp.getYear() < 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + (tp.getYear() * -1) + "BC");
		poni.println();
		poni.println("Cutii Mark : " + tp.getAddDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Married to : " + tp.getPartner());
		poni.println("Number of Kids : " + tp.getKidAmmount());
		poni.println("Kids names : ");
		tSA = tp.getKidnames();
		for (int i = 0; i < tSA.length; i++) {
			poni.println(tSA[i]);
		}
		poni.println();
		poni.println("Flag: '" + tp.getFlag() + "'");
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}

	private static void getInfoSNG(Entity tp) {
		System.out.println("Loading resources for ponii " + tp.getName());
		poni.println("Name : " + tp.getName());
		poni.println("Age : " + tp.getAge());
		poni.println();
		poni.println("Description :\n" + tp.getGender() + "\nMane Colour : " + tp.getColour(0) + "\nTail Colour : "
				+ tp.getColour(1) + tp.getDesc());
		poni.println();
		if (tp.getYear() >= 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + tp.getYear());
		if (tp.getYear() < 0)
			poni.println("Birthday : " + tp.getMonth() + " " + tp.getDay() + ", " + (tp.getYear() * -1) + "BC");
		poni.println();
		poni.println("Cutii Mark : " + tp.getAddDesc());
		poni.println();
		poni.println("Mother : " + tp.getMother());
		poni.println("Father : " + tp.getFather());
		poni.println();
		poni.println("Flag: '" + tp.getFlag() + "'");
		poni.println();
		poni.println("::End of Ponii::");
		poni.println();
	}

	private static String help() {
		String XD = "Acceptable Ponii names : " + OC.length + "\n";
		poni.printCl();
		for (int i = 0; i < OC.length; i++) {
			XD = XD + "\n" + OC[i].getName() + " AKA " + OC[i].getAltName();
		}
		return XD;
	}

	private static void extract(String string) throws IOException {
		Boolean preformAction = false;
		String charToExtract = "null";
		for (int i = 0; i < OC.length; i++) {
			if (string.equalsIgnoreCase(OC[i].getAltName())) {
				preformAction = true;
				charToExtract = OC[i].getImagePath();
			}
			if (string.equalsIgnoreCase(OC[i].getName())) {
				preformAction = true;
				charToExtract = OC[i].getImagePath();
			}
		}
		if (preformAction) {
			System.out.println("Extracting : " + string);
			File f = new File("./extracted/");
			f.mkdir();
			send = new FileOutputStream(f + "/" + charToExtract);
			byte[] out = new byte[EntityLoader.class.getResourceAsStream("/images/" + charToExtract).available()];
			EntityLoader.class.getResourceAsStream("/images/" + charToExtract).read(out);
			send.write(out);
			System.out.println("Extracted : " + charToExtract + " to \"" + f.getAbsoluteFile() + "\"");
			send.close();
		}
	}

	private static void extract() throws IOException {
		for (int i = 0; i < OC.length; i++) {
			extract(OC[i].getName());
		}
	}

	public void extractConfig() throws IOException {
		Boolean preformAction = true;
		if (preformAction) {
			System.out.println("Extracting : " + "Configuration File");
			File f = new File("./");
			f.mkdir();
			send = new FileOutputStream(f + "/" + "PoniiConfig.cfg");
			String charToExtract = "PoniiConfig.cfg";
			byte[] out = new byte[EntityLoader.class.getResourceAsStream("/images/" + charToExtract).available()];
			EntityLoader.class.getResourceAsStream("/images/" + charToExtract).read(out);
			send.write(out);
			System.out.println("Extracted : " + charToExtract + " to \"" + f.getAbsoluteFile() + "\"");
			send.close();
		}
	}

	public void punch() throws ConfigException {
		poni.action.actionPerformed(null);
		if (new Config("./PoniiConfig.cfg").getDouble("version") < 2.0) {
			poni.printCl();
			poni.println("Re-wrote internal system entirely...\n"
					+ "added info command : info <Entity> : cannot be used with spaces in names\n"
					+ "removed sound system and music command");
		}
	}

	public void setupConfig() throws ConfigException {
		Config c = new Config("./PoniiConfig.cfg");

		if (c.getBoolean("sep")) {
			poni.frmPoniiPic.setVisible(false);
			poni = new Window("Ponii Program 3.0", 1, 0, 0, 1);
			poni.frmPoniiPic.setVisible(true);
			poni.frmPoniiPicCont.setVisible(true);
			int r = c.getInt("bgr"), g = c.getInt("bgg"), b = c.getInt("bgb");
			poni.frmPoniiPicCont.getContentPane().setBackground(new Color(r, g, b));
		}

		int r = c.getInt("bgr"), g = c.getInt("bgg"), b = c.getInt("bgb");
		poni.frmPoniiPic.getContentPane().setBackground(new Color(r, g, b));

		r = c.getInt("inbr");
		g = c.getInt("inbg");
		b = c.getInt("inbb");
		poni.lblTextArea.setBackground(new Color(r, g, b));

		r = c.getInt("infr");
		g = c.getInt("infg");
		b = c.getInt("infb");
		poni.lblTextArea.setForeground(new Color(r, g, b));

		r = c.getInt("outfr");
		g = c.getInt("outfg");
		b = c.getInt("outfb");
		poni.lblInfo.setForeground(new Color(r, g, b));

		r = c.getInt("outbr");
		g = c.getInt("outbg");
		b = c.getInt("outbb");
		poni.lblInfo.setBackground(new Color(r, g, b));
	}
}
