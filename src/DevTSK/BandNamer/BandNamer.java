/* Gabe Hill working on the file IO for the words
 * Zack Arbanas is working on collecting and organising words to use
 * The_Silver_Kid overall project */

package DevTSK.BandNamer;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class BandNamer {

	public static String[] nouns;
	public static String[] verbs;
	public static String[] adverbs;
	public static String[] adjectives;

	public JFrame bandNamer;
	public static JLabel output;
	public static JButton get;
	public static JButton neo;
	public static JLabel bld;
	public static JProgressBar bar;

	static int n;
	static int v;
	static int av = 0;
	static int aj;

	static String end = "";

	private final Action getNeoName = new SwingAction2();

	private BandNamer() {
		init();
	}

	private void init() {
		bandNamer = new JFrame();
		bandNamer.getContentPane().setBackground(SystemColor.window);
		bandNamer.setIconImage(Toolkit.getDefaultToolkit().getImage(BandNamer.class.getResource("/files/ikon.png")));
		bandNamer.setTitle("Band Naminator");
		bandNamer.setBackground(SystemColor.window);
		bandNamer.setResizable(false);
		bandNamer.setBounds(0, 0, 400, 300);
		bandNamer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bandNamer.getContentPane().setLayout(null);

		bld = new JLabel();
		bld.setBounds(10, 253, 375, 20);
		bandNamer.getContentPane().add(bld);

		neo = new JButton();
		neo.setBounds(10, 10, 375, 245);
		neo.setAction(getNeoName);
		neo.setEnabled(false);
		neo.setForeground(new Color(255, 255, 255));
		bandNamer.getContentPane().add(neo);

	}

	public static void main(String[] args) {

		BandNamer window = new BandNamer();
		window.bandNamer.setVisible(true);

		av = av + 1;

		System.out.println("Loading Resources:\nNouns...");
		String noun = getLst("/files/nounList.bnn", 90963);
		System.out.println("Verbs...");
		String verb = getLst("/files/verbList.bnn", 30802);
		//System.out.println("Adverbs...");
		//String adv = getLst("/files/advList.bnn", 6276);
		System.out.println("Adjectives...");
		String adj = getLst("/files/adjList.bnn", 28479);
		System.out.println("Getting name...");

		nouns = noun.split("\\r?\\n");
		verbs = verb.split("\\r?\\n");
		//String[] adverbs = adv.split("\\r?\\n");
		adjectives = adj.split("\\r?\\n");

		gen();

		neo.setEnabled(true);
	}

	private static void gen() {
		n = (int) (Math.random() * nouns.length);
		v = (int) (Math.random() * verbs.length);
		//av = (int) (Math.random() * adverbs.length);
		aj = (int) (Math.random() * adjectives.length);

		end = adjectives[aj] + " " + nouns[n] + " " + verbs[v];

		System.out.println(/*x +*/ end);
		bld.setText(end);
	}

	public static String getLst(String path, double t) {
		String temp = "", s;
		double i = 0.0;
		URL uri = BandNamer.class.getResource(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(uri.getPath()));

			while ((s = br.readLine()) != null) {
				i = i + 1;
				System.out.println(Math.round(100.0 * (i / t)) + "%");
				if (i == 1) {
					temp = temp + s;
				} else {
					temp = temp + "\n" + s;
				}
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

	private class SwingAction2 extends AbstractAction {
		private static final long serialVersionUID = -4439810172513433428L;

		public SwingAction2() {
			putValue(NAME, "Get New Name");
			putValue(SHORT_DESCRIPTION, "Generates new name.");
		}

		public void actionPerformed(ActionEvent arg0) {
			gen();
		}
	}
}
