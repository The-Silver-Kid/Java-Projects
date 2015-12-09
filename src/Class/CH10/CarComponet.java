package Class.CH10;

import javax.swing.JComponent;

public class CarComponet extends JComponent {
	private static final long serialVersionUID = -1451770723212700310L;

	@SuppressWarnings("unused")
	private int x = 0, y = 0, Speed = 1, Track = 0;

	public CarComponet(int X, int Y, int Speed, int StartTrack) {
		x = X;
		y = Y;
		this.Speed = Speed;
		Track = StartTrack;
	}

}
