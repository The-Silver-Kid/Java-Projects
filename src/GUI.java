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
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;


public class GUI {

	private JFrame frame;
	private JTextField textEncrField;
	private JTextField textDecryField;
	private JTextField textHash;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 130);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
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
		frame.getContentPane().add(btnEncr, "2, 2");
		
		textEncrField = new JTextField();
		frame.getContentPane().add(textEncrField, "4, 2, fill, default");
		textEncrField.setColumns(10);
		
		JButton btnAcceptHash = new JButton("Accept Hash");
		frame.getContentPane().add(btnAcceptHash, "2, 4");
		
		JFormattedTextField hashField = new JFormattedTextField();
		hashField.setText("15");
		frame.getContentPane().add(hashField, "4, 4, fill, default");
		
		JButton btnDecr = new JButton("Decrypt");
		frame.getContentPane().add(btnDecr, "2, 6");
		
		textDecryField = new JTextField();
		frame.getContentPane().add(textDecryField, "4, 6, fill, default");
		textDecryField.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Encrypt");
			putValue(SHORT_DESCRIPTION, "Encrypts text");
		}
		public void actionPerformed(ActionEvent e) {
			Clipboard cb = Toolkit.getDefaultToolkit ().getSystemClipboard ();
			String begin = textEncrField.getText();
			int hash = 7;
			String end = "";
			
			//Scanner keyboard = new Scanner(System.in);
			//System.out.println("Input Text to encrypt.");
			//begin = keyboard.nextLine();
			//System.out.println("Input a hash number.");
			//System.out.println("Be careful to high or negative numbers will break this!");
			//hash = keyboard.nextInt();
			//keyboard.close();
			//System.out.println("");
			
			char[] c = begin.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				char ch = c[i];
				String x = Integer.toHexString(ch | 0x10000).substring(1);
				int w = Integer.parseInt(x, 16);
				w = w + hash;
				end = end + Character.toString((char)w);
			}
			//System.out.println("");
			//System.out.println("Encrypted!");
			//System.out.println(end);
			textDecryField.setText(end);
			StringSelection output = new StringSelection(end);
			cb.setContents (output, null);
		}
	}
}
