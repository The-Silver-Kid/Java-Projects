/* created by reggii peck
 * main game window
 * and all event stuff
 * all by me so far
 * yeah had to re write so yeah.
 * 
 * Possable button for attack and defend other then text field
 */

package ISD;

import java.util.*;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.Graphics;

import javax.imageio.*;

//import java.io.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.ImageObserver;

public class Game {
	
	//public variables
	public JFrame frmHehehejar;
	public static JTextArea txtLoadGameOr;
	public static JLabel picOne;
	public static JLabel picTwo;
	public static JTextField txtin;
	public static JButton btnIn;
	public static int health;
	public static String in;
	public final Action getIn = new gettingin();
	public static ImageObserver ion = null;
	public static Random rn = new Random();
	public static String[] cout = new String[10];
	public static int coutInt = 0;
	
	
	//start of game
	public static void main(String args[]) throws Exception {
		health = 50;
		System.out.println("Prepairing to claim the universe!");
		System.out.println("                          ~DevTSK");
		
		Game win = new Game();
		win.frmHehehejar.setVisible(true);
		
		Badii h = new Badii("Lary", "/Images/ikon.png", 1, 1, 0);
		h.sethe(1);
		
		//picOne.setIcon(getImIcn(h.getimagePath()));
		
		/*while (!(in.equals("Exit"))) {
			println(in);
			int r = 256,g = 256,b = 256;
			while (r < 255 && g < 255 && b < 255) {
				r = (int) Math.random() * 999 + 1;
				b = (int) Math.random() * 999 + 1;
				g = (int) Math.random() * 999 + 1;
			}
			printColour(new Color(r,g,b));
		}*/
		
	}
	
	public Game() {
		initialize();
	}
	
	//sets up the window
	private void initialize() {
		frmHehehejar = new JFrame();
		frmHehehejar.setIconImage(Toolkit.getDefaultToolkit().getImage(Game.class.getResource("/images/ikon.png")));
		frmHehehejar.getContentPane().setForeground(SystemColor.windowText);
		frmHehehejar.getContentPane().setBackground(SystemColor.window);
		frmHehehejar.setBackground(SystemColor.window);
		frmHehehejar.setTitle("Escape Game");
		frmHehehejar.setBounds(100, 100, 600, 600);
		frmHehehejar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHehehejar.getContentPane().setLayout(null);
		frmHehehejar.setResizable(false);
		
		txtLoadGameOr = new JTextArea();
		txtLoadGameOr.setText("Console:");
		txtLoadGameOr.setEditable(false);
		txtLoadGameOr.setBackground(SystemColor.window);
		txtLoadGameOr.setForeground(SystemColor.windowText);
		txtLoadGameOr.setBounds(10, 350, 572, 162);		
		txtLoadGameOr.setLineWrap(true);
/*		txtLoadGameOr.setRows(5);
		txtLoadGameOr.setColumns(5);
		txtLoadGameOr.setAutoscrolls(true);*/
		frmHehehejar.getContentPane().add(txtLoadGameOr);
		
		txtin = new JTextField();
		txtin.setText("");
		txtin.setEditable(true);
		txtin.setHorizontalAlignment(SwingConstants.CENTER);
		txtin.setBackground(SystemColor.window);
		txtin.setForeground(SystemColor.windowText);
		txtin.setBounds(10, 522, 472, 32);
		frmHehehejar.getContentPane().add(txtin);
		txtin.setColumns(1);
		
		picOne = new JLabel();
		picOne.setBounds(10,10,100,100);
		frmHehehejar.getContentPane().add(picOne);
		
		picTwo = new JLabel();
		picTwo.setBounds(110,10,100,100);
		frmHehehejar.getContentPane().add(picTwo);
		
		btnIn = new JButton();
		btnIn.setBounds(500, 522, 80, 32);
		btnIn.setAction(getIn);
		frmHehehejar.getContentPane().add(btnIn, "2, 2");
	}
	
	//gets Image file and sets to JLabel
	public static ImageIcon getImIcn(String sr) throws Exception {
		Image img = ImageIO.read(Game.class.getResource(sr));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
	
	public static Image getIm(String sr) throws Exception {
		Image img = ImageIO.read(Game.class.getResource(sr));
		return img;
	}
	
	public static Graphics setGr(Graphics gr, String sr, ImageObserver ooh) throws Exception {
		Image img = getIm(sr);
		gr = img.getGraphics();
		return gr;
	}
	
	//upon clicking the ACT! button
	private class gettingin extends AbstractAction{
		/**
		 * Button action
		 */
		
		private static final long serialVersionUID = 1L;
		public gettingin() {
			putValue(NAME, "ACT!");
			putValue(SHORT_DESCRIPTION, "Send the action in the box to the internal system.");
		}
		public void actionPerformed(ActionEvent e) {
			if (!(txtin.getText().equals(""))){
				in = txtin.getText();
				System.out.println(in);
				System.out.println("Retreved " + txtin.getText());
				txtin.setText("");
				handlr();
			}
		}
	}
	
	// writes information to the game console
    public static void println(String x) {
    	//x = txtLoadGameOr.getText() + "\n" + x;
    	
    	txtLoadGameOr.setText(x);
   }
    
    // sets colour of game console
    public static void printColour(Color c){
    	txtLoadGameOr.setForeground(c);
    }
    
    public static void printlnc(String x){
    	int r = 256,g = 256,b = 256;
		r = rn.nextInt(255);
		b = rn.nextInt(255);
		g = rn.nextInt(255);
		println(in);
		printColour(new Color(r,g,b));
    }
    
    public static void printlnsc(String x, Color c){
    	println(in);
		printColour(c);
    }
    
    public static void print(String x) {
    	txtLoadGameOr.setText(x);
    }
    
    // handls actions and stuff
    public static void handlr() {
    	 
    	
    }
}