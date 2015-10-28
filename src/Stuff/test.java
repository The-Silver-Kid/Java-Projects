package Stuff;

import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class test extends JApplet {
	private static final long serialVersionUID = 1944613951505626683L;
	public static JTextField textField;
	private RunnableDemo rd = new RunnableDemo("hi");
	public static JTextArea textArea;
	public static JTextField calbMain;
	public static JTextField calbPod;

	/**
	 * Create the applet.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public test() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 37, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBounds(42, 81, 278, 63);
		getContentPane().add(textArea);
		
		calbMain = new JTextField();
		calbMain.setBounds(138, 37, 86, 20);
		getContentPane().add(calbMain);
		calbMain.setColumns(10);
		
		calbPod = new JTextField();
		calbPod.setBounds(234, 37, 86, 20);
		getContentPane().add(calbPod);
		calbPod.setColumns(10);
		
		JLabel lblPages = new JLabel("Pages:");
		lblPages.setHorizontalAlignment(SwingConstants.CENTER);
		lblPages.setBounds(42, 11, 86, 14);
		getContentPane().add(lblPages);
		
		JLabel lblCalberA = new JLabel("Calber A");
		lblCalberA.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalberA.setBounds(138, 11, 86, 14);
		getContentPane().add(lblCalberA);
		
		JLabel lblCalberB = new JLabel("Calber B");
		lblCalberB.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalberB.setBounds(234, 12, 86, 14);
		getContentPane().add(lblCalberB);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Default", "laul"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(42, 170, 278, 20);
		getContentPane().add(comboBox);
		
		rd.start();
	}
	
	public static int RoundTo(double number, int roundto){
		 return (int) (roundto * Math.ceil(number/roundto));
	}
}

