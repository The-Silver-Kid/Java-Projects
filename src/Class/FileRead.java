package Class;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class FileRead {

	private static FileInputStream br;
	private static FileOutputStream snd;

	private static String in = "", out = "";

	private static byte[] hash, unhash;

	private static byte[] by;

	private static Boolean win = false;
	private static Boolean opp = true;

	private JFrame fileFrame;
	private static JTextArea filename;
	private static JTextArea num;
	private static JButton en;
	private static JButton de;
	private static JButton op;
	private static JButton sv;
	private static JFileChooser choose;
	private static JProgressBar projress;
	private static JLabel cright;

	private final Action encr = new Encrypt();
	private final Action decr = new Decrypt();
	private final Action open = new Open();
	private final Action save = new Save();

	public static void main(String[] args) throws Exception {
		if (System.getProperty("os.name").contains("Windows")) {
			win = true;
		} else {
			win = false;
		}

		FileRead window = new FileRead();
		window.fileFrame.setVisible(true);

		System.out.println("Starting...");
		System.out.println("The File IO is strong with this one...");
	}

	public FileRead() {
		init();
	}

	private void init() {
		fileFrame = new JFrame();
		fileFrame.setBounds(0, 0, 355, 210);
		fileFrame.getContentPane().setBackground(SystemColor.window);
		fileFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(FileRead.class.getResource("/images/ikon.png")));
		fileFrame.setTitle("Silver Encrypt");
		fileFrame.setBackground(SystemColor.window);
		fileFrame.setResizable(false);
		fileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fileFrame.getContentPane().setLayout(null);

		filename = new JTextArea();
		filename.setBounds(10, 10, 330, 20);
		if (win) {
			filename.setText("C:\\example\\path\\filename.ext");
		} else {
			filename.setText("/example/path/filename.ext");
		}
		filename.setEditable(false);
		filename.setForeground(SystemColor.windowText);
		filename.setBackground(SystemColor.window);
		fileFrame.getContentPane().add(filename);

		num = new JTextArea();
		num.setBounds(10, 30, 330, 20);
		num.setText("15");
		num.setForeground(SystemColor.windowText);
		num.setBackground(SystemColor.window);
		num.setEditable(true);
		fileFrame.getContentPane().add(num);

		en = new JButton();
		en.setBounds(10, 50, 160, 30);
		en.setAction(encr);
		en.setEnabled(false);
		fileFrame.getContentPane().add(en);

		de = new JButton();
		de.setBounds(180, 50, 160, 30);
		de.setAction(decr);
		de.setEnabled(false);
		fileFrame.getContentPane().add(de);

		op = new JButton();
		op.setBounds(10, 90, 160, 30);
		op.setAction(open);
		fileFrame.getContentPane().add(op);

		sv = new JButton();
		sv.setBounds(180, 90, 160, 30);
		sv.setAction(save);
		sv.setEnabled(false);
		fileFrame.getContentPane().add(sv);

		choose = new JFileChooser();

		projress = new JProgressBar();
		projress.setBounds(10, 130, 330, 20);
		projress.setStringPainted(true);
		fileFrame.getContentPane().add(projress);

		cright = new JLabel();
		cright.setText("© 2015 DevTSK Productions");
		cright.setBounds(10, 160, 330, 20);
		cright.setHorizontalAlignment(0);
		cright.setForeground(new Color(200, 200, 200));
		fileFrame.getContentPane().add(cright);
	}

	private class Encrypt extends AbstractAction {
		private static final long serialVersionUID = 667L;

		public Encrypt() {
			putValue(NAME, "Encrypt File");
			;
		}

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Init Encryption");
			for (int i = 0; i < by.length; i++) {
				System.out.println("Encrypting byte " + i + " of " + by.length + ". \nBytes Left " + (by.length - i - 1));
				//TODO
				by[i] = hash[by[i] + Byte.MAX_VALUE + 1];
				System.out.println((i * 100) / by.length + "%");
			}
			System.out.println("Encryption went well");
			projress.setValue(33);
			if (!sv.isEnabled()) {
				System.out.println("Unlocking Save Button...\nLocking encrypt and decrypt buttons");
			}
			de.setEnabled(false);
			en.setEnabled(false);
			sv.setEnabled(true);
			opp = true;
		}
	}

	private class Decrypt extends AbstractAction {
		private static final long serialVersionUID = 666L;

		public Decrypt() {
			putValue(NAME, "Decrypt File");
		}

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Init Decryption");
			for (int i = 0; i < by.length; i++) {
				System.out.println("Decrypting byte " + i + " of " + by.length + ". \nBytes Left " + (by.length - i - 1));
				//TODO
				by[i] = unhash[by[i] + Byte.MAX_VALUE + 1];
				System.out.println((i * 100) / by.length + "%");
			}
			System.out.println("Decryption went well");
			projress.setValue(67);
			if (!sv.isEnabled()) {
				System.out.println("Unlocking Save Button...\nLocking encrypt and decypt buttons");
			}
			de.setEnabled(false);
			en.setEnabled(false);
			sv.setEnabled(true);
			opp = false;
		}
	}

	private class Open extends AbstractAction {
		private static final long serialVersionUID = 666L;

		public Open() {
			putValue(NAME, "Open File");
		}

		public void actionPerformed(ActionEvent arg0) {
			int ret = choose.showDialog(null, "Open file");

			if (ret == JFileChooser.APPROVE_OPTION) {
				if (win) {
					filename.setText(choose.getCurrentDirectory().toString() + "\\" + choose.getSelectedFile().getName());
				} else {
					filename.setText(choose.getCurrentDirectory().toString() + "/" + choose.getSelectedFile().getName());
				}

				in = filename.getText();

				File f = new File(filename.getText());
				try {
					br = new FileInputStream(f);
				} catch (Exception e) {
					e.printStackTrace();
				}

				//hash = Integer.parseInt(num.getText());
				//TODO
				hash = new byte[255];
				unhash = new byte[255];
				byte[] starting = new byte[num.getText().length()];
				char[] word = num.getText().toCharArray();
				for (int i = 0; i < starting.length; i++)
					starting[i] = (byte) word[i];
				byte b = Byte.MIN_VALUE;
				for (int i = 0; i < hash.length; i++) {
					if (i < starting.length) {
						hash[i] = starting[i];
					} else {
						boolean inStarting = false;
						do {
							inStarting = false;
							for (int e = 0; e < starting.length; e++)
								if (b == starting[e])
									inStarting = true;
							if (inStarting)
								b = (byte) (b + 1);
						} while (inStarting);
						hash[i] = b;
					}
					b = (byte) (b + 1);
				}
				int c = 254;
				for (int i = 0; i < hash.length; i++) {
					unhash[c] = hash[i];
					c--;
				}
				for (int i = 0; i < unhash.length; i++) {
					System.out.println(hash[hash.length - (i + 1)]);
					System.out.println(unhash[i]);
				}

				by = new byte[(int) f.length()];

				try {
					br.read(by);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Okay. I have \"" + filename.getText() + "\" loaded...");
				if (!en.isEnabled()) {
					System.out.println("Unlocking Encryption and Decryption Buttons...");
					en.setEnabled(true);
					de.setEnabled(true);
				}
				projress.setValue(33);
			}
		}
	}

	private class Save extends AbstractAction {
		private static final long serialVersionUID = 666L;

		public Save() {
			putValue(NAME, "Save File");
		}

		@SuppressWarnings("static-access")
		public void actionPerformed(ActionEvent arg0) {
			int ret = choose.showSaveDialog(null);

			if (ret == JFileChooser.APPROVE_OPTION) {
				String s;
				if (win) {
					s = choose.getCurrentDirectory().toString() + "\\" + choose.getSelectedFile().getName();
				} else {
					s = choose.getCurrentDirectory().toString() + "/" + choose.getSelectedFile().getName();
				}

				try {
					snd = new FileOutputStream(s);
					snd.write(by);
					snd.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("saved to : " + s + "\nAssuming all went well...");
				System.out.println("Locking Encrypt, Decrypt and Save buttons...\n");
				en.setEnabled(false);
				de.setEnabled(false);
				sv.setEnabled(false);
				projress.setValue(100);
				out = s;
				JOptionPane info = new JOptionPane();
				if (opp) {
					info.showMessageDialog(fileFrame, "Encrypted file \"" + in + "\"\nby " + hash + "\nand saved to \"" + out + "\"",
							"Info",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					info.showMessageDialog(fileFrame, "Decrypted file \"" + in + "\"\nby " + hash + "\nand saved to \"" + out + "\"",
							"Info",
							JOptionPane.PLAIN_MESSAGE);
				}
				projress.setValue(0);
			}
		}
	}
}
