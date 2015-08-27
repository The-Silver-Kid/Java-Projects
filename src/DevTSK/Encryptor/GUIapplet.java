/*
 * Encryptor Applet
 * (C) DevTSK Productions
 */


package DevTSK.Encryptor;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
//import java.awt.event.KeyEvent;

public class GUIapplet extends JApplet {
	static final long serialVersionUID = -3149588889575329187L;
	private JTextArea textEn;
	private JTextArea textDe;
	private JTextField textHashField;
	private final Action Encrypt = new SwingAction();
	private final Action Decrypt = new SwingAction_1();

	/**
	 * Create the applet.
	 */
	public GUIapplet() {
		getContentPane().setLayout(null);
		
		JButton btnDe = new JButton("");
		btnDe.setAction(Encrypt);
		btnDe.setBounds(10, 503, 217, 76);
		getContentPane().add(btnDe);
		
		JButton btnEn = new JButton("");
		btnEn.setAction(Decrypt);
		btnEn.setBounds(273, 503, 217, 76);
		getContentPane().add(btnEn);
		
		textEn = new JTextArea();
		textEn.setToolTipText("Encrypted Text Goes/Appears Here");
		textEn.setText("Opn}\u0084{poE");
		textEn.setWrapStyleWord(true);
		textEn.setLineWrap(true);
		textEn.setBounds(10, 269, 480, 192);
		getContentPane().add(textEn);
		
		JLabel lblEncrypted = new JLabel("Encrypted Text:");
		lblEncrypted.setBounds(10, 244, 480, 14);
		getContentPane().add(lblEncrypted);
		
		textDe = new JTextArea();
		textDe.setWrapStyleWord(true);
		textDe.setToolTipText("Decrypted Text Goes/Appears Here");
		textDe.setLineWrap(true);
		textDe.setText("Decrypted:");
		textDe.setBounds(10, 40, 480, 193);
		getContentPane().add(textDe);
		
		JLabel lblDecrypted = new JLabel("Decrypted Text:");
		lblDecrypted.setBounds(10, 11, 480, 14);
		getContentPane().add(lblDecrypted);
		
		JLabel lblHash = new JLabel("Hash:");
		lblHash.setHorizontalAlignment(SwingConstants.CENTER);
		lblHash.setBounds(10, 472, 46, 20);
		getContentPane().add(lblHash);
		
		textHashField = new JTextField();
		textHashField.setText("11");
		textHashField.setHorizontalAlignment(SwingConstants.CENTER);
		textHashField.setBounds(66, 472, 424, 20);
		getContentPane().add(textHashField);
		textHashField.setColumns(10);

	}
	private class SwingAction extends AbstractAction {
		/**
		 * Encrypts Text
		 */
		private static final long serialVersionUID = 7956252944480295508L;
		public SwingAction() {
			putValue(NAME, "Encrypt");
			putValue(SHORT_DESCRIPTION, "Encrypts Text.");
		}
		public void actionPerformed(ActionEvent e) {
			String begin = textDe.getText();
			int hash = Integer.parseInt(textHashField.getText());
			String end = "";
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w + hash;
				end = end + Character.toString((char)w);
			}

			textEn.setText(end);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * Decrypt Text
		 */
		private static final long serialVersionUID = -2564193956187882447L;
		public SwingAction_1() {
			putValue(NAME, "Decrypt");
			putValue(SHORT_DESCRIPTION, "Decrypts Text.");
		}
		public void actionPerformed(ActionEvent e) {
			String begin = textEn.getText();
			int hash = Integer.parseInt(textHashField.getText());
			String end = "";
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w - hash;
				end = end + Character.toString((char)w);
			}

			textDe.setText(end);
		}
	}
}
