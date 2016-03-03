package DevTSK.Util;

import java.awt.Toolkit;
import javax.swing.JFrame;

// import DevTSK.Char.Window;

public class BasicWindow {

	public JFrame Gameui;
	//public JLabel GameFrame;
	public static Boolean gamerunning;

	public BasicWindow() {
		Gameui = new JFrame();
		int w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		if (w < 500 || h < 500) {
			Gameui.setBounds(0, 0, 200, 200);
		} else {
			Gameui.setBounds(0, 0, 500, 500);
		}
		Gameui.setResizable(false);
		Gameui.setTitle("Pixl Game");
		Gameui.setIconImage(Toolkit.getDefaultToolkit().getImage(BasicWindow.class.getResource("/images/ikon.png")));
		Gameui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Gameui.getContentPane().setVisible(false);
		Gameui.getContentPane().setLayout(null);

		//GameFrame = new JLabel();
		//GameFrame.setBounds(Gameui.getBounds());
		//Gameui.getContentPane().add(GameFrame);
	}
}
