package DevTSK.Encryptor;

import DevTSK.Exception.*;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.*;
import java.util.*;

import javax.swing.*;

public class File {
	
	private static BufferedReader br;
	
	private static Boolean win = false;
	
	private JFrame fileFrame;
	private static JTextArea filename;
	private static JTextArea num;
	private static JButton en;
	private static JButton de;
	private static JButton op;
	private static JButton sv;
	private static JFileChooser choose;
	
	private final Action encr = new Encrypt();
	private final Action decr = new Decrypt();
	private final Action open = new Open();
	private final Action save = new Save();
	
	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		if (Integer.parseInt(sdf.format(cal.getTime())) > 20 || Integer.parseInt(sdf.format(cal.getTime())) < 7) {
			throw new TooTiredException();
		}
		
		if (System.getProperty("os.name").contains("Windows")){
			win = true;
		} else {
			win = false;
		}
		
		File window = new File();
		window.fileFrame.setVisible(true);
		
		System.out.println("Starting...");
		System.out.println("The File IO is strong with this one...");
	}
	
	public File() {
		init();
	}
	
	private void init() {
		fileFrame = new JFrame();
		fileFrame.setBounds(0, 0, 355, 160);
		fileFrame.getContentPane().setBackground(SystemColor.window);
		fileFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIbuf.class.getResource("/images/ikon.png")));
		fileFrame.setTitle("Silver Encrypt");
		fileFrame.setBackground(SystemColor.window);
		fileFrame.setResizable(false);
		fileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fileFrame.getContentPane().setLayout(null);
		
		filename = new JTextArea();
		filename.setBounds(10, 10, 330, 20);
		if (win){
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
	}
	
	private class Encrypt extends AbstractAction{
		private static final long serialVersionUID = 667L;
		public Encrypt() {
			putValue(NAME, "Encrypt File");;
		}
		public void actionPerformed(ActionEvent arg0) {
			Boolean s = false;
			try {
				br = new BufferedReader(new FileReader(filename.getText()));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			int hash = Integer.parseInt(num.getText());
			
			while (true) {
				for (int i = 0; i > hash; i++) {}
			}
			
			if (s) {
				sv.setEnabled(true);
			} else {}
		}
	}
	
	private class Decrypt extends AbstractAction{
		private static final long serialVersionUID = 666L;
		public Decrypt() {
			putValue(NAME, "Decrypt File");
		}
		public void actionPerformed(ActionEvent arg0) {
			sv.setEnabled(true);
		}
	}
	
	private class Open extends AbstractAction{
		private static final long serialVersionUID = 666L;
		public Open() {
			putValue(NAME, "Open File");
		}
		public void actionPerformed(ActionEvent arg0) {
			int ret = choose.showDialog(null, "Open file");

		    if (ret == JFileChooser.APPROVE_OPTION) {
		    	en.setEnabled(true);
		    	de.setEnabled(true);
		    	if (win) {
		    		filename.setText(choose.getCurrentDirectory().toString() + "\\" + choose.getSelectedFile().getName());
		    	} else {
		    		filename.setText(choose.getCurrentDirectory().toString() + "/" + choose.getSelectedFile().getName());
		    	}
		    }
		}
	}
	
	private class Save extends AbstractAction{
		private static final long serialVersionUID = 666L;
		public Save() {
			putValue(NAME, "Save File");
		}
		public void actionPerformed(ActionEvent arg0) {
			int ret = choose.showSaveDialog(null);

		    if (ret == JFileChooser.APPROVE_OPTION) {
		    	String s;
		    	if (win) {
		    		s = choose.getCurrentDirectory().toString() + "\\" + choose.getSelectedFile().getName();
		    	} else {
		    		s = choose.getCurrentDirectory().toString() + "/" + choose.getSelectedFile().getName();
		    	}
		    	
		    	System.out.println("saved to : " + s);
		    }
		}
	}
}
