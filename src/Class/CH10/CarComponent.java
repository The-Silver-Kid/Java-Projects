package Class.CH10;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarComponent extends JComponent {

	private Car car;

	public CarComponent() {
		car = new Car(0, 10);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		car.draw(g2);
	}

	public void driveCar(int dx, int dy) {
		car.translate(dx, dy);
		repaint();
	}
}
