package E;

import java.awt.Toolkit;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EWindow {

	public JFrame Gameui;
	public JLabel GameFrame;
	public static Boolean gamerunning;

	public EWindow() {
		Gameui = new JFrame();
		int w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

		if (w < 500 || h < 500) {
			Gameui.setBounds(0, 0, 200, 200);
		} else {
			Gameui.setBounds(0, 0, 500, 500);
		}
		Gameui.setResizable(false);
		Gameui.setTitle("E");
		Gameui.setIconImage(Toolkit.getDefaultToolkit().getImage(EWindow.class.getResource("/images/ikon.png")));
		Gameui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Gameui.getContentPane().setVisible(false);
		Gameui.getContentPane().setLayout(null);

		GameFrame = new JLabel();
		GameFrame.setBounds(Gameui.getBounds());
		Gameui.getContentPane().add(GameFrame);

		KeyListener gi = new EInput();
		Gameui.addKeyListener(gi);
	}
}
