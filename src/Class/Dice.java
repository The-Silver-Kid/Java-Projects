package Class;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import DevTSK.Util.NumGenerator;

public class Dice {

	private JFrame frame;
	private final Action action = new SwingAction();
	static JLabel lblNewLabel, lblRoles, label;
	static JSlider dslide, rslide;
	private static DiceBack db = new DiceBack("Calc");
	static JTextArea out;
	static JToggleButton tglbtnShowExtendedInfo;
	static String rolz, stats;

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

		tglbtnShowExtendedInfo = new JToggleButton("");
		tglbtnShowExtendedInfo.setSelected(false);
		tglbtnShowExtendedInfo.setBounds(10, 157, 186, 23);
		frame.getContentPane().add(tglbtnShowExtendedInfo);

		out = new JTextArea();
		out.setBounds(10, 191, 422, 125);
		frame.getContentPane().add(out);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(246, 157, 186, 23);
		frame.getRootPane().setDefaultButton(btnNewButton);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrl = new JScrollPane(out);
		scrl.setBounds(out.getBounds());
		frame.getContentPane().add(scrl);

		db.start();
	}

	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = -4222950517292085067L;

		public SwingAction() {
			putValue(NAME, "Preform Calculations");
			putValue(SHORT_DESCRIPTION, "Look at what it says");
		}

		public void actionPerformed(ActionEvent e) {
			int[] list = new int[rslide.getValue()], devarlist = list;
			double avg = 0, sum = 0, max = 0, min = 0, standarddev = 0, var = 0;
			rolz = "rolls : \n";
			NumGenerator ng = new NumGenerator(dslide.getValue());
			for (int i = 0; i < list.length; i++) {
				list[i] = ng.gen();
				rolz = rolz + (i + 1) + " : " + list[i] + "\n";
				devarlist[i] = (int) Math.pow(list[i], 2);
				sum = sum + list[i];
				var = var + devarlist[i];
				if (i == 0)
					min = list[i];
				if (list[i] < min)
					min = list[i];
				if (list[i] > max)
					max = list[i];
			}
			avg = sum / list.length;
			var = var / list.length;
			standarddev = Math.sqrt(var);
			
			stats = "Average : " + avg + "\nMaximum : " + max + "\nMinimum : " + min + "\nSum : " + sum + "\nStandard Deviation : " + standarddev + "\nVariance : " + var;
			
			if (tglbtnShowExtendedInfo.isSelected())
				out.setText(stats);
			if (!tglbtnShowExtendedInfo.isSelected())
				out.setText(rolz);
		}
	}
}
