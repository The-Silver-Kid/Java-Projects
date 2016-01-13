package Class.CH10;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import Class.Entity.Window;

public class ScrollTextThing {

	JFrame Window;
	JTextArea mainEvent;
	static ScrollTextThing Ctrlr;
	private static ScrollTextBack stb = new ScrollTextBack("Hi");
	//private static J

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ctrlr = new ScrollTextThing();
					Ctrlr.Window.setVisible(true);
					stb.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private ScrollTextThing() {
		Window = new JFrame();
		Window.getContentPane().setBackground(new Color(0, 0, 0));
		Window.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
		Window.setTitle("Starwars type text scrolly thingii");
		Window.setBackground(SystemColor.window);
		Window.setResizable(false);
		Window.setBounds(0, 0, 400, 200);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.getContentPane().setLayout(null);

		mainEvent = new JTextArea();
		mainEvent.setBounds(10, 10, 375, 150);
		mainEvent.setBackground(new Color(255, 255, 255));
		mainEvent.setForeground(new Color(0, 0, 0));
		mainEvent.setText("");
		mainEvent.setEditable(false);
		Window.getContentPane().add(mainEvent);
	}
}
