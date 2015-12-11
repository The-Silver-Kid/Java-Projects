package Class.CH10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class CarTester {

	private static final int FRAME_WIDTH = 1920;
	private static final int FRAME_HEIGHT = 75;

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Car Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final CarComponent component = new CarComponent();

		frame.add(component);

		frame.setVisible(true);

		class TimerListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				component.driveCar(1, 0);
				component.repaint();
			}
		}

		ActionListener listener = new TimerListener();

		final int DELAY = 1000; //milliseconds
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}
