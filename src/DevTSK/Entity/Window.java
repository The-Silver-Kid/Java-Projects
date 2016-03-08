/* Window Class
 * (C) DevTSK Productions 2015 */

package DevTSK.Entity;

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
import DevTSK.Exception.UnexceptableContentException;

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

	public Window(String n, int close, int x, int y, int CharRPWin) {
		if (CharRPWin == 0) {

			frmPoniiPic = new JFrame();
			frmPoniiPic.getContentPane().setBackground(SystemColor.window);
			frmPoniiPic.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
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
					throw new UnexceptableContentException("Invalad Close Opperation");
				} catch (UnexceptableContentException e) {
					e.printStackTrace();
					frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			frmPoniiPic.getContentPane().setLayout(null);

			lblPoniiPic = new JLabel();
			lblPoniiPic.setBounds(0, 0, 700, 700);
			frmPoniiPic.getContentPane().add(lblPoniiPic);

			lblCMPic = new JLabel();
			lblCMPic.setBounds(350, 0, 350, 350);
			frmPoniiPic.getContentPane().add(lblCMPic);

			lblTextArea = new JTextField();
			lblTextArea.setToolTipText("Ponii Name");
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
			frmPoniiPic.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
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
					throw new UnexceptableContentException("Invalad Close Opperation");
				} catch (UnexceptableContentException e) {
					e.printStackTrace();
					frmPoniiPic.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
			frmPoniiPic.getContentPane().setLayout(null);

			frmPoniiPicCont = new JFrame();
			frmPoniiPicCont.getContentPane().setBackground(SystemColor.window);
			frmPoniiPicCont.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/ikon.png")));
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

	private ImageIcon getImIcn(String sr) throws Exception {
		Image img = ImageIO.read(Window.class.getResource(sr));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}

	public void drawPic(String s) throws Exception {
		lblPoniiPic.setIcon(getImIcn(s));
	}

	public void println(String s) {
		lblInfo.setText(lblInfo.getText() + s + "\n");
	}

	public void println() {
		lblInfo.setText(lblInfo.getText() + "\n");
	}

	public void printCl() {
		lblInfo.setText("");
	}

	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 3646194311743048047L;

		public SwingAction() {
			putValue(NAME, "Run");
			putValue(SHORT_DESCRIPTION, "Pushes string to internal system.");
		}

		public void actionPerformed(ActionEvent arg0) {
			try {
				EntityLoader.handle(lblTextArea.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public Icon getImageIcn(String imagePath) throws IOException {
		Image img = ImageIO.read(Window.class.getResource(imagePath));
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
}