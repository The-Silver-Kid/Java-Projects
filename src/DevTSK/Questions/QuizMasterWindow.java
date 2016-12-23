package DevTSK.Questions;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import DevTSK.Util.NumGenerator;

public class QuizMasterWindow {

	private JFrame main = new JFrame();

	private JLabel qBox = new JLabel();

	private JButton ans1 = new JButton();
	private JButton ans2 = new JButton();
	private JButton ans3 = new JButton();
	private JButton ans4 = new JButton();

	private A a = new A();
	private B b = new B();
	private C c = new C();
	private D d = new D();

	private char ans = 'X';

	private final Question[] qs;

	private Boolean cont = false;

	public QuizMasterWindow(Question[] qs) {
		main.setBounds(0, 0, 505, 630);
		main.setLayout(null);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
		main.setIconImage(Toolkit.getDefaultToolkit().getImage(QuizMasterWindow.class.getResource("/images/ikon.png")));
		main.setVisible(true);

		qBox.setBounds(10, 10, 480, 480);
		qBox.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 128, 128), new Color(64, 64, 64)));
		qBox.addKeyListener(new KL());
		//qBox.setEditable(false);
		qBox.setVerticalAlignment(JLabel.CENTER);
		qBox.setHorizontalAlignment(JLabel.CENTER);
		main.add(qBox);

		ans1.setBounds(10, 500, 235, 40);
		ans1.setAction(a);
		ans1.setText("A");
		main.add(ans1);

		ans2.setBounds(255, 500, 235, 40);
		ans2.setAction(b);
		ans2.setText("B");
		main.add(ans2);

		ans3.setBounds(10, 550, 235, 40);
		ans3.setAction(c);
		ans3.setText("C");
		main.add(ans3);

		ans4.setBounds(255, 550, 235, 40);
		ans4.setAction(d);
		ans4.setText("D");
		main.add(ans4);

		this.qs = qs;

		for (int i = 0; i < qs.length; i++) {
			setupQuestion(i);
			waitForSignal();
			cont = false;
		}
	}

	private void setupQuestion(int i) {
		ans1.setEnabled(false);
		ans2.setEnabled(false);
		ans3.setEnabled(false);
		ans4.setEnabled(false);

		String s = "<html>" + qs[i].getQuestion();

		s = s + "<br><br>";

		String[] ss = qs[i].getAnswers();
		String[] as = new String[ss.length];

		NumGenerator ng = new NumGenerator(ss.length, false);
		int[] ing = ng.genList();

		for (int w = 0; w < ing.length; w++)
			System.out.println(ing[w] + ss[w]);

		for (int e = 0; e < ing.length; e++) {
			as[e] = ss[ing[e]];
		}

		String letters = "ABCD";

		for (int o = 0; o < as.length; o++) {
			s = s + letters.substring(o, o + 1) + ": " + as[o] + "<br>";
		}

		s = s + "</html>";

		System.out.println("Question Loaded:\n" + s + "\nAnswers Detected : " + ss.length + "\nEnabling Buttons");

		switch (ss.length) {
		case 2:
			ans1.setEnabled(true);
			ans2.setEnabled(true);
			break;
		case 3:
			ans1.setEnabled(true);
			ans2.setEnabled(true);
			ans3.setEnabled(true);
			break;
		case 4:
			ans1.setEnabled(true);
			ans2.setEnabled(true);
			ans3.setEnabled(true);
			ans4.setEnabled(true);
			break;
		}

		qBox.setText(s);
	}

	private void waitForSignal() {
		while (!cont) {
		}
	}

	private class A extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			takeAction('a');
		}

	}

	private class B extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			takeAction('b');
		}

	}

	private class C extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			takeAction('c');
		}

	}

	private class D extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			takeAction('d');
		}

	}

	private class KL implements KeyListener {

		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

	}

	public void init() {
		System.out.println("Window Initialized.");
	}

	public void takeAction(char e) {
		System.out.println("Button Pressed : " + e);
		Boolean cor = false;
		switch (e) {
		case 'a':
			if (ans == 'a')
				cor = true;
			break;
		case 'b':
			if (ans == 'b')
				cor = true;
			break;
		case 'c':
			if (ans == 'c')
				cor = true;
			break;
		case 'd':
			if (ans == 'd')
				cor = true;
			break;
		}

		if (cor) {

		} else {

		}

	}
}
