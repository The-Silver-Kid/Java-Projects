package projectArchive.Pixl;

import java.awt.Toolkit;
import java.awt.event.KeyListener;

import javax.swing.*;

import DevTSK.Char.Window;

public class WindowPixl {
	
	public JFrame Menui;
	public static JButton E;
	public static JButton M;
	public static JButton H;
	public static JButton X;
	
	public JFrame Gameui;
	public JApplet GameFrame;
	public static Boolean gamerunning;
	
	public static final Action Easy = new setEasy();
	public static final Action Medi = new setMedi();
	public static final Action Hard = new setHard();
	public static final Action Exit = new setExit();
	
	public WindowPixl() {
		Menui = new JFrame();
		Menui.setBounds(0, 0, 200, 277);
		Menui.setResizable(false);
		Menui.setTitle("Pixl Menui");
		Menui.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
		Menui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Menui.getContentPane().setVisible(true);
		Menui.getContentPane().setLayout(null);	
		
		E = new JButton();
		E.setAction(Easy);
		E.setBounds(0, 0, 194, 62);
		Menui.getContentPane().add(E);
		
		M = new JButton();
		M.setAction(Medi);
		M.setBounds(0, 62, 194, 62);
		Menui.getContentPane().add(M);
		
		H = new JButton();
		H.setAction(Hard);
		H.setBounds(0, 124, 194, 62);
		Menui.getContentPane().add(H);
		
		X = new JButton();
		X.setAction(Exit);
		X.setBounds(0, 186, 194, 62);
		Menui.getContentPane().add(X);
		
		Gameui = new JFrame();
		int w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		if (w < 500 || h < 500) {
			Gameui.setBounds(0, 0, 200, 200);
			Main.b = false;
		} else {
			Gameui.setBounds(0, 0, 500, 500);
		}
		Gameui.setResizable(false);
		Gameui.setTitle("Pixl Game");
		Gameui.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
		Gameui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Gameui.getContentPane().setVisible(false);
		Gameui.getContentPane().setLayout(null);
		
		GameFrame = new JApplet();
		GameFrame.setBounds(Gameui.getBounds());
		Gameui.getContentPane().add(GameFrame);
		
		KeyListener gi = new GetInput();
		Gameui.addKeyListener(gi);
	}
}
