import java.util.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class Encrypt {
	public static void main(String args[]) {
		Clipboard cb = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		String begin = "";
		int hash = 2;
		String end = "";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Text to encrypt.");
		begin = keyboard.nextLine();
		System.out.println("Input a hash number.");
		System.out.println("Be careful to high or negative numbers will break this!");
		hash = keyboard.nextInt();
		System.out.println("");
		
		char[] c = begin.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			String x = Integer.toHexString(ch | 0x10000).substring(1);
			int w = Integer.parseInt(x, 16);
			w = w + hash;
			end = end + Character.toString((char)w);
		}
		System.out.println("");
		System.out.println("Encrypted!");
		System.out.println(end);
		StringSelection output = new StringSelection(end);
		cb.setContents (output, null);
	}
}

//cb.setContents (stringSelection, null);
//System.out.println( "\\u" + Integer.toHexString('÷' | 0x10000).substring(1) );
//Σ