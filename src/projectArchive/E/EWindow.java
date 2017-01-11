package projectArchive.E;

import java.awt.Toolkit;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EWindow {

	JFrame Gameui;
	JLabel GameFrame;
	int w = 500;

	public EWindow() {
		Gameui = new JFrame();
		int w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

		if (w < 500 || h < 500) {
			Gameui.setBounds(0, 0, 200, 200);
			w = 200;
		} else {
			Gameui.setBounds(0, 0, 500, 500);
		}
		Gameui.setResizable(false);
		Gameui.setTitle("E");
		Gameui.setIconImage(Toolkit.getDefaultToolkit().getImage(EWindow.class.getResource("/files/ikon.png")));
		Gameui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gameui.getContentPane().setVisible(true);
		Gameui.getContentPane().setLayout(null);

		GameFrame = new JLabel();
		GameFrame.setBounds(Gameui.getBounds());
		Gameui.getContentPane().add(GameFrame);

		KeyListener gi = new EInput();
		Gameui.addKeyListener(gi);
	}

	public void gen() {
		// TODO Auto-generated method stub

	}
}
