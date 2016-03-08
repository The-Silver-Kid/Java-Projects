/**
 * (C) 2015 DevTSK
 */
package Class;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import DevTSK.Util.Day;
import DevTSK.Util.NumGenerator;

// ur a nerd
public class Birthdaii {

	private JFrame window;
	private static JTextArea indai, inmonth, inyear, innom;
	private static JButton button;

	private final Action build = new Builder();

	public static void main(String[] args) {
		Birthdaii ab = new Birthdaii();
		ab.window.setVisible(true);
	}

	public Birthdaii() {
		window = new JFrame();
		window.getContentPane().setBackground(SystemColor.window);
		window.setIconImage(Toolkit.getDefaultToolkit().getImage(Birthdaii.class.getResource("/images/ikon.png")));
		window.setTitle("Array builder");
		window.setBackground(SystemColor.window);
		window.setResizable(false);
		window.setBounds(100, 100, 515, 305);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);

		JLabel tekxt = new JLabel();
		tekxt.setBounds(10, 10, 490, 20);
		tekxt.setText("Input Birthdays... one per line");
		tekxt.setForeground(SystemColor.windowText);
		window.getContentPane().add(tekxt);

		JLabel tekt = new JLabel();
		tekt.setBounds(10, 30, 490, 20);
		tekt.setText("Dai, Month, Year, Name");
		tekt.setForeground(SystemColor.windowText);
		window.getContentPane().add(tekt);

		indai = new JTextArea();
		indai.setBounds(10, 50, 110, 190);
		indai.setEditable(true);
		indai.setForeground(new Color(0, 0, 0));
		indai.setBackground(new Color(230, 230, 230));
		window.getContentPane().add(indai);

		inmonth = new JTextArea();
		inmonth.setBounds(130, 50, 110, 190);
		inmonth.setEditable(true);
		inmonth.setForeground(new Color(0, 0, 0));
		inmonth.setBackground(new Color(230, 230, 230));
		window.getContentPane().add(inmonth);

		inyear = new JTextArea();
		inyear.setBounds(250, 50, 110, 190);
		inyear.setEditable(true);
		inyear.setForeground(new Color(0, 0, 0));
		inyear.setBackground(new Color(230, 230, 230));
		window.getContentPane().add(inyear);

		innom = new JTextArea();
		innom.setBounds(370, 50, 110, 190);
		innom.setEditable(true);
		innom.setForeground(new Color(0, 0, 0));
		innom.setBackground(new Color(230, 230, 230));
		window.getContentPane().add(innom);

		button = new JButton();
		button.setAction(build);
		button.setBounds(10, 245, 490, 20);
		window.getContentPane().add(button);
	}

	public class Builder extends AbstractAction {
		private static final long serialVersionUID = 2753173073359879175L;

		public Builder() {
			putValue(NAME, "Generate");
		}

		public void actionPerformed(ActionEvent arg0) {
			Day d;
			Day td = new Day();
			NumGenerator ng = new NumGenerator(255, false);
			Boolean stop = false;
			int x = 10;
			String[] nom = innom.getText().split("\\n+");
			String[] yearst = inyear.getText().split("\\n");
			String[] montst = inmonth.getText().split("\\n");
			String[] daiist = indai.getText().split("\\n");
			JFrame[] frames = new JFrame[nom.length];
			int[] years = new int[yearst.length];
			int[] monts = new int[montst.length];
			int[] daiis = new int[daiist.length];
			if (years.length != monts.length || monts.length != daiis.length || daiis.length != nom.length)
				try {
					throw new Exception("Not Matching Lists");
				} catch (Exception e) {
					e.printStackTrace();
					stop = true;
				}
			if (!stop) {
				for (int e = 0; e < years.length; e++) {
					years[e] = Integer.parseInt(yearst[e]);
					monts[e] = Integer.parseInt(montst[e]);
					daiis[e] = Integer.parseInt(daiist[e]);
					d = new Day(years[e], monts[e], daiis[e]);
					frames[e] = new JFrame();
					frames[e].getContentPane().setBackground(new Color(0, 0, ng.gen()));
					frames[e].setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					frames[e].setType(Type.UTILITY);
					frames[e].setBounds(x, 0, 100, (int) td.daysFrom(d) / 8);
					frames[e].setTitle(nom[e]);
					frames[e].setResizable(false);
					frames[e].setVisible(true);
					x = x + 110;
				}
			}
		}
	}
}
