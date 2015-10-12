package DevTSK.Neurox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class Neurox {
	
	private static FileInputStream br;
	private static FileOutputStream snd;
	
	private static String in = "", out = "";
	
	private static byte[] by;
	
	private static int hash = 0;
	
	private static JTextArea filename;
	private static JTextArea num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void getFile() {
    	
		filename.setText("Insert File Path here");
    	
    	in = filename.getText();
    	
    	File f = new File(filename.getText());
		try {
			br = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		hash = Integer.parseInt(num.getText());
		
		by = new byte[(int) f.length()];
		
		try {
			br.read(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
