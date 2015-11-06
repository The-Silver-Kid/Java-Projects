package DevTSK.RadonFiles;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import DevTSK.Neurox.NeuroxRead;

public class RadonFiles {

	public static final int WRITTEN_PAGES = 4;
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static JRadioButton prsnl, schl;
	private static JTextArea textArea;
	private static JScrollPane scrl;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadonFiles window = new RadonFiles();
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
	public RadonFiles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Radon Files");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 596, 56);
		frame.getContentPane().add(lblNewLabel);

		prsnl = new JRadioButton("Personal Log");
		prsnl.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(prsnl);
		prsnl.setSelected(true);
		prsnl.setBounds(10, 74, 596, 23);
		frame.getContentPane().add(prsnl);

		schl = new JRadioButton("School Copy");
		schl.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup.add(schl);
		schl.setBounds(10, 100, 596, 23);
		frame.getContentPane().add(schl);

		JButton btnget = new JButton("");
		btnget.setAction(action);
		btnget.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnget.setBounds(10, 130, 596, 56);
		frame.getContentPane().add(btnget);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 197, 596, 306);
		frame.getContentPane().add(textArea);

		scrl = new JScrollPane(textArea);
		scrl.setBounds(textArea.getBounds());
		frame.getContentPane().add(scrl);
	}

	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 403385380055194100L;

		public SwingAction() {
			putValue(NAME, "Get Logs");
			putValue(SHORT_DESCRIPTION, "The logs are all the ones currently written...");
		}

		public void actionPerformed(ActionEvent e) {
			NeuroxRead nr = new NeuroxRead();

			String str = "rp1.csv";
			Boolean personal = true;

			if (schl.isSelected()) {
				str = "sr1.csv";
				personal = !personal;
			}

			try {
				extract(str);
			} catch (IOException e1) {
				System.err.println("INTERNAL LOG SAVE FILE NOT FOUND! : " + str);
				System.exit(-1);
			}

			for (int i = 1; i < WRITTEN_PAGES; i++)
				if (i == 1) {
					textArea.setText(nr.GetPage(personal, i, "./temp/" + str));
				} else {
					textArea.setText(textArea.getText() + "\n\n" + nr.GetPage(personal, i, "./temp/" + str));
				}

			File f = new File("./temp/" + str);
			f.delete();
			f = new File(".\\temp");
			f.delete();
		}
	}

	private static void extract(String string) throws IOException {
		System.out.println("Extracting : " + string);
		File f = new File("./temp/");
		f.mkdir();
		FileOutputStream send = new FileOutputStream(f + "/" + string);
		byte[] out = new byte[RadonFiles.class.getResourceAsStream("/images/" + string).available()];
		RadonFiles.class.getResourceAsStream("/images/" + string).read(out);
		send.write(out);
		System.out.println("Extracted : " + string + " to \"" + f.getAbsoluteFile() + "\"");
		send.close();
	}
}
