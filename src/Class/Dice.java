package Class;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Dice {

	private JFrame frame;
	private final Action action = new SwingAction();
	static JLabel lblNewLabel, lblRoles, label;
	static JSlider dslide, rslide;
	private static DiceBack db;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice window = new Dice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		db = new DiceBack("calc");
		db.run();
	}

	/**
	 * Create the application.
	 */
	public Dice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDiceSides = new JLabel("Dice sides :");
		lblDiceSides.setBounds(10, 11, 69, 14);
		frame.getContentPane().add(lblDiceSides);
		
		lblNewLabel = new JLabel("6");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		dslide = new JSlider();
		dslide.setValue(6);
		dslide.setPaintLabels(true);
		dslide.setPaintTicks(true);
		dslide.setMinorTickSpacing(5);
		dslide.setMajorTickSpacing(10);
		dslide.setMaximum(104);
		dslide.setMinimum(4);
		dslide.setBounds(10, 36, 422, 37);
		frame.getContentPane().add(dslide);
		
		lblRoles = new JLabel("Roles :");
		lblRoles.setBounds(10, 84, 46, 14);
		frame.getContentPane().add(lblRoles);
		
		label = new JLabel("100");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(63, 84, 46, 14);
		frame.getContentPane().add(label);
		
		rslide = new JSlider();
		rslide.setValue(100);
		rslide.setMaximum(400);
		rslide.setMinimum(50);
		rslide.setMinorTickSpacing(25);
		rslide.setMajorTickSpacing(50);
		rslide.setSnapToTicks(true);
		rslide.setPaintLabels(true);
		rslide.setPaintTicks(true);
		rslide.setBounds(10, 109, 422, 37);
		frame.getContentPane().add(rslide);
		
		JToggleButton tglbtnShowExtendedInfo = new JToggleButton("Show Extended info");
		tglbtnShowExtendedInfo.setSelected(true);
		tglbtnShowExtendedInfo.setBounds(10, 157, 186, 23);
		frame.getContentPane().add(tglbtnShowExtendedInfo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 191, 422, 125);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(246, 157, 186, 23);
		frame.getRootPane().setDefaultButton(btnNewButton);
		frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = -4222950517292085067L;
		public SwingAction() {
			putValue(NAME, "Preform Calculations");
			putValue(SHORT_DESCRIPTION, "Look at what it says");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
