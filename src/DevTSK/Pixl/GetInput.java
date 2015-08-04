package DevTSK.Pixl;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class GetInput implements KeyListener {
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Escape"))
				System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}