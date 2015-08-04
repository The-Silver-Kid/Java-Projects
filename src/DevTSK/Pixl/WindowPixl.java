package DevTSK.Pixl;

import java.awt.Toolkit;

import javax.swing.*;

import DevTSK.Char.Window;

public class WindowPixl {
	
	public JFrame Menui;
	public static JButton E;
	public static JButton M;
	public static JButton H;
	public static JButton X;
	
	public JFrame Gameui;
	public static JLabel GameFrame;
	
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
	}
}
