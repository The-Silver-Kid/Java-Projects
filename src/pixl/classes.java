package pixl;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import DevTSK.Util.NumGenerator;

class setEasy extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setEasy() {
		putValue(NAME, "Easy");
		putValue(SHORT_DESCRIPTION, "Easy, 10 Baddies");
	}
	public void actionPerformed(ActionEvent arg0) {
		Main.bad = 10;
		Main.badposX = new int[Main.bad];
		Main.badposY = new int[Main.bad];
		Main.badAlive = new Boolean[Main.bad];
		
		NumGenerator ng = new NumGenerator(Main.Host.GameFrame.getWidth());
		Main.winx = ng.gen();
		Main.winy = ng.gen();
		
		Main.Host.Menui.setVisible(false);
		Main.Host.Gameui.setVisible(true);
		
		WindowPixl.gamerunning = true;
	}
	
}

class setHard extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setHard() {
		putValue(NAME, "Hard");
		putValue(SHORT_DESCRIPTION, "Hard, 50 Baddies");
	}
	public void actionPerformed(ActionEvent arg0) {
		Main.bad = 50;
		Main.badposX = new int[Main.bad];
		Main.badposY = new int[Main.bad];
		Main.badAlive = new Boolean[Main.bad];
		
		NumGenerator ng = new NumGenerator(Main.Host.GameFrame.getWidth());
		Main.winx = ng.gen();
		Main.winy = ng.gen();
		
		Main.Host.Menui.setVisible(false);
		Main.Host.Gameui.setVisible(true);
		
		WindowPixl.gamerunning = true;
		
	}
	
}

class setMedi extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setMedi() {
		putValue(NAME, "Medium");
		putValue(SHORT_DESCRIPTION, "Medium, 20 Baddies");
	}
	public void actionPerformed(ActionEvent arg0) {
		Main.bad = 20;
		Main.badposX = new int[Main.bad];
		Main.badposY = new int[Main.bad];
		Main.badAlive = new Boolean[Main.bad];
		
		NumGenerator ng = new NumGenerator(Main.Host.GameFrame.getWidth());
		Main.winx = ng.gen();
		Main.winy = ng.gen();
		
		Main.Host.Menui.setVisible(false);
		Main.Host.Gameui.setVisible(true);
		
		WindowPixl.gamerunning = true;
	}
	
}

class setExit extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setExit() {
		putValue(NAME, "Exit");
		putValue(SHORT_DESCRIPTION, "Exit");
	}
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
	
}