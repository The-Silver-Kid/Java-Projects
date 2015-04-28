package DevTSK.Encryptor;

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
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.nio.file.*;
import javax.swing.JProgressBar;

public class GUIbuf {

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
	private JProgressBar progressBar;

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
					GUIbuf window = new GUIbuf();
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
	public GUIbuf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSilverEncrypt = new JFrame();
		frmSilverEncrypt.getContentPane().setForeground(SystemColor.window);
		frmSilverEncrypt.getContentPane().setBackground(SystemColor.window);
		frmSilverEncrypt.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIbuf.class.getResource("/images/ikon.png")));
		frmSilverEncrypt.setTitle("Silver Encrypt");
		frmSilverEncrypt.setBackground(SystemColor.window);
		frmSilverEncrypt.setResizable(false);
		frmSilverEncrypt.setBounds(100, 100, 515, 318);
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
		textSave.setText("secret.txt");
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
		hashField.setHorizontalAlignment(SwingConstants.CENTER);
		hashField.setText("15");
		frmSilverEncrypt.getContentPane().add(hashField, "2, 10, 3, 1, fill, default");
		hashField.setColumns(1);
		
		rdbtnNewRadioButton = new JRadioButton("Decrypted");
		rdbtnNewRadioButton.setForeground(SystemColor.windowText);
		rdbtnNewRadioButton.setBackground(SystemColor.window);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		frmSilverEncrypt.getContentPane().add(rdbtnNewRadioButton, "2, 12, 3, 1, center, center");
		
		rdbtnEncrypted = new JRadioButton("Encrypted");
		rdbtnEncrypted.setBackground(SystemColor.window);
		rdbtnEncrypted.setForeground(SystemColor.windowText);
		buttonGroup.add(rdbtnEncrypted);
		rdbtnEncrypted.setSelected(true);
		rdbtnEncrypted.setToolTipText("Set to save/load Encrypted Text");
		frmSilverEncrypt.getContentPane().add(rdbtnEncrypted, "2, 14, 3, 1, center, center");
		
		txtpnSystemReady = new JTextPane();
		txtpnSystemReady.setForeground(new Color(0, 255, 0));
		txtpnSystemReady.setBackground(SystemColor.window);
		txtpnSystemReady.setText("SYSTEM READY");
		txtpnSystemReady.setEditable(false);
		
		frmSilverEncrypt.getContentPane().add(txtpnSystemReady, "2, 16, 3, 1, center, center");
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 0, 255));
		progressBar.setBackground(SystemColor.window);
		progressBar.setStringPainted(true);
		progressBar.setValue(100);
		frmSilverEncrypt.getContentPane().add(progressBar, "1, 20, 4, 1");
	}

	/*
	 * actions!
	 * 
	 * 
	 * 
	 * 
	 * 
	 */	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Encrypt");
			putValue(SHORT_DESCRIPTION, "Encrypts text");
		}
		public void actionPerformed(ActionEvent e) {
			progressBar.setValue(0);
			String begin = textEncrField.getText();
			int hash = Integer.parseInt(hashField.getText());
			String end = "";
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				progressBar.setValue(i*100/c.length);
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w + hash;
				end = end + Character.toString((char)w);
			}
			progressBar.setValue(100);

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
				progressBar.setValue(100 * i / c.length);
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w - hash;
				end = end + Character.toString((char)w);
			}
			progressBar.setValue(100);

			textEncrField.setText(end);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Load");
			putValue(SHORT_DESCRIPTION, "Load");
		}
		public void actionPerformed(ActionEvent e) {
			if (rdbtnEncrypted.isSelected()){
				try {
					textDecryField.setText("");
					String sCL;
	 
					BufferedReader br = new BufferedReader(new FileReader(textLoad.getText()));
	 
					while ((sCL = br.readLine()) != null) {
						System.out.println(sCL);
						textDecryField.setText(textDecryField.getText() + sCL);
					}
					txtpnSystemReady.setForeground(new Color(0,255,0));
					txtpnSystemReady.setText("Text was read from " + textLoad.getText() + " and loaded to encrypted field sucessfully.");
					br.close();
				} catch (IOException i) {
					txtpnSystemReady.setForeground(new Color(255,0,0));
					txtpnSystemReady.setText(i.toString());
				}
			} else {
				try {
					textEncrField.setText("");
					String sCL;
	 
					BufferedReader br = new BufferedReader(new FileReader(textLoad.getText()));
	 
					while ((sCL = br.readLine()) != null) {
						System.out.println(sCL);
						textEncrField.setText(textEncrField.getText() + sCL);
					}
					txtpnSystemReady.setForeground(new Color(0,255,0));
					txtpnSystemReady.setText("Text was read from " + textLoad.getText() + " and loaded to decrypted field sucessfully.");
					br.close();
				} catch (IOException i) {
					txtpnSystemReady.setForeground(new Color(255,0,0));
					txtpnSystemReady.setText(i.toString());
				}
			}
		}
	}
	private class SwingAction_3 extends AbstractAction{
		public SwingAction_3() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save");
		}
		public void actionPerformed(ActionEvent e) {
			if (rdbtnEncrypted.isSelected()) {
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
					txtpnSystemReady.setText("Encrypted Text sucessfully saved to: " + textSave.getText());
				} else {
					txtpnSystemReady.setForeground(new Color(255,0,0));
					txtpnSystemReady.setText("Error: No Text!");
				}
			} else {
				txtpnSystemReady.setText("Pass");
				if (!textEncrField.getText().equals("")) {
					try{
						byte[] rA = textEncrField.getText().getBytes();
						FileOutputStream send = new FileOutputStream(textSave.getText());
						send.write(rA);
						send.close();
					}catch(IOException err){
						txtpnSystemReady.setForeground(new Color(255,0,0));
						txtpnSystemReady.setText(err.toString());
					}
					txtpnSystemReady.setForeground(new Color(0,255,0));
					txtpnSystemReady.setText("Decrypted text sucessfully saved to: " + textSave.getText());
				} else {
					txtpnSystemReady.setForeground(new Color(255,0,0));
					txtpnSystemReady.setText("Error: No Text!");
				}
			}
		}
	}
}
