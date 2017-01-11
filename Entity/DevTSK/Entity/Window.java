/* Window Class
 * (C) DevTSK Productions 2015 */

package DevTSK.Entity;

import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import DAG.Config.Config;
import DAG.Config.ConfigException;
import DevTSK.Util.FileDetect;

/**
 * Draws the window and receives text to put in the output boxes
 * 
 * @author The_Silver_Kid
 *
 */
public class Window {
	public JFrame frmPoniiPic;
	public JFrame frmPoniiPicCont;

	public final Action action = new SwingAction();
	public JLabel lblPoniiPic;
	public JLabel lblCMPic;
	public JTextField lblTextArea;
	public JTextArea lblInfo;
	public JScrollPane loltest;
	public JButton in;
	public String handler = "";

	public EntityLoader el;

	/**
	 * Sets up the windows based on various input variables and configuration.
	 * 
	 * @param String
	 *            Title
	 * @param int
	 *            close operation
	 * @param int
	 *            x cord of the window
	 * @param int
	 *            y cord of the window
	 * @param int
	 *            if the interaction window should be separate or not (0 or 1)
	 * @param EntityLoader
	 *            the constructed Entity Loader from the main class.
	 * @throws ConfigException
	 * @throws IOException
	 */
	public Window(String n, int close, int x, int y, int CharRPWin, EntityLoader h) throws ConfigException, IOException {

		el = h;

		if (CharRPWin == 0) {

			frmPoniiPic = new JFrame();
			frmPoniiPic.getContentPane().setBackground(SystemColor.window);
			frmPoniiPic
					.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/DevTSK/Entity/images/ikon.png")));
			frmPoniiPic.setTitle(n);
			frmPoniiPic.setBackground(SystemColor.window);
			frmPoniiPic.setResizable(false);
			frmPoniiPic.setBounds(x, y, 700, 900);
			if (close == 0) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			} else if (close == 1) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} else {
				try {
					throw new Exception("Invalad Close Opperation");
				} catch (Exception e) {
					e.printStackTrace();
					frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			frmPoniiPic.getContentPane().setLayout(null);
			frmPoniiPic.setVisible(true);

			lblPoniiPic = new JLabel();
			lblPoniiPic.setBounds(0, 0, 700, 700);
			frmPoniiPic.getContentPane().add(lblPoniiPic);

			lblCMPic = new JLabel();
			lblCMPic.setBounds(350, 0, 350, 350);
			frmPoniiPic.getContentPane().add(lblCMPic);

			lblTextArea = new JTextField();
			lblTextArea.setToolTipText("Entity Name");
			lblTextArea.setText("");
			lblTextArea.setBounds(10, 710, 580, 20);
			frmPoniiPic.getContentPane().add(lblTextArea);

			lblInfo = new JTextArea();
			lblInfo.setWrapStyleWord(true);
			lblInfo.setToolTipText("Information box");
			lblInfo.setLineWrap(true);
			lblInfo.setText("");
			lblInfo.setBounds(10, 740, 670, 120);
			lblInfo.setEditable(false);
			frmPoniiPic.getContentPane().add(lblInfo);

			loltest = new JScrollPane(lblInfo);
			loltest.setBounds(10, 740, 670, 120);
			loltest.setAutoscrolls(true);
			frmPoniiPic.getContentPane().add(loltest);

			in = new JButton();
			in.setBounds(600, 710, 80, 20);
			in.setAction(action);
			frmPoniiPic.getRootPane().setDefaultButton(in);
			frmPoniiPic.getContentPane().add(in);
		}
		if (CharRPWin == 1) {

			frmPoniiPic = new JFrame();
			frmPoniiPic.getContentPane().setBackground(SystemColor.window);
			frmPoniiPic
					.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/DevTSK/Entity/images/ikon.png")));
			frmPoniiPic.setTitle(n + " Picture Window");
			frmPoniiPic.setBackground(SystemColor.window);
			frmPoniiPic.setResizable(false);
			frmPoniiPic.setBounds(x, y, 700, 700);
			if (close == 0) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			} else if (close == 1) {
				frmPoniiPic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} else {
				try {
					throw new Exception("Invalad Close Opperation");
				} catch (Exception e) {
					e.printStackTrace();
					frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			frmPoniiPic.getContentPane().setLayout(null);
			frmPoniiPic.setVisible(true);

			frmPoniiPicCont = new JFrame();
			frmPoniiPicCont.getContentPane().setBackground(SystemColor.window);
			frmPoniiPicCont
					.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/DevTSK/Entity/images/ikon.png")));
			frmPoniiPicCont.setTitle(n + " Control Window");
			frmPoniiPicCont.setBackground(SystemColor.window);
			frmPoniiPicCont.setResizable(false);
			frmPoniiPicCont.setBounds(x + 700, y, 700, 500);
			frmPoniiPicCont.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			frmPoniiPicCont.getContentPane().setLayout(null);
			frmPoniiPicCont.setVisible(true);

			lblPoniiPic = new JLabel();
			lblPoniiPic.setBounds(0, 0, 700, 700);
			frmPoniiPic.getContentPane().add(lblPoniiPic);

			lblCMPic = new JLabel();
			lblCMPic.setBounds(350, 0, 350, 350);
			frmPoniiPic.getContentPane().add(lblCMPic);

			lblTextArea = new JTextField();
			lblTextArea.setToolTipText("Entity Name");
			lblTextArea.setText("");
			lblTextArea.setBounds(10, 10, 580, 20);
			frmPoniiPicCont.getContentPane().add(lblTextArea);

			lblInfo = new JTextArea();
			lblInfo.setWrapStyleWord(true);
			lblInfo.setToolTipText("Information box");
			lblInfo.setLineWrap(true);
			lblInfo.setText("");
			lblInfo.setBounds(10, 40, 670, 420);
			lblInfo.setEditable(false);
			frmPoniiPicCont.getContentPane().add(lblInfo);

			loltest = new JScrollPane(lblInfo);
			loltest.setBounds(lblInfo.getBounds());
			loltest.setAutoscrolls(true);
			frmPoniiPicCont.getContentPane().add(loltest);

			in = new JButton();
			in.setBounds(600, 10, 80, 20);
			in.setAction(action);
			frmPoniiPicCont.getRootPane().setDefaultButton(in);
			frmPoniiPicCont.getContentPane().add(in);
		}
		setupConfig();
		punch();
	}

	/**
	 * Converts a normal image from classpath to a ImageIcon for display
	 * 
	 * @param String
	 *            image name
	 * @return Returns The Converted ImageIcon
	 * @throws IOException
	 */
	private ImageIcon getImIcn(String sr) throws IOException {
		Image img = ImageIO.read(Window.class.getResource(sr));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}

	/**
	 * draws the picture to the picture label
	 * 
	 * @param String
	 *            image name
	 * @throws IOException
	 */
	public void drawPic(String s) throws IOException {
		lblPoniiPic.setIcon(getImIcn(s));
	}

	/**
	 * prints the input string to the output box
	 * 
	 * @param String
	 *            input string
	 */
	public void println(String s) {
		lblInfo.setText(lblInfo.getText() + s + "\n");
	}

	/**
	 * prints a blank line to the output box
	 */
	public void println() {
		lblInfo.setText(lblInfo.getText() + "\n");
	}

	/**
	 * clears the output box
	 */
	public void printCl() {
		lblInfo.setText("");
	}

	/**
	 * Class that handles when you click the button or press enter.
	 * 
	 * @author The_Silver_Kid
	 *
	 */
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 3646194311743048047L;

		/**
		 * makes the button look beautiful.
		 */
		public SwingAction() {
			putValue(NAME, "Run");
			putValue(SHORT_DESCRIPTION, "Pushes string to internal system.");
		}

		/**
		 * Sends the input box text to the Entity Loader for processing.
		 */
		public void actionPerformed(ActionEvent arg0) {
			try {
				el.handle(lblTextArea.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Converts an internal image to an icon.
	 * 
	 * @param String
	 *            image name
	 * @return Icon format of the image.
	 * @throws IOException
	 */
	public Icon getImageIcn(String imagePath) throws IOException {
		Image img = ImageIO.read(Window.class.getResource(imagePath));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}

	/**
	 * DESTROY ALL THE WINDOW AND EVERYTHING RELATED TO IT
	 * *EVIL LAUGHING HERE*
	 */
	public void destroyWindows() {
		frmPoniiPic.dispose();
		frmPoniiPicCont.dispose();
	}

	/**
	 * Gets the System working... Unknown why need but it is...
	 * 
	 * @throws ConfigException
	 */
	public void punch() throws ConfigException {
		if (new Config("./PoniiConfig.cfg").getDouble("version") < 2.0) {
			printCl();
			println("If you are seeing this something went wrong"
					+ "\nIt is probably my fault... open a bug on github.");
		}
	}

	/**
	 * Sets up various things by loading them from the external configuration
	 * file.
	 * 
	 * @throws ConfigException
	 * @throws IOException
	 */
	public void setupConfig() throws ConfigException, IOException {
		FileDetect fd = new FileDetect("./PoniiConfig.cfg");

		if (!fd.Detect())
			el.extractConfig();
		Config c = new Config("./PoniiConfig.cfg");

		if (c.getBoolean("sep")) {
			frmPoniiPic.dispose();
			Convert("Ponii Program 4.0", 1, 0, 0);
			frmPoniiPic.setVisible(true);
			frmPoniiPicCont.setVisible(true);
			int r = c.getInt("bgr"), g = c.getInt("bgg"), b = c.getInt("bgb");
			frmPoniiPicCont.getContentPane().setBackground(new Color(r, g, b));
		}

		int r = c.getInt("bgr"), g = c.getInt("bgg"), b = c.getInt("bgb");
		frmPoniiPic.getContentPane().setBackground(new Color(r, g, b));

		r = c.getInt("inbr");
		g = c.getInt("inbg");
		b = c.getInt("inbb");
		lblTextArea.setBackground(new Color(r, g, b));

		r = c.getInt("infr");
		g = c.getInt("infg");
		b = c.getInt("infb");
		lblTextArea.setForeground(new Color(r, g, b));

		r = c.getInt("outfr");
		g = c.getInt("outfg");
		b = c.getInt("outfb");
		lblInfo.setForeground(new Color(r, g, b));

		r = c.getInt("outbr");
		g = c.getInt("outbg");
		b = c.getInt("outbb");
		lblInfo.setBackground(new Color(r, g, b));
	}

	/**
	 * Converts the window type
	 * 
	 * @param String
	 *            name
	 * @param int
	 *            default close operation
	 * @param int
	 *            x pos
	 * @param int
	 *            y pos
	 */
	private void Convert(String n, int close, int x, int y) {
		frmPoniiPic = new JFrame();
		frmPoniiPic.getContentPane().setBackground(SystemColor.window);
		frmPoniiPic
				.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/DevTSK/Entity/images/ikon.png")));
		frmPoniiPic.setTitle(n + " Picture Window");
		frmPoniiPic.setBackground(SystemColor.window);
		frmPoniiPic.setResizable(false);
		frmPoniiPic.setBounds(x, y, 700, 700);
		if (close == 0) {
			frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		} else if (close == 1) {
			frmPoniiPic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else {
			try {
				throw new Exception("Invalad Close Opperation");
			} catch (Exception e) {
				e.printStackTrace();
				frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		}
		frmPoniiPic.getContentPane().setLayout(null);

		frmPoniiPicCont = new JFrame();
		frmPoniiPicCont.getContentPane().setBackground(SystemColor.window);
		frmPoniiPicCont
				.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/DevTSK/Entity/images/ikon.png")));
		frmPoniiPicCont.setTitle(n + " Control Window");
		frmPoniiPicCont.setBackground(SystemColor.window);
		frmPoniiPicCont.setResizable(false);
		frmPoniiPicCont.setBounds(x + 700, y, 700, 500);
		frmPoniiPicCont.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmPoniiPicCont.getContentPane().setLayout(null);

		lblPoniiPic = new JLabel();
		lblPoniiPic.setBounds(0, 0, 700, 700);
		frmPoniiPic.getContentPane().add(lblPoniiPic);

		lblCMPic = new JLabel();
		lblCMPic.setBounds(350, 0, 350, 350);
		frmPoniiPic.getContentPane().add(lblCMPic);

		lblTextArea = new JTextField();
		lblTextArea.setToolTipText("Entity Name");
		lblTextArea.setText("");
		lblTextArea.setBounds(10, 10, 580, 20);
		frmPoniiPicCont.getContentPane().add(lblTextArea);

		lblInfo = new JTextArea();
		lblInfo.setWrapStyleWord(true);
		lblInfo.setToolTipText("Information box");
		lblInfo.setLineWrap(true);
		lblInfo.setText("");
		lblInfo.setBounds(10, 40, 670, 420);
		lblInfo.setEditable(false);
		frmPoniiPicCont.getContentPane().add(lblInfo);

		loltest = new JScrollPane(lblInfo);
		loltest.setBounds(lblInfo.getBounds());
		loltest.setAutoscrolls(true);
		frmPoniiPicCont.getContentPane().add(loltest);

		in = new JButton();
		in.setBounds(600, 10, 80, 20);
		in.setAction(action);
		frmPoniiPicCont.getRootPane().setDefaultButton(in);
		frmPoniiPicCont.getContentPane().add(in);
	}
}