import java.util.*;
import java.awt.datatransfer.*;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Dycrypt {
	public static void main(String args[]) {
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		String begin = "";
		int hash = 2;
		String end = "";
		String chek = "0";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Text to dycrypt.");
		System.out.println("Enter 0 to fetch from clipboard");
		begin = keyboard.nextLine();
		System.out.println("Input the hash number.");
		System.out.println("Be careful wrong number could break this!");
		hash = keyboard.nextInt();
		System.out.println("");
		
		if (begin.equals(chek)) {
			Transferable t = cb.getContents(null);
			begin = t.toString();
			System.out.println("Successfully fetched:");
			System.out.println(begin);
		}
		
		char[] c = begin.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			String x = Integer.toHexString(ch | 0x10000).substring(1);
			int w = Integer.parseInt(x, 16);
			w = w - hash;
			end = end + Character.toString((char)w);
		}
		System.out.println("");
		System.out.println("DECRYPTED!");
		System.out.println(end);
		StringSelection output = new StringSelection(end);
		cb.setContents(output, null);
	}
}

//cb.setContents (stringSelection, null);
//System.out.println( "\\u" + Integer.toHexString('÷' | 0x10000).substring(1) );
//Σ
//Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); 