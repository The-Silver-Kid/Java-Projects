package Class.CH10;

import javax.swing.JComponent;

@SuppressWarnings("unused")
public class CarComponet extends JComponent {
	private static final long serialVersionUID = -1451770723212700310L;

	private int x = 0, y = 0, Speed = 1, Track = 0, width = 100;
	private final int Height = 50;

	public CarComponet(int X, int Y, int Speed, int StartTrack, int Width) {
		x = X;
		y = Y;
		this.Speed = Speed;
		Track = StartTrack;
		width = Width;
	}

}
