package Class;

import javax.swing.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Answers {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("14");
		JOptionPane.showMessageDialog(null, "Hullo, Kapter\n~Reggii");
		
		System.out.println("\n15");
		String name = JOptionPane.showInputDialog("What is thy name");
		System.out.println("Hello " + name + "!");
		
		System.out.println("\n16");
		String nam = JOptionPane.showInputDialog("Hello and welcome to the Aperature Sience Computer-Aided Enrichment Center\nPlease what do you want to do?");
		System.out.println("Error. Unknow Opperation : " + nam + "\nI can't do that " + name);

		System.out.println("\n17");
		URL loc = new URL("http://www.boxoffrogs.eu/wp-content/gallery/3d-renders/boxoffrogs_weighted_companion_cube_preview2.jpg");
		JOptionPane.showMessageDialog(null, "Aperature Science\nWeighted Companion Cube", "GLaDOS", JOptionPane.ERROR_MESSAGE, new ImageIcon(loc));
		
		System.out.println("\n18");
		System.out.println("Rueul\t1/1/01\nGabe\t2/2/02\nRadon\t7/10/95");
		
		System.out.println("\n19");
		System.out.println("State tax\n---------\nState1\t0\nState2\t99.99\nState3\t75\nAperature Science\t9999999\nState5\t-34.\u03C0");
		
		System.out.println("\n20");
		JOptionPane.showMessageDialog(null, "greetings\nHow are you\t\u03A0\u03CE\u03C2 \u03B5\u03AF\u03C3\u03B1\u03B9?\nGood day to you\t\u039A\u03B1\u03BB\u03AE \u03C3\u03B1\u03C2 \u03BC\u03AD\u03C1\u03B1\nGoodby\t\u039A\u03B1\u03BB\u03CC \u03B1\u03C0\u03CC");
	}

}
