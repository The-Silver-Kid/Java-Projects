package projectArchive.Box;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Test {

	static File f;
	static byte[] bytes;

	public static void main(String[] args) {
		f = findDir();
		try {
			bytes = lol(f);
		} catch (IOException e) {
			System.err.println("Oh noes!\n");
			e.printStackTrace();
			System.exit(1);
		}

	}

	private static File findDir() {
		JFileChooser choose = new JFileChooser();
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//choose.addChoosableFileFilter(new FileNameExtensionFilter("Portable Network Graphic", "png"));
		//choose.setAcceptAllFileFilterUsed(false);
		//choose.removeChoosableFileFilter(new FileNameExtensionFilter("All Files", ""));
		choose.showDialog(null, "Open File");

		return choose.getSelectedFile();
	}

	private static byte[] lol(File f) throws IOException {
		FileInputStream readr = new FileInputStream(f);

		byte[] bytes = new byte[(int) f.length()];

		readr.read(bytes);

		readr.close();

		return bytes;
	}
}
