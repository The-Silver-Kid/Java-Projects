/* 
 * Char program to keep thing strait
 * (C) DevTSK Productions 2015
 */

package DevTSK.Char;

import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import DevTSK.Exception.UnexceptableContentException;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryJavaSound;

public class Window {
	public JFrame frmPoniiPic;
	public final Action action = new SwingAction();
	public JLabel lblPoniiPic;
	public JTextField lblTextArea;
	public JTextArea lblInfo;
	public JScrollPane loltest;
	public JButton in;
	public String handler = "";
	public SoundSystem ss;
	public JLabel musikS;
	
	public JFrame frmBreeder;
	public JTextArea mother;
	public JTextArea father;
	public JTextArea result;
	public JButton begin;
	public final Action breed = new Breed();
	
	public Window(String n, int close, int x, int y, int CharRPWin){
		if (CharRPWin == 0) {
			try {
				SoundSystemConfig.addLibrary(LibraryJavaSound.class);
				SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
			} catch (Exception e){
				System.err.println("ERROR LINKING WITHPLUGINS!");
				System.exit(4);
			}
			ss = new SoundSystem();
			
			frmPoniiPic = new JFrame();
			frmPoniiPic.getContentPane().setBackground(SystemColor.window);
			frmPoniiPic.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
			frmPoniiPic.setTitle(n);
			frmPoniiPic.setBackground(SystemColor.window);
			frmPoniiPic.setResizable(false);
			frmPoniiPic.setBounds(x, y, 700, 900);
			if (close == 0) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			} else if (close == 1) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} else {
				try {
					throw new UnexceptableContentException("Invalad Close Opperation");
				} catch (UnexceptableContentException e) {
					e.printStackTrace();
					frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
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
			musikS.setForeground(new Color(255, 0, 0));
			musikS.setText("Music Off");
			frmPoniiPic.getContentPane().add(musikS);
		}
		if (CharRPWin == 1) {
			frmBreeder = new JFrame();
			frmBreeder.getContentPane().setBackground(SystemColor.window);
			frmBreeder.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
			frmBreeder.setTitle(n);
			frmBreeder.setBackground(SystemColor.window);
			frmBreeder.setResizable(false);
			frmBreeder.setBounds(x, y, 600, 175);
			if (close == 0) {
				frmBreeder.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			} else if (close == 1) {
				frmBreeder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} else {
				try {
					throw new UnexceptableContentException("Invalad Close Opperation");
				} catch (UnexceptableContentException e) {
					e.printStackTrace();
					frmBreeder.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			frmBreeder.getContentPane().setLayout(null);		
			
			mother = new JTextArea();
			mother.setBounds(10, 10, 575, 20);
			mother.setBackground(new Color(0xffffff));
			mother.setForeground(new Color(0xff8989));
			mother.setText("Mother:");
			frmBreeder.getContentPane().add(mother);
			
			father = new JTextArea();
			father.setBounds(10, 40, 575, 20);
			father.setBackground(new Color(0xffffff));
			father.setForeground(new Color(0x0000ff));
			father.setText("Father:");
			frmBreeder.getContentPane().add(father);
			
			result = new JTextArea();
			result.setBounds(10, 70, 575, 20);
			result.setBackground(new Color(0xffffff));
			result.setForeground(new Color(0xff8989));
			result.setEditable(false);
			frmBreeder.getContentPane().add(result);
			
			begin = new JButton();
			begin.setAction(breed);
			begin.setBounds(10, 100, 575, 40);
			frmBreeder.getContentPane().add(begin);
		}
	}
	
	private ImageIcon getImIcn(String sr) throws Exception {
		Image img = ImageIO.read(Window.class.getResource(sr));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
	
	public void drawPic(String s) throws Exception{
		lblPoniiPic.setIcon(getImIcn(s));
	}
	
	public void println(String s) {
		lblInfo.setText(lblInfo.getText() + s + "\n");
	}
	
	public void println() {
		lblInfo.setText(lblInfo.getText() + "\n");
	}
	
	public void printCl() {
		lblInfo.setText("");
	}
	
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 3646194311743048047L;
		public SwingAction() {
			putValue(NAME, "Get string");
			putValue(SHORT_DESCRIPTION, "Pushes string to internal system.");
		}
		public void actionPerformed(ActionEvent arg0) {
			try {
				Char.handle(lblTextArea.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private class Breed extends AbstractAction {
		private static final long serialVersionUID = 3646194311743048047L;
		public Breed() {
			putValue(NAME, "Breed!");
		}
		public void actionPerformed(ActionEvent arg0) {
			Breeder b = new Breeder(PoniiBreeder.getMother(), PoniiBreeder.getFather());
			b.check();
			result.setText(b.breed());
		}
	}
	
	public void plaimusik(String s){
		ss.backgroundMusic("bgm.ogg", Window.class.getResource("/images/" + s), s, true);
	}

	public Icon getImageIcn(String imagePath) throws IOException {
		Image img = ImageIO.read(Window.class.getResource(imagePath));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
}