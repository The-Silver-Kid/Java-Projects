package projectArchive.Pixl;

import java.awt.*;

public class Main {
	
	public static int[] goodpos = new int[] {200, 200};
	public static int[] badposX, badposY;
	public static Boolean[] badAlive;
	
	public static Boolean b = true;
	public static int bad = -128;
	
	public static WindowPixl Host = new WindowPixl();

	public static void main(String[] args) {
		System.out.println("yay");
		
		Host.Menui.setVisible(true);
		
	}
	
	public static Graphics update(int[] gd, int[] bx, int[] by, Boolean[] ba, Boolean c) {
		Graphics g = Host.GameFrame.getGraphics();
		
		g.create(0, 0, Host.GameFrame.getBounds().height, Host.GameFrame.getBounds().height);
		
		if (c)
			g = u1(g, gd, bx, by, ba);
		if (!c)
			g = u2(g, gd, bx, by, ba);
		
		return g;
	}
	
	private static Graphics u1(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba) {
		g.setColor(new Color(255, 255, 255));
		g.drawLine(gd[0], gd[1], gd[0], gd[1]);
		
		return g;
	}
	
	private static Graphics u2(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba) {
		g.setColor(new Color(0, 0, 255));
		g.drawLine(gd[0], gd[1], gd[0], gd[1]);
		
		return g;
	}

	public static void Left() {
		Host.GameFrame.setBackground(new Color(255, 255, 255));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true));
		Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true));
		if (goodpos[0] > 1) 
			goodpos[0] = goodpos[0] - 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false));
	}
	
	public static void Right() {
		Host.GameFrame.setBackground(new Color(255, 255, 255));
		Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true));
		if (b) {
			if (goodpos[0] < 500) 
				goodpos[0] = goodpos[0] + 1;
		} else {
			if (goodpos[0] < 200)
				goodpos[0] = goodpos[0] + 1;
		}
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false));
	}
	
	public static void Down() {
		Host.GameFrame.setBackground(new Color(255, 255, 255));
		Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true));
		if (b) {
			if (goodpos[1] < 500) 
				goodpos[1] = goodpos[1] + 1;
		} else {
			if (goodpos[1] < 200)
				goodpos[1] = goodpos[1] + 1;
		}
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false));
	}
	
	public static void Up() {
		Host.GameFrame.setBackground(new Color(255, 255, 255));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true));
		Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true));
		if (goodpos[1] > 1) 
			goodpos[1] = goodpos[1] - 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false));
	}
}