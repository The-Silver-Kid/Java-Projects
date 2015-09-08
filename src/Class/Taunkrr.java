<<<<<<< HEAD
package Class;

import java.awt.EventQueue;

import BJ.resources.Day;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Taunkrr {

	private JFrame frmTanker;
	private JTextField Name;
	private JTextField Month;
	private JTextField Daii;
	private JTextField Year;
	private JTextArea resultt;
	private final Action action = new SwingAction();
	private JTextField Death;
	private JTextField oz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taunkrr window = new Taunkrr();
					window.frmTanker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Taunkrr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTanker = new JFrame();
		frmTanker.setTitle("Tanker");
		frmTanker.getContentPane().setBackground(new Color(255,255,255));
		frmTanker.setBounds(100, 100, 450, 370);
		frmTanker.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTanker.getContentPane().setLayout(null);
		
		Name = new JTextField();
		Name.setText("The_Silver_Kid");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(66, 11, 366, 20);
		frmTanker.getContentPane().add(Name);
		Name.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 11, 46, 20);
		frmTanker.getContentPane().add(lblName);
		
		Month = new JTextField();
		Month.setText("1");
		Month.setToolTipText("Month");
		Month.setHorizontalAlignment(SwingConstants.CENTER);
		Month.setBounds(66, 42, 366, 20);
		frmTanker.getContentPane().add(Month);
		Month.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(10, 42, 46, 20);
		frmTanker.getContentPane().add(lblMonth);
		
		Daii = new JTextField();
		Daii.setHorizontalAlignment(SwingConstants.CENTER);
		Daii.setText("1");
		Daii.setBounds(66, 73, 366, 20);
		frmTanker.getContentPane().add(Daii);
		Daii.setColumns(10);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(10, 73, 46, 20);
		frmTanker.getContentPane().add(lblDay);
		
		Year = new JTextField();
		Year.setHorizontalAlignment(SwingConstants.CENTER);
		Year.setToolTipText("Year");
		Year.setText("2015");
		Year.setBounds(66, 104, 366, 20);
		frmTanker.getContentPane().add(Year);
		Year.setColumns(10);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(10, 104, 46, 20);
		frmTanker.getContentPane().add(lblYear);
		
		resultt = new JTextArea();
		resultt.setLineWrap(true);
		resultt.setFont(new Font("Impact", Font.PLAIN, 19));
		resultt.setEditable(false);
		resultt.setBounds(10, 197, 422, 61);
		frmTanker.getContentPane().add(resultt);
		
		JButton kalc = new JButton("New button");
		kalc.setAction(action);
		kalc.setBounds(10, 269, 422, 66);
		frmTanker.getContentPane().add(kalc);
		
		Death = new JTextField();
		Death.setText("2095");
		Death.setHorizontalAlignment(SwingConstants.CENTER);
		Death.setBounds(191, 135, 241, 20);
		frmTanker.getContentPane().add(Death);
		Death.setColumns(10);
		
		oz = new JTextField();
		oz.setText("50");
		oz.setHorizontalAlignment(SwingConstants.CENTER);
		oz.setBounds(296, 166, 136, 20);
		frmTanker.getContentPane().add(oz);
		oz.setColumns(10);
		
		JLabel lblHowLongDo = new JLabel("How long do you want to live:");
		lblHowLongDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowLongDo.setBounds(10, 135, 171, 20);
		frmTanker.getContentPane().add(lblHowLongDo);
		
		JLabel lblHowManyOunces = new JLabel("How many Ounces of water do you drink dayly:");
		lblHowManyOunces.setBounds(10, 166, 276, 14);
		frmTanker.getContentPane().add(lblHowManyOunces);
	}
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "CALCULATE");
		}
		//YMD
		public void actionPerformed(ActionEvent e) {
			Day d = new Day(Integer.parseInt(Death.getText()), Integer.parseInt(Month.getText()), Integer.parseInt(Daii.getText()));
			int from = d.daysFrom(new Day(Integer.parseInt(Year.getText()), Integer.parseInt(Month.getText()), Integer.parseInt(Daii.getText())));
			int resoz = from * Integer.parseInt(oz.getText());
			double resgal = resoz / 128;
			double regtank = resgal / 8000;
			resultt.setText("You would drink " + regtank + " tanker trucks of\ndihydrogen monoxide in you expected life...");
		}
	}
}
=======
package Class;

import java.awt.EventQueue;

import BJ.resources.Day;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Taunkrr {

	private JFrame frmTanker;
	private JTextField Name;
	private JTextField Month;
	private JTextField Daii;
	private JTextField Year;
	private JTextArea resultt;
	private final Action action = new SwingAction();
	private JTextField Death;
	private JTextField oz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taunkrr window = new Taunkrr();
					window.frmTanker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Taunkrr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTanker = new JFrame();
		frmTanker.setTitle("Tanker");
		frmTanker.getContentPane().setBackground(new Color(255,255,255));
		frmTanker.setBounds(100, 100, 450, 370);
		frmTanker.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTanker.getContentPane().setLayout(null);
		
		Name = new JTextField();
		Name.setText("The_Silver_Kid");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(66, 11, 366, 20);
		frmTanker.getContentPane().add(Name);
		Name.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 11, 46, 20);
		frmTanker.getContentPane().add(lblName);
		
		Month = new JTextField();
		Month.setText("1");
		Month.setToolTipText("Month");
		Month.setHorizontalAlignment(SwingConstants.CENTER);
		Month.setBounds(66, 42, 366, 20);
		frmTanker.getContentPane().add(Month);
		Month.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(10, 42, 46, 20);
		frmTanker.getContentPane().add(lblMonth);
		
		Daii = new JTextField();
		Daii.setHorizontalAlignment(SwingConstants.CENTER);
		Daii.setText("1");
		Daii.setBounds(66, 73, 366, 20);
		frmTanker.getContentPane().add(Daii);
		Daii.setColumns(10);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(10, 73, 46, 20);
		frmTanker.getContentPane().add(lblDay);
		
		Year = new JTextField();
		Year.setHorizontalAlignment(SwingConstants.CENTER);
		Year.setToolTipText("Year");
		Year.setText("2015");
		Year.setBounds(66, 104, 366, 20);
		frmTanker.getContentPane().add(Year);
		Year.setColumns(10);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(10, 104, 46, 20);
		frmTanker.getContentPane().add(lblYear);
		
		resultt = new JTextArea();
		resultt.setLineWrap(true);
		resultt.setFont(new Font("Impact", Font.PLAIN, 19));
		resultt.setEditable(false);
		resultt.setBounds(10, 197, 422, 61);
		frmTanker.getContentPane().add(resultt);
		
		JButton kalc = new JButton("New button");
		kalc.setAction(action);
		kalc.setBounds(10, 269, 422, 66);
		frmTanker.getContentPane().add(kalc);
		
		Death = new JTextField();
		Death.setText("2095");
		Death.setHorizontalAlignment(SwingConstants.CENTER);
		Death.setBounds(191, 135, 241, 20);
		frmTanker.getContentPane().add(Death);
		Death.setColumns(10);
		
		oz = new JTextField();
		oz.setText("50");
		oz.setHorizontalAlignment(SwingConstants.CENTER);
		oz.setBounds(296, 166, 136, 20);
		frmTanker.getContentPane().add(oz);
		oz.setColumns(10);
		
		JLabel lblHowLongDo = new JLabel("How long do you want to live:");
		lblHowLongDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowLongDo.setBounds(10, 135, 171, 20);
		frmTanker.getContentPane().add(lblHowLongDo);
		
		JLabel lblHowManyOunces = new JLabel("How many Ounces of water do you drink dayly:");
		lblHowManyOunces.setBounds(10, 166, 276, 14);
		frmTanker.getContentPane().add(lblHowManyOunces);
	}
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "CALCULATE");
		}
		//YMD
		public void actionPerformed(ActionEvent e) {
			Day d = new Day(Integer.parseInt(Death.getText()), Integer.parseInt(Month.getText()), Integer.parseInt(Daii.getText()));
			int from = d.daysFrom(new Day(Integer.parseInt(Year.getText()), Integer.parseInt(Month.getText()), Integer.parseInt(Daii.getText())));
			int resoz = from * Integer.parseInt(oz.getText());
			double resgal = resoz / 128;
			double regtank = resgal / 80000;
			resultt.setText("You would drink " + regtank + " tanker trucks of\ndihydrogen monoxide in you expected life...");
		}
	}
}
>>>>>>> parent of d58d07a... you made an error. you put 80000 instead of 8000. get rekt
