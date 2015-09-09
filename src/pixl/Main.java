package pixl;

import java.awt.*;

public class Main {
	
	public static int[] goodpos = new int[] {200, 200};
	public static int[] badposX, badposY;
	public static Boolean[] badAlive;
	
	public static int winx, winy;
	
	public static Boolean b = true;
	public static int bad = -128;
	
	public static WindowPixl Host = new WindowPixl();

	public static void main(String[] args) {
		System.out.println("yay");
		
		Host.Menui.setVisible(true);
		
	}
	
	public static Graphics update(int[] gd, int[] bx, int[] by, Boolean[] ba, Boolean c, int gx, int gy) {
		Graphics g = Host.GameFrame.getGraphics();
		
		g.create(0, 0, Host.GameFrame.getBounds().height, Host.GameFrame.getBounds().height);
		
		if (c)
			g = u1(g, gd, bx, by, ba, gx, gy);
		if (!c)
			g = u2(g, gd, bx, by, ba, gx, gy);
		
		return g;
	}
	
	private static Graphics u1(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba, int gx, int gy) {
		g.setColor(SystemColor.window);
		g.drawLine(gd[0], gd[1], gd[0], gd[1]);
		g.drawLine(gx, gy, gx, gy);
		for (int i = 0; i > bx.length; i++)
			g.drawLine(bx[i], by[i], bx[i], by[i]);
		
		return g;
	}
	
	private static Graphics u2(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba, int gx, int gy) {
		g.setColor(new Color(0, 0, 255));
		g.drawLine(gd[0], gd[1], gd[0], gd[1]);
		g.setColor(new Color(0, 255, 0));
		g.drawLine(gx-1, gy, gx+1, gy);
		g.drawLine(gx, gy-1, gx, gy+1);
		g.setColor(new Color(255, 0, 0));
		for (int i = 0; i > bx.length; i++)
			if (badAlive[i])
				g.drawLine(bx[i], by[i], bx[i], by[i]);
		
		return g;
	}
	
	private static void check() {
		// TODO Auto-generated method stub
		
	}

	public static void Left() {
		Host.Gameui.getContentPane().setBackground(new Color(0, 0, 0));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		//Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[0] > 1) 
			goodpos[0] = goodpos[0] - 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
		handl();
		check();
	}

	public static void Right() {
		Host.Gameui.getContentPane().setBackground(new Color(0, 0, 0));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		//Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] < Host.GameFrame.getWidth()) 
			goodpos[0] = goodpos[0] + 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
		handl();
		check();
	}
	
	public static void Down() {
		Host.Gameui.getContentPane().setBackground(new Color(0, 0, 0));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		//Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] < Host.GameFrame.getWidth()) 
			goodpos[1] = goodpos[1] + 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
		handl();
		check();
	}
	
	public static void Up() {
		Host.Gameui.getContentPane().setBackground(new Color(0, 0, 0));
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		//Host.GameFrame.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] > 1) 
			goodpos[1] = goodpos[1] - 1;
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
		handl();
		check();
	}

	private static void handl() {
		
	}
}
