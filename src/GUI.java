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

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.io.*;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;


public class GUI {

	private JFrame frmSilverEncrypt;
	private JTextField textEncrField;
	private JTextField textDecryField;
	private final Action action = new SwingAction();
	private JTextField hashField;
	private final Action action_1 = new SwingAction_1();
	private JButton btnOpen;
	private final Action action_2 = new SwingAction_2();
	private JButton btnSave;
	private JTextField textLoad;
	private JTextField textSave;
	private final Action action_3 = new SwingAction_3();
	private JTextPane txtpnSystemReady;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnEncrypted;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * 
	 * 
	 * 
	 * 
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
		frmSilverEncrypt.getContentPane().setForeground(SystemColor.window);
		frmSilverEncrypt.getContentPane().setBackground(SystemColor.window);
		frmSilverEncrypt.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/images/ikon.png")));
		frmSilverEncrypt.setTitle("Silver Encrypt");
		frmSilverEncrypt.setBackground(SystemColor.window);
		frmSilverEncrypt.setResizable(false);
		frmSilverEncrypt.setBounds(100, 100, 515, 248);
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
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
		
		btnOpen = new JButton("Open");
		btnOpen.setAction(action_2);
		frmSilverEncrypt.getContentPane().add(btnOpen, "2, 2");
		
		textLoad = new JTextField();
		textLoad.setText("secret.txt");
		frmSilverEncrypt.getContentPane().add(textLoad, "4, 2, fill, default");
		textLoad.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.setAction(action_3);
		frmSilverEncrypt.getContentPane().add(btnSave, "2, 4");
		
		textSave = new JTextField();
		textSave.setText("grin.txt");
		frmSilverEncrypt.getContentPane().add(textSave, "4, 4, fill, default");
		textSave.setColumns(10);
		btnEncr.setAction(action);
		frmSilverEncrypt.getContentPane().add(btnEncr, "2, 6");
		
		textEncrField = new JTextField();
		frmSilverEncrypt.getContentPane().add(textEncrField, "4, 6, fill, default");
		textEncrField.setColumns(1);
		
		JButton btnDecr = new JButton("Decrypt");
		btnDecr.setAction(action_1);
		frmSilverEncrypt.getContentPane().add(btnDecr, "2, 8");
		
		textDecryField = new JTextField();
		frmSilverEncrypt.getContentPane().add(textDecryField, "4, 8, fill, default");
		textDecryField.setColumns(1);
		
		hashField = new JTextField();
		hashField.setText("15");
		frmSilverEncrypt.getContentPane().add(hashField, "4, 10, fill, default");
		hashField.setColumns(1);
		
		rdbtnNewRadioButton = new JRadioButton("Decrypted");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		frmSilverEncrypt.getContentPane().add(rdbtnNewRadioButton, "2, 12, center, center");
		
		txtpnSystemReady = new JTextPane();
		txtpnSystemReady.setForeground(new Color(0, 255, 0));
		txtpnSystemReady.setBackground(SystemColor.window);
		txtpnSystemReady.setText("SYSTEM READY");
		txtpnSystemReady.setEditable(false);
		frmSilverEncrypt.getContentPane().add(txtpnSystemReady, "3, 12, 2, 3, center, center");
		
		rdbtnEncrypted = new JRadioButton("Encrypted");
		buttonGroup.add(rdbtnEncrypted);
		rdbtnEncrypted.setSelected(true);
		rdbtnEncrypted.setToolTipText("Set to save/load Encrypted Text");
		frmSilverEncrypt.getContentPane().add(rdbtnEncrypted, "2, 14");
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
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Load");
			putValue(SHORT_DESCRIPTION, "Load");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	//throws IOException, FileNotFoundException
	private class SwingAction_3 extends AbstractAction{
		public SwingAction_3() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save");
		}
		public void actionPerformed(ActionEvent e) {
			if (!textDecryField.getText().equals("")){
				try{
					byte[] rA = textDecryField.getText().getBytes();
					FileOutputStream send = new FileOutputStream(textSave.getText());
					send.write(rA);
					send.close();
				}catch(IOException err){
					txtpnSystemReady.setForeground(new Color(255,0,0));
					txtpnSystemReady.setText(err.toString());
				}
				txtpnSystemReady.setForeground(new Color(0,255,0));
				txtpnSystemReady.setText("File Sucessfully saved to: " + textSave.getText());
			} else {
				txtpnSystemReady.setForeground(new Color(255,0,0));
				txtpnSystemReady.setText("Error: No Text!");
			}
		}
	}
}
