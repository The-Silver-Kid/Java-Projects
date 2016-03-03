package projectArchive.pixl;

import java.awt.Color;
import java.awt.Graphics;
import DevTSK.Util.NumGenerator;

public class Main {

	public static int[] goodpos = new int[] { 200, 200 };
	public static int[] badposX, badposY;
	public static Boolean[] badAlive;

	public static int winx, winy;

	public static Boolean b = true;
	public static int bad = -128;

	private static Boolean painted = false;

	public static WindowPixl Host = new WindowPixl();

	public static void main(String[] args) {
		System.out.println("yay");

		Host.Menui.setVisible(true);

	}

	public static Graphics update(int[] gd, int[] bx, int[] by, Boolean[] ba, Boolean c, int gx, int gy) {
		Graphics g = Host.Gameui.getGraphics();

		if (c)
			g = u1(g, gd, bx, by, ba, gx, gy);
		if (!c)
			g = u2(g, gd, bx, by, ba, gx, gy);

		return g;
	}

	private static Graphics u1(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba, int gx, int gy) {
		/*g.setColor(new Color(0, 0, 0));
		g.drawLine(gd[0], gd[1], gd[0], gd[1]);
		g.drawLine(gx, gy, gx, gy);
		for (int i = 0; i < bx.length; i++){
			g.drawLine(bx[i]+1, by[i]+1, bx[i]-1, by[i]-1);
			g.drawLine(bx[i]-1, by[i]-1, bx[i]+1, by[i]+1);
		}*/

		return g;
	}

	private static Graphics u2(Graphics g, int[] gd, int[] bx, int[] by, Boolean[] ba, int gx, int gy) {
		g.setColor(new Color(255, 255, 0));
		g.drawLine(gd[0] + 1, gd[1] + 1, gd[0] - 1, gd[1] + 1);
		g.drawLine(gd[0] + 1, gd[1] - 1, gd[0] - 1, gd[1] - 1);
		g.drawLine(gd[0] + 1, gd[1], gd[0] - 1, gd[1]);
		g.setColor(new Color(0, 255, 0));
		g.drawLine(gx - 1, gy, gx + 1, gy);
		g.drawLine(gx, gy - 1, gx, gy + 1);
		g.setColor(new Color(255, 0, 0));
		for (int i = 0; i < bx.length; i++)
			if (badAlive[i]) {
				g.drawLine(bx[i] + 1, by[i] + 1, bx[i] - 1, by[i] - 1);
				g.drawLine(bx[i] - 1, by[i] - 1, bx[i] + 1, by[i] + 1);
			}

		return g;
	}

	private static void check() {
		// TODO Auto-generated method stub

	}

	public static void Left() {
		if (!painted) {
			Host.Gameui.setBackground(new Color(0, 0, 0));
			painted = !painted;
		}
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[0] > 1)
			goodpos[0] = goodpos[0] - 1;
		handl();
		check();
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
	}

	public static void Right() {
		if (!painted) {
			Host.Gameui.setBackground(new Color(0, 0, 0));
			painted = !painted;
		}
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] < Host.GameFrame.getWidth())
			goodpos[0] = goodpos[0] + 1;
		handl();
		check();
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
	}

	public static void Down() {
		if (!painted) {
			Host.Gameui.setBackground(new Color(0, 0, 0));
			painted = !painted;
		}
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] < Host.GameFrame.getWidth())
			goodpos[1] = goodpos[1] + 1;
		handl();
		check();
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
	}

	public static void Up() {
		if (!painted) {
			Host.Gameui.setBackground(new Color(0, 0, 0));
			painted = !painted;
		}
		Host.Gameui.paint(update(goodpos, badposX, badposY, badAlive, true, winx, winy));
		if (goodpos[1] > 1)
			goodpos[1] = goodpos[1] - 1;
		handl();
		check();
		Host.GameFrame.paintAll(update(goodpos, badposX, badposY, badAlive, false, winx, winy));
	}

	private static void handl() {
		int dead = -128;
		for (int i = 0; i < badAlive.length; i++) {
			System.out.println("[" + i + "]" + badposX[i] + " " + badposY[i] + " " + badAlive[i]);
			if (!badAlive[i])
				dead = i;
			if (badAlive[i])
				movebad(i);
		}
		if (dead > 0 && dead < bad)
			addbad(dead);
	}

	private static void movebad(int i) {
		if (badposX[i] > goodpos[0])
			badposX[i] = badposX[i]--;
		if (badposX[i] < goodpos[0])
			badposX[i] = badposX[i]++;
		if (badposY[i] > goodpos[1])
			badposY[i] = badposY[i]--;
		if (badposY[i] > goodpos[1])
			badposY[i] = badposY[i]--;
	}

	private static void addbad(int dead) {
		NumGenerator ng = new NumGenerator(2, false);
		if (ng.gen() == 1) {
			ng = new NumGenerator(Host.Gameui.getWidth(), false);
			badposX[dead] = ng.gen();
			ng = new NumGenerator(2, false);
			if (ng.gen() == 1) {
				badposY[dead] = Host.Gameui.getWidth();
			} else {
				badposY[dead] = 0;
			}
		} else {
			ng = new NumGenerator(Host.Gameui.getWidth(), false);
			badposY[dead] = ng.gen();
			ng = new NumGenerator(2, false);
			if (ng.gen() == 1) {
				badposX[dead] = Host.Gameui.getWidth();
			} else {
				badposX[dead] = 0;
			}
		}
		badAlive[dead] = true;
	}
}
