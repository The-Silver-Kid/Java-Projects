package DevTSK.Pixl;

import java.awt.Color;
import java.awt.Graphics;

public class Main {
	
	public static Boolean b = true;
	public static int bad = -128;
	
	public static WindowPixl Host = new WindowPixl();

	public static void main(String[] args) {
		System.out.println("yay");
		
		Host.Menui.setVisible(true);
		
	}
	
	public static void update(int[] gd, int[] b, Boolean[] ba) {
		Graphics g;
		g.setColor(new Color(0, 0, 255));
		//g.drawLine(x1, y1, x2, y2);
	}

}
