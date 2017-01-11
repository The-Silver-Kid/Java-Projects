package projectArchive.RSync;

import javax.swing.JFrame;
import DevTSK.Util.Logger;

public class RSync {

	public static Logger l = new Logger(new String[] { "[-]", "[X]", "[!]" });

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 1024, 720);
		window.setTitle("YOLO!");
		window.getContentPane().setVisible(true);
		window.getContentPane().setLayout(null);
		window.setResizable(false);
		window.setVisible(true);

		ProjectPanel pp = new ProjectPanel();
		window.add(pp);
	}
}
