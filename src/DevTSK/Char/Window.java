/* 
 * Window Class
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
	public JLabel lblCMPic;
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
			
			lblCMPic = new JLabel();
			lblCMPic.setBounds(350, 0, 350, 350);
			frmPoniiPic.getContentPane().add(lblCMPic);
			
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
		// TODO: WIP
		//
		//
		if (CharRPWin == 1) {
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
			
			lblCMPic = new JLabel();
			lblCMPic.setBounds(350, 0, 350, 350);
			frmPoniiPic.getContentPane().add(lblCMPic);
			
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
	
	public void plaimusik(String s){
		ss.backgroundMusic("bgm.ogg", Window.class.getResource("/images/" + s), s, true);
	}

	public Icon getImageIcn(String imagePath) throws IOException {
		Image img = ImageIO.read(Window.class.getResource(imagePath));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
}