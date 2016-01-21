package E;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EInput implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Escape"))
			System.exit(0);

		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Left"))
			E.Left();
		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Right"))
			E.Right();
		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Up"))
			E.Up();
		if (KeyEvent.getKeyText(e.getKeyCode()).equalsIgnoreCase("Down"))
			E.Down();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}