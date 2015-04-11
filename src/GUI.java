import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.Action;

import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import java.awt.SystemColor;


public class GUI {

	private JFrame frmSilverEncrypt;
	private JTextField textEncrField;
	private JTextField textDecryField;
	private JTextField textHash;
	private final Action action = new SwingAction();
	private JTextField hashField;
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmSilverEncrypt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSilverEncrypt = new JFrame();
		frmSilverEncrypt.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/images/ikon.png")));
		frmSilverEncrypt.setTitle("Silver Encrypt");
		frmSilverEncrypt.setBackground(SystemColor.window);
		frmSilverEncrypt.setResizable(false);
		frmSilverEncrypt.setBounds(100, 100, 450, 130);
		frmSilverEncrypt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSilverEncrypt.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JButton btnEncr = new JButton("Encrypt");
		btnEncr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEncr.setAction(action);
		frmSilverEncrypt.getContentPane().add(btnEncr, "2, 2");
		
		textEncrField = new JTextField();
		frmSilverEncrypt.getContentPane().add(textEncrField, "4, 2, fill, default");
		textEncrField.setColumns(1);
		
		hashField = new JTextField();
		hashField.setText("15");
		frmSilverEncrypt.getContentPane().add(hashField, "4, 4, fill, default");
		hashField.setColumns(1);
		
	//	JFormattedTextField hashField = new JFormattedTextField();
	//	hashField.setText("15");
	//	frame.getContentPane().add(hashField, "4, 4, fill, default");
		
		JButton btnDecr = new JButton("Decrypt");
		btnDecr.setAction(action_1);
		frmSilverEncrypt.getContentPane().add(btnDecr, "2, 6");
		
		textDecryField = new JTextField();
		frmSilverEncrypt.getContentPane().add(textDecryField, "4, 6, fill, default");
		textDecryField.setColumns(1);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Encrypt");
			putValue(SHORT_DESCRIPTION, "Encrypts text");
		}
		public void actionPerformed(ActionEvent e) {
			String begin = textEncrField.getText();
			int hash = Integer.parseInt(hashField.getText());
			String end = "";
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w + hash;
				end = end + Character.toString((char)w);
			}

			textDecryField.setText(end);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Decrypt");
			putValue(SHORT_DESCRIPTION, "Decrypts text");
		}
		public void actionPerformed(ActionEvent e) {
			String begin = textDecryField.getText();
			int hash = Integer.parseInt(hashField.getText());
			String end = "";
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				System.out.println("Pos:" + i);
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w - hash;
				end = end + Character.toString((char)w);
			}

			textEncrField.setText(end);
		}
	}
}
