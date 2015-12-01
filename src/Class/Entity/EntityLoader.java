/**
 * @author The_Silver_Kid
 */

package Class.Entity;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import DAG.Config.Config;
import DAG.Config.ConfigException;

/**
 * Class that handles the window and the displaying of information
 */
public class EntityLoader {
	// private static final File f = new File("./config/Poniiconfig.ini");
	private static String lastCmd, name;
	private static String[] sl;

	private static FileOutputStream send;

	static Window poni = new Window("Ponii Program 3.0", 1, 0, 0, 0);

	private static final String[] commandsyntax = new String[] { "Color <R> <G> <B>", "InputColor <R> <G> <B>",
			"OutputColor <R> <G> <B>", "OutputTextColor <R> <G> <B>", "InputTextColor <R> <G> <B>", "Exit",
			"extract [Entity name]", "breed <Mother> <Father> (broken)", "last / l / lastcmd", "cfg / config",
			"listNonOC", "listall", "info <entity name>", "charset", "switchcharset <Charset String Identifyer>" };

	private static final String[] commandexpl = new String[] { "Changes Background Color", "Changes input box color",
			"Changes outputbox color", "Changes outputbox text color", "Changes input box text color", "Exit the program (duh)",
			"extracts the given entity's image or all if none provided", "Generates a string derived from both parents",
			"reinputs last given command into the input box for editing or re-exicution",
			"saves color scheme to config file : poniconfig.cfg", "lists all defined OC entitys", "lists all defined entitys",
			"gives general on the given entity type", "prints to console the current entity list String Identifyer",
			"switches the entity list" };

	private static final String[] commands = new String[] { "Colour", "Color", "InputColour", "InputColor",
			"OutputColour", "OutputColor", "Exit", "OutputTextColor", "InputTextColor", "OutputTextColour",
			"InputTextColour", "errorcheck", "extract", "breed", "last", "l", "lastcmd", "cfg", "config",
			"listNonOC", "listall", "info", "charset", "switchcharset", "help" };

	private static Entity[] OC;
	private static Entity[] show;

	/**
	 * Main constructor that sets up everything.
	 *
	 * @param Entity
	 *            array of your own made up chars
	 * @param Entity
	 *            array of original chars
	 */
	public EntityLoader(Entity[] o, Entity[] c) {
		OC = o;
		show = c;
		poni.lblInfo.setText("If you see this press the button before doing anything.");
		poni.lblTextArea.setText("errorcheck");
		poni.frmPoniiPic.setVisible(true);
	}

	/**
	 * Method that handles input and outpus hence the name
	 *
	 * @param s
	 */
	public static void handle(String s) {
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
				//TODO
				getOCInfo(handler);
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

	/**
	 * Method for interpreting commands and executing them accordingly
	 *
	 * @param s
	 * @throws IOException
	 * @throws ConfigException
	 */
	private static void control(String s) throws IOException, ConfigException {
		String cmd = s;
		String[] sl = cmd.split("\\s+");
		if (sl[0].equalsIgnoreCase("Exit"))
			System.exit(0);
		if (sl[0].equalsIgnoreCase("ErrorCheck")) {
			System.out.println("HA HA fooled you all!");
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
		if (sl[0].equalsIgnoreCase("breed")) {
			Breeder b = new Breeder(new Entity(), new Entity());
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
						}
					}
				} else {
					b.check();
					if (sl[0].equalsIgnoreCase("breed")) {
						poni.lblInfo.setText(b.breed());
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
		if (sl[0].equalsIgnoreCase("charset")) {
			poni.printCl();
			poni.println(name);
		}
		if (sl[0].equalsIgnoreCase("switchcharset")) {
			if (sl.length > 1) {
				System.out.println(sl[1]);
				MasterControl.main(new String[] { sl[1] });
			} else {
				poni.printCl();
				poni.println("Usage :\nswitchcharset <charset>");
			}
		}
		if (sl[0].equalsIgnoreCase("help")) {
			poni.printCl();
			for (int i = 0; i < commandsyntax.length; i++)
				poni.println(commandsyntax[i] + " : " + commandexpl[i]);
		}
	}

	/**
	 * Method to get and display information from the Entity
	 *
	 * @param i
	 */
	private static void getOCInfo(int i) {
		String s = OC[i].toString();
		System.out.println(s);
		poni.printCl();
		poni.println(s);

		try {
			poni.lblPoniiPic.setIcon(poni.getImageIcn("/images/" + OC[i].getImagePath()));
			poni.lblCMPic.setIcon(poni.getImageIcn("/images/" + OC[i].getAltImagePath()));
		} catch (IOException e) {
			System.out.println("This Shouldn't Have Happened... But it did...");
			e.printStackTrace();
		}
	}

	/**
	 * Returns a list of all made up chars
	 *
	 * @return stringOfNames
	 */
	private static String help() {
		String XD = "Acceptable Ponii names : " + OC.length + "\n";
		poni.printCl();
		for (int i = 0; i < OC.length; i++) {
			XD = XD + "\n" + OC[i].getName() + " AKA " + OC[i].getAltName();
		}
		return XD;
	}

	/**
	 * Extracts a Entity image from the jar to extracted\EntityName.png
	 *
	 * @param entityName
	 * @throws IOException
	 */
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

	/**
	 * Extracts all made up entity images to extracted\EntityName.png
	 *
	 * @throws IOException
	 */
	private static void extract() throws IOException {
		for (int i = 0; i < OC.length; i++) {
			extract(OC[i].getName());
		}
	}

	/**
	 * Extracts the default configuration file to .\poniiconfig.cfg
	 *
	 * @throws IOException
	 */
	public void extractConfig() throws IOException {
		Boolean preformAction = true;
		if (preformAction) {
			System.out.println("Extracting : Configuration File");
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

	/**
	 * 'Punches' the system to activate it and load the configuration from file
	 * and sets the text to the last update log
	 *
	 * @throws ConfigException
	 */
	public void punch() throws ConfigException {
		poni.action.actionPerformed(null);
		if (new Config("./PoniiConfig.cfg").getDouble("version") < 2.0) {
			poni.printCl();
			poni.println("Modifyed the system for school");
		}
	}

	/**
	 * Modifyes the window's apperence based upon the configuration file
	 * 
	 * @param charsetname
	 * @throws ConfigException
	 */
	public void setupConfig(String charsetname) throws ConfigException {
		Config c = new Config("./PoniiConfig.cfg");

		name = charsetname;

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
