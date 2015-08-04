package DevTSK.Pixl;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


class setEasy extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setEasy() {
		putValue(NAME, "Easy");
		putValue(SHORT_DESCRIPTION, "Easy, 10 Baddies");
	}
	public void actionPerformed(ActionEvent arg0) {
		//TODO
		Main.bad = 10;
		
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
		//TODO
		Main.bad = 50;
	}
	
}

class setMedi extends AbstractAction {
	private static final long serialVersionUID = 3646194311743048047L;
	public setMedi() {
		putValue(NAME, "Medium");
		putValue(SHORT_DESCRIPTION, "Medium, 20 Baddies");
	}
	public void actionPerformed(ActionEvent arg0) {
		//TODO
		Main.bad = 20;
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