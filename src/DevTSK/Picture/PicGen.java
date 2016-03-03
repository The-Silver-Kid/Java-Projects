package DevTSK.Picture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import DevTSK.Util.NumGenerator;

public class PicGen {

	private static JFrame window;
	private static final NumGenerator ng = new NumGenerator(255, false);

	public static void main(String[] args) {
		window = new JFrame();
		window.setBounds(10, 10, 500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("YOLO!");
		window.getContentPane().setVisible(true);
		window.getContentPane().setLayout(null);
		window.setIconImage(Toolkit.getDefaultToolkit().getImage(PicGen.class.getResource("/images/ikon.png")));
		window.setVisible(true);
		while (true)
			window.paint(update());
	}

	public static Graphics update() {
		Graphics g = window.getGraphics();

		while (true) {
			for (int y = 0; y < window.getHeight(); y++) {
				for (int x = 0; x < window.getWidth(); x++) {
					g.setColor(new Color(ng.gen(), ng.gen(), ng.gen()));
					g.drawLine(x, y, x, y);
				}
			}
		}
		//return g;
	}
}
