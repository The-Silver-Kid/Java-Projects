package DevTSK.Entity;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EntityLoader {
	// private static final File f = new File("./config/MasterControl.poniiconfig.ini");
	private static String lastCmd, name;
	private static String[] sl;

	private static FileOutputStream send;

	private static final String[] commandsyntax = new String[] { "Color <R> <G> <B>", "InputColor <R> <G> <B>",
			"OutputColor <R> <G> <B>", "OutputTextColor <R> <G> <B>", "InputTextColor <R> <G> <B>", "Exit",
			"extract [Entity name]", "breed <Mother> <Father> (broken)", "last / l / lastcmd", "cfg / config",
			"listNonOC", "listall", "info <entity name>", "charset", "switchcharset <Charset String Identifyer>" };

	private static final String[] commandexpl = new String[] { "Changes Background Color", "Changes input box color",
			"Changes outputbox color", "Changes outputbox text color", "Changes input box text color", "Exit the program (duh)",
			"extracts the given entity's image or all if none provided", "Generates a string derived from both parents",
			"reinputs last given command into the input box for editing or re-exicution",
			"saves color scheme to config file : Poniconfig.cfg", "lists all defined OC entitys", "lists all defined entitys",
			"gives general on the given entity type", "prints to console the current entity list String Identifyer",
			"switches the entity list" };

	private static final String[] commands = new String[] { "Colour", "Color", "InputColour", "InputColor",
			"OutputColour", "OutputColor", "Exit", "OutputTextColor", "InputTextColor", "OutputTextColour",
			"InputTextColour", "errorcheck", "extract", "breed", "last", "l", "lastcmd", "cfg", "config",
			"listNonOC", "listall", "info", "charset", "switchcharset", "help" };

	Entity[] OC;
	Entity[] show;

	public EntityLoader(Entity[] o, Entity[] c) {
		OC = o;
		show = c;
		//MasterControl.poni.lblInfo.setText("If you see this press the button before doing anything.");
		//MasterControl.poni.lblTextArea.setText("errorcheck");
		//MasterControl.poni.frmMasterControl.poniiPic.setVisible(true);
	}

	public void handle(String s) throws Exception {
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
			lastCmd = MasterControl.poni.lblTextArea.getText();
		}
		MasterControl.poni.lblTextArea.setText("");
		try {
			MasterControl.poni.lblPoniiPic.setIcon(MasterControl.poni.getImageIcn("/images/null.png"));
			MasterControl.poni.lblCMPic.setIcon(MasterControl.poni.getImageIcn("/images/null.png"));
		} catch (IOException e) {
		}
		if (handler >= 0) {
			getOCInfo(origin, handler);
		} else if (!controlVar) {
			MasterControl.poni.println(help());
		} else if (controlVar) {
			try {
				control(s);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void control(String s) throws Exception {
		String cmd = s;
		String[] sl = cmd.split("\\s+");
		if (sl[0].equalsIgnoreCase("Exit"))
			System.exit(0);
		if (sl[0].equalsIgnoreCase("ErrorCheck")) {
			System.out.println("Stub command");
		}
		if (sl[0].equalsIgnoreCase("Color") || sl[0].equalsIgnoreCase("Colour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				MasterControl.poni.frmPoniiPic.getContentPane().setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputColor") || sl[0].equalsIgnoreCase("InputColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				MasterControl.poni.lblTextArea.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputColor") || sl[0].equalsIgnoreCase("OutputColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				MasterControl.poni.lblInfo.setBackground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("OutputTextColor") || sl[0].equalsIgnoreCase("OutputTextColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				MasterControl.poni.lblInfo.setForeground(new Color(r, g, b));
			}
		}
		if (sl[0].equalsIgnoreCase("InputTextColor") || sl[0].equalsIgnoreCase("InputTextColour")) {
			if (sl.length == 4) {
				int r, g, b;
				r = Integer.parseInt(sl[1]);
				g = Integer.parseInt(sl[2]);
				b = Integer.parseInt(sl[3]);
				MasterControl.poni.lblTextArea.setForeground(new Color(r, g, b));
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
			Breeder b = new Breeder(null, null);
			if (sl.length < 3) {
				MasterControl.poni.lblInfo.setText("Syntax is breed <Father>, <Mother>, [times]");
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
					MasterControl.poni.printCl();
					b.check();
					for (int i = 0; i < Integer.parseInt(sl[3]); i++) {
						if (sl[0].equalsIgnoreCase("breed")) {
							MasterControl.poni.lblInfo.setText(MasterControl.poni.lblInfo.getText() + "\n" + b.breed());
						}
					}
				} else {
					b.check();
					if (sl[0].equalsIgnoreCase("breed")) {
						MasterControl.poni.lblInfo.setText(b.breed());
					}
				}
			}
		}
		if (sl[0].equalsIgnoreCase("listNonOC") || sl[0].equalsIgnoreCase("listall")) {
			MasterControl.poni.printCl();
			if (sl[0].equalsIgnoreCase("listall")) {
				MasterControl.poni.println("Acceptable OC/NonOC MasterControl.ponii Names: " + (OC.length + show.length));
				for (int i = 0; i < OC.length; i++) {
					MasterControl.poni.println(OC[i].getName() + " AKA " + OC[i].getAltName());
				}
				for (int i = 0; i < show.length; i++) {
					MasterControl.poni.println(show[i].getName() + " AKA " + show[i].getAltName());
				}
			} else {
				MasterControl.poni.println("Acceptable NonOC MasterControl.ponii Names: " + show.length);
				for (int i = 0; i < show.length; i++) {
					MasterControl.poni.println(show[i].getName() + " AKA " + show[i].getAltName());
				}
			}
		}
		if (sl[0].equalsIgnoreCase("last") || sl[0].equalsIgnoreCase("lastcmd") || sl[0].equalsIgnoreCase("l")) {
			MasterControl.poni.lblTextArea.setText(lastCmd);
		}
		if (sl[0].equalsIgnoreCase("cfg") || sl[0].equalsIgnoreCase("config")) {
			System.out.println("Saving Configuration...");

			byte[] tst = new byte[] {};
			String strnj = "version = 2.0;\n\n" + "bgr = " + MasterControl.poni.frmPoniiPic.getContentPane().getBackground().getRed()
					+ ";\n" + "bgg = " + MasterControl.poni.frmPoniiPic.getContentPane().getBackground().getGreen() + ";\n" + "bgb = "
					+ MasterControl.poni.frmPoniiPic.getContentPane().getBackground().getBlue() + ";\n\n" + "inbr = "
					+ MasterControl.poni.lblTextArea.getBackground().getRed() + ";\n" + "inbg = "
					+ MasterControl.poni.lblTextArea.getBackground().getGreen() + ";\n" + "inbb = "
					+ MasterControl.poni.lblTextArea.getBackground().getBlue() + ";\n\n" + "infr = "
					+ MasterControl.poni.lblTextArea.getForeground().getRed() + ";\n" + "infg = "
					+ MasterControl.poni.lblTextArea.getForeground().getGreen() + ";\n" + "infb = "
					+ MasterControl.poni.lblTextArea.getForeground().getBlue() + ";\n\n" + "outbr = "
					+ MasterControl.poni.lblInfo.getBackground().getRed() + ";\n" + "outbg = "
					+ MasterControl.poni.lblInfo.getBackground().getGreen() + ";\n" + "outbb = "
					+ MasterControl.poni.lblInfo.getBackground().getBlue() + ";\n\n" + "outfr = "
					+ MasterControl.poni.lblInfo.getForeground().getRed() + ";\n" + "outfg = "
					+ MasterControl.poni.lblInfo.getForeground().getGreen() + ";\n" + "outfb = "
					+ MasterControl.poni.lblInfo.getForeground().getBlue() + ";\n\n" + "sep = " + "false;";
			// + "frame = " + framew + ";";
			tst = strnj.getBytes();

			FileOutputStream send = new FileOutputStream("./MasterControl.poniiConfig.cfg");
			send.write(tst);
			send.close();
		}
		if (sl[0].equalsIgnoreCase("info")) {
			if (sl.length < 2 || sl.length > 2) {
				MasterControl.poni.printCl();
				MasterControl.poni.println(
						"Syntax is info <Entity>\nGives Info on the TYPE of MasterControl.ponii.\nIf the Entity name contains a space it wont work.");
			} else {
				MasterControl.poni.printCl();
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
						MasterControl.poni.println(OC[loc].getInfo());
					} else {
						MasterControl.poni.println(OC[loc].getInfo());
					}
				} else {
					System.err.println("Entity not found : " + sl[1]);
				}
			}
		}
		if (sl[0].equalsIgnoreCase("charset")) {
			MasterControl.poni.printCl();
			MasterControl.poni.println(name);
		}
		if (sl[0].equalsIgnoreCase("switchcharset")) {
			if (sl.length > 1) {
				System.out.println(sl[1]);
				MasterControl.main(new String[] { sl[1] });
			} else {
				MasterControl.poni.printCl();
				MasterControl.poni.println("Usage :\nswitchcharset <charset>");
			}
		}
		if (sl[0].equalsIgnoreCase("help")) {
			MasterControl.poni.printCl();
			for (int i = 0; i < commandsyntax.length; i++)
				MasterControl.poni.println(commandsyntax[i] + " : " + commandexpl[i]);
		}
	}

	private void getOCInfo(Boolean b, int i) {
		MasterControl.poni.printCl();

		if (b)
			MasterControl.poni.println(OC[i].toString());
		if (!b)
			MasterControl.poni.println(show[i].toString());

		if (b)
			try {
				MasterControl.poni.lblPoniiPic.setIcon(MasterControl.poni.getImageIcn("/images/" + OC[i].getImagePath()));
				MasterControl.poni.lblCMPic.setIcon(MasterControl.poni.getImageIcn("/images/" + OC[i].getAltImagePath()));
			} catch (IOException e) {
				System.out.println("This Shouldn't Have Happened... But it did...");
				e.printStackTrace();
			}
		if (!b)
			try {
				MasterControl.poni.lblPoniiPic.setIcon(MasterControl.poni.getImageIcn("/images/" + show[i].getImagePath()));
				MasterControl.poni.lblCMPic.setIcon(MasterControl.poni.getImageIcn("/images/" + show[i].getAltImagePath()));
			} catch (IOException e) {
				System.out.println("This Shouldn't Have Happened... But it did...");
				e.printStackTrace();
			}
	}

	private String help() {
		String XD = "Acceptable MasterControl.ponii names : " + OC.length + "\n";
		MasterControl.poni.printCl();
		for (int i = 0; i < OC.length; i++) {
			XD = XD + "\n" + OC[i].getName() + " AKA " + OC[i].getAltName();
		}
		return XD;
	}

	private void extract(String string) throws IOException {
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

	private void extract() throws IOException {
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
			send = new FileOutputStream(f + "/" + "MasterControl.poniiConfig.cfg");
			String charToExtract = "PoniiConfig.cfg";
			byte[] out = new byte[EntityLoader.class.getResourceAsStream("/images/" + charToExtract).available()];
			EntityLoader.class.getResourceAsStream("/images/" + charToExtract).read(out);
			send.write(out);
			System.out.println("Extracted : " + charToExtract + " to \"" + f.getAbsoluteFile() + "\"");
			send.close();
		}
	}
}
