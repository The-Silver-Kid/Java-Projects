package projectArchive.PicInspect;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

// TODO : Figure out what this was...
public class PicInspect {

	private static JFrame window;
	private static JLabel lol;

	private static Boolean debug = true;

	private static File f;

	//private static final NumGenerator ng = new NumGenerator(255, false);

	public static void main(String[] args) throws IOException {
		//Yes I use windows... I'm sorry if that offends you...
		if (debug) {
			f = new File("C:\\Users\\<lol>\\Desktop\\156.png");
		} else {
			f = findDir();
		}

		Image img = ImageIO.read(f);

		Icon im = getImageIcn(img);

		System.out.println(im.getIconHeight() + " " + im.getIconWidth());

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		window = new JFrame();
		if (im.getIconHeight() > 300 && im.getIconWidth() > 300) {
			window.setBounds((int) screenSize.getWidth() / 2, (int) screenSize.getHeight() / 2, im.getIconWidth(), im.getIconHeight());
		} else {
			window.setBounds((int) screenSize.getWidth() / 2, (int) screenSize.getHeight() / 2, 3 * im.getIconWidth(), 3 * im.getIconHeight() + 25);
		}
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("YOLO!");
		window.getContentPane().setVisible(true);
		window.getContentPane().setLayout(null);
		window.setResizable(false);
		window.setVisible(true);

		lol = new JLabel(im);
		if (im.getIconHeight() > 300 && im.getIconWidth() > 300) {
			lol.setBounds(0, 0, im.getIconWidth(), im.getIconHeight());
		} else {
			lol.setBounds(im.getIconWidth(), im.getIconHeight(), im.getIconWidth(), im.getIconHeight());
		}
		window.add(lol);

		process(img, im.getIconWidth(), im.getIconHeight());

		System.exit(1);

		//Toolkit.getDefaultToolkit().getSystemClipboard();
	}

	private static void process(Image img, int w, int h) {
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				String s = Integer.toHexString(((BufferedImage) img).getRGB(x, y));
				if (s.length() == 6) {
					s = "00" + s;
				}
			}
		}
	}

	private static File findDir() {
		JFileChooser choose = new JFileChooser();
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.addChoosableFileFilter(new FileNameExtensionFilter("Portable Network Graphic", "png"));
		choose.setAcceptAllFileFilterUsed(false);
		//choose.removeChoosableFileFilter(new FileNameExtensionFilter("All Files", ""));
		choose.showDialog(null, "Open File");

		return choose.getSelectedFile();
	}

	private static Icon getImageIcn(Image img) throws IOException {
		ImageIcon icn = new ImageIcon(img);
		return icn;
	}
}
/*
class FileFilter implements FilenameFilter {

	private String fileExtension;

	public FileFilter(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
	public boolean accept(File directory, String fileName) {
		return (fileName.endsWith(this.fileExtension));
	}
}
*/