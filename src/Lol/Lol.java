package Lol;

// 🖕
import java.awt.Graphics;
import DevTSK.Util.BasicWindow;
import DevTSK.Util.NumGenerator;

public class Lol {
	private NumGenerator dirgen = new NumGenerator(1, true);
	private BasicWindow bw = new BasicWindow();
	private Boolean death = false;
	private int timealive = 0, x = 200, y = 200, dirx = 0, diry = 0, winXmax, winYmax;

	public int run() {
		while (dirx == 0 && diry == 0) {
			dirx = dirgen.gen();
			diry = dirgen.gen();
		}
		winXmax = bw.Gameui.getWidth();
		winYmax = bw.Gameui.getHeight();
		bw.Gameui.setVisible(true);
		while (!death) {
			nextMove();
			bw.Gameui.paint(updateScreen(x, y));
		}
		return timealive;
	}

	private void nextMove() {
		if (x + dirx > winXmax || x + dirx < 0) {
			dirx = -dirx;
		}
		if (y + diry > winYmax || y + diry < 0) {
			diry = -diry;
		}
	}

	private Graphics updateScreen(int xx, int yy) {
		Graphics g = bw.Gameui.getGraphics();

		g.drawLine(xx, yy, xx, yy);

		return g;
	}
}
