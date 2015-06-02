/* 
 * Char program to keep thing strait
 * (C) DevTSK Productions 2015
 */

package DevTSK.Char;

import paulscode.sound.*;
import paulscode.sound.libraries.*;
import paulscode.sound.codecs.*;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Char {
	private JFrame frmPoniiPic;
	private final Action action = new SwingAction();
	public static JLabel lblPoniiPic;
	public static JTextField lblTextArea;
	public static JTextArea lblInfo;
	public static JScrollPane loltest;
	private static JButton in;
	public static String handler = "";
	public static SoundSystem ss;
	public static Boolean musik = true;
	public static JLabel musikS;
	
	public static String[] chars = new String[] {"Shadow", "Shyne", "Steve", "Blitz", "Charrie", "Slanger", "Tree", "Jack", "Zane", "Axel", "Dark Rainbow", "C418", "C523", "Steven"};
	public static String[] allias = new String[] {"Radon", "Shyne", "Orange", "Jet", "Firefly", "Radium", "Tree", "Jack", "Zane", "Axel", "Dark", "C4", "C5", "pizza ponii"};
	public static String[] cannon = new String[] {"Apple Jack", "Rainbow Dash", "Sunset Shimmer"};
	
	//OC poniis
	public static Ponii shadow = new Ponii("Shadow Radon", "\nStallion\nUnicorn\nBlack Coloured\nYellow Thunderbolt accross underside\nYellow Thunderbolts arround hooves\nYellow and Black mane\nLight Industries Member", "\nBlack Thundercloud with a yellow thunderbolt coming from it", "Charrie", "Slanger", "Apple Jack", 21, 6, new String[] {"Tree Lighting", "Shadow Jack", "Rhyne", "Aaron", "?", "Thorn"}, "/images/radon.png", "bgm.ogg");
	public static Ponii steve = new Ponii("Steve (Orange) Radon", "\nStallion\nPegaus\nDark Orange Coloured\nWing style that of a alicorn\nMane colour is same as body colour but has a yellow streak in it\nGigaplex Member", "\nWind marks in frount of a double edged sword.", "Charrie", "Slanger", 19, "/images/orange.png");
	public static Ponii shyne = new Ponii("Shyne Radon", "\nMare\nEarth Ponii\nLight Blue Coloured\ncoat sparkles when exposed to light\nMane colour is a bit brighter then body color\nPrefers to not take sides", "\nA devide simbol with green lines connecting the sides", "Charrie", "Slanger", 20, "/images/shyne.png");
	public static Ponii blitz = new Ponii("Blitz Radon", "\nMare\nPegasus\nDull Grey colour\nHas a boyfrind that makes pizza\nmane colour is a copper colour", "\n airplane with similar wing structure as her own", "Charrie", "Slanger", "Steven", 18, 2, new String[] {"Glydear", "Slader"}, "/images/blitz.png", "kloud.ogg");
	public static Ponii charrie = new Ponii("Charrie (Firefly) Sychace Radon", "\nMare\nPegasus\nPink Colour\nOld but cares allot about everyponii\nWhite Mane", "\nBlack Outlined White Thunderbolt", "Keri", "Craider", "Slanger", 67, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "/images/charrie.png");
	public static Ponii slanger = new Ponii("Slanger (Radium) Radon", "\nStallion\nEarth Ponii\nDark Purple colour\nJust like any old person (that isnt grouchy) he WILL make you laugh\nYellow Mane", "\nAncient symbol for magic", "Bradier", "George", "Charrie", 65, 4, new String[] {"Shadow", "Shyne", "Steve", "Blitz"}, "/images/slanger.png");
	public static Ponii tree = new Ponii("Tree Lighting Radon", "\nMare\nEarth Ponii\nSlightly darker orange then AJ\nCutest little filly ever sparkling with the same spark that her dad has\nShe likes the Blaze.\nMane is just a little more yellow then AJ's", "\nDosent have it yet...\nApple tree with lightning bolt behind it", "Apple Jack", "Shadow Radon", 4, "/images/lightning.png", "credits.ogg");
	public static Ponii jack = new Ponii("Shadow Jack Radon", "\nStallion\nUnicorn\nSame colour as AJ\nSecond Ponii on the AJ-Radon Line\nMane is like Radon's but slightly paler", "\nDosen't have yet...\nA cloud with snowflakes", "Apple Jack", "Shadow Radon", 0, "/images/jack.png");
	public static Ponii zane = new Ponii("Zane Fireshine", "\nStallion\nUnicorn\nBlack coloured\nDosent like leaving the ground\nBlack and Green Mane\nGigaplex Leader", "\nA Sandy coloured crossed box", "Solar Flare", "Earth Quakes", 20, "/images/zane.png");
	public static Ponii axel = new Ponii("Axel Fireshine", "\nStallion\nUnicorn\nA bright orange colour\nCan stand in intence flames and come out unharmed\nmane of fire\nLight Industries member", "\nfireball", "Solar Flare", "Earth Quakes", 18, "/images/axel.png");
	public static Ponii dark = new Ponii("Dark Rainbow", "\nStallion\nAlicorn\nGrey coloured\nHe is an alicorn but only looks like a pegasus because laws and crap\nRainbow like Rainbow Dash's", "\nan atom", "Franda", "Slaziur", "Rainbow Dash", 20, 0, "/images/DR.png");
	public static Ponii c418 = new Ponii("C418 (C4)", "\nStallion\nBlack colour\nMachine ponii built by radon that Looks almost exactly like him...", "\nDosent have one as he is a machine\nMane is the same as radon's only green instead of yellow", "N/A", "Shadow Radon", "C523", 5, 0, "/images/C4.png");
	public static Ponii c523 = new Ponii("C523 (C5)", "\nMare\nCream sort of colour\nAnother machine ponii built by radon however she was built for C4 to have a friend\nHas the same coloured mane as AJ", "\nDosent have one because she is a machine", "N/A", "Shadow Radon", "C418", 3, 0, "/images/null.png");
	public static Ponii steven = new Ponii();
	
	//Cannon poniis
	public static Ponii SS = new Ponii("Sunset Shimmer", "\nMare\nUnicorn\nYou know from EQG?", "\nThe yellow and red sun thing", "?", "?", 19, "/imgages/null.png");
	public static Ponii AJ = new Ponii("Apple Jack Radon", "\nMare\nEarth Ponii\nIts Apple Jack... yall know her", "\nThree red apples", "?", "?", "Shadow Radon", 22, 6, new String[] {"Tree Lighting", "Shadow Jack", "Rhyne", "Aaron", "?", "Thorn"}, "/images/AJ.png");
	public static Ponii RD = new Ponii("Rainbow Dash", "\nMare\nPegasus\nRainbow Dash... need i say more?", "\nThe Rainbow lightning bolt", "?", "?", "Dark Rainbow", 23, 0, "/images/RD.png");
	
	
	public static void main(String[] args){
		
		try {
			SoundSystemConfig.addLibrary(LibraryJavaSound.class);
			SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
		} catch (Exception e){
			System.err.println("ERROR LINKING WITHPLUGINS!");
			System.exit(4);
		}
		ss = new SoundSystem();
		
		
		Char window = new Char();
		window.frmPoniiPic.setVisible(true);
		
		try{
			lblPoniiPic.setIcon(getImIcn("/images/null.png"));
		} catch (Exception ii){
			System.exit(1);
		}
		
		if (chars.length != allias.length) {
			System.exit(3);
		}
	}
	
	public Char(){
		init();
	}
	
	private void init(){
		frmPoniiPic = new JFrame();
		frmPoniiPic.getContentPane().setBackground(SystemColor.window);
		frmPoniiPic.setIconImage(Toolkit.getDefaultToolkit().getImage(Char.class.getResource("/images/ikon.png")));
		frmPoniiPic.setTitle("Ponii Program");
		frmPoniiPic.setBackground(SystemColor.window);
		frmPoniiPic.setResizable(false);
		frmPoniiPic.setBounds(10, 10, 700, 900);
		frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmPoniiPic.getContentPane().setLayout(null);		
		
		lblPoniiPic = new JLabel();
		lblPoniiPic.setBounds(0, 0, 700, 700);
		frmPoniiPic.getContentPane().add(lblPoniiPic);
		
		lblTextArea = new JTextField();
		lblTextArea.setToolTipText("Ponii Name");
		lblTextArea.setText("");
		lblTextArea.setBounds(10, 710, 580, 20);
		frmPoniiPic.getContentPane().add(lblTextArea);
		
		lblInfo = new JTextArea();
		lblInfo.setWrapStyleWord(true);
		lblInfo.setToolTipText("Information box");
		lblInfo.setLineWrap(true);
		lblInfo.setText("");
		lblInfo.setBounds(10, 740, 670, 120);
		lblInfo.setEditable(false);
		frmPoniiPic.getContentPane().add(lblInfo);
		
		loltest = new JScrollPane(lblInfo);
		loltest.setBounds(10, 740, 670, 120);
		loltest.setAutoscrolls(true);
		frmPoniiPic.getContentPane().add(loltest);
		
		in = new JButton();
		in.setBounds(600, 710, 80, 20);
		in.setAction(action);
		frmPoniiPic.getRootPane().setDefaultButton(in);
		frmPoniiPic.getContentPane().add(in);
		
		musikS = new JLabel();
		musikS.setBounds(0,0,80,20);
		musikS.setForeground(new Color(0,255,0));
		musikS.setText("Music On");
		frmPoniiPic.getContentPane().add(musikS);
	}
	
	private static ImageIcon getImIcn(String sr) throws Exception {
		Image img = ImageIO.read(Char.class.getResource(sr));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
	
	private static void getInfo(Ponii t){
		int tstate = t.getState(474201);
		printCl();
		if (tstate == 0){
			System.out.println("ERROR 766 : Null Pony Exception");
			System.out.println("The Ponii " + handler + " has not been initilized!");
			System.exit(1);
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
		if (tstate == 4){
			getMK(t);
			plaimusik(t.getMusicPath());
		}
		if (tstate == 5){
			getS(t);
			plaimusik(t.getMusicPath());
		}
		if (tstate == 6){
			getMNK(t);
			plaimusik(t.getMusicPath());
		}
		try{
			drawPic(t.getImagePath());
		} catch (Exception ii) {
			System.exit(2);
		}
		loltest.getVerticalScrollBar();
		lblInfo.setCaretPosition(lblInfo.getDocument().getLength());
	}
	private static void drawPic(String s) throws Exception{
		lblPoniiPic.setIcon(getImIcn(s));
	}
	
	private static void getMK(Ponii tp){
		String[] tSA = null;
		println("Name : " + tp.getName());
		println("Age : " + tp.getAge());
		println();
		println("Description : " + tp.getDesc());
		println();
		println("Cutii Mark : " + tp.getCMDesc());
		println();
		println("Mother : " + tp.getMother());
		println("Father : " + tp.getFather());
		println();
		println("Married to : " + tp.getSp());
		println("Number of Kids : " + tp.getKidAmmount());
		println("Kids names : ");
		tSA = tp.getKids();
		for (int i = 0; i < tSA.length; i++){
			println(tSA[i]);
		}
		println();
		println("::End of Ponii::");
		println();
	}
	private static void getS(Ponii tp){
		println("Name : " + tp.getName());
		println("Age : " + tp.getAge());
		println();
		println("Description : " + tp.getDesc());
		println();
		println("Cutii Mark : " + tp.getCMDesc());
		println();
		println("Mother : " + tp.getMother());
		println("Father : " + tp.getFather());
		println();
		println();
	}
	private static void getMNK(Ponii tp){
		println("Name : " + tp.getName());
		println("Age : " + tp.getAge());
		println();
		println("Description : " + tp.getDesc());
		println();
		println("Cutii Mark : " + tp.getCMDesc());
		println();
		println("Mother : " + tp.getMother());
		println("Father : " + tp.getFather());
		println();
		println("Married to : " + tp.getSp());
		println("No Kids");
		println();
		println("::End of Ponii::");
		println();
	}
	
	private static void getHelp() {
		System.out.println("Recognized Poniis:");
		for (int i = 0; i < chars.length; i++){
			println(i + " : " + chars[i]);
		}
	}
	private static void println(String s) {
		lblInfo.setText(lblInfo.getText() + s + "\n");
	}
	
	private static void println() {
		lblInfo.setText(lblInfo.getText() + "\n");
	}
	
	private static void printCl() {
		lblInfo.setText("");
	}
	
	private static void handConv(String s){
		String th = "";
		handler = s;
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
		if (handler.equalsIgnoreCase("Exit") || handler.equalsIgnoreCase("music")) {
			th = "ignore";
		}
		if (th.equals("")) {
			getHelp();
		} else {
			/*
			 * IMPORTANT THAT YOU PUT AN if(th.equalsIgnoreCase("Ponii name from above chars String[] here") HERE IF YOU DONT IT WONT SHOW ANY INFORMATION!
			 * 
			 * DONT KNOW WHAT IT IS DONT TOUCH
			 * 
			 */
			ss.pause("bgm.ogg");
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
			if (th.equalsIgnoreCase("sunset shimmer")) {
				getInfo(SS);
			}
			if (th.equalsIgnoreCase("steven")){
				getInfo(steven);
			}
		}
		if (handler.equalsIgnoreCase("music")){
			musik = !musik;
			musikS.setForeground(new Color(255,0,0));
			musikS.setText("Music Off");
		}
		if (handler.equalsIgnoreCase("exit")) {
			ss.cleanup();
			System.exit(0);
		}
		lblTextArea.setText("");
	}
	
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 3646194311743048047L;
		public SwingAction() {
			putValue(NAME, "Get string");
			putValue(SHORT_DESCRIPTION, "Pushes string to internal system.");
		}
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("button pressed");
			System.out.println(lblTextArea.getText());
			handConv(lblTextArea.getText());
		}
		
	}
	
	private static void plaimusik(String s){
		if (musik){
			ss.backgroundMusic("bgm.ogg", Char.class.getResource("/images/" + s), s, true);
		}
	}
}