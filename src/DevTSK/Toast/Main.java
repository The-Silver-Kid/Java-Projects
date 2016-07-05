package DevTSK.Toast;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import DevTSK.Util.FileFilters;

public class Main {

	static File f;

	public static void main(String[] args) throws Exception {
		init();
		Loader l = new Loader(f);
	}

	private static void init() throws IOException {
		JFrame nulframe = new JFrame();
		nulframe.setTitle("Text Toast Adventure Config");
		nulframe.setSize(1, 1);
		nulframe.setVisible(true);

		JFileChooser jfc = new JFileChooser();

		int i = JOptionPane.showConfirmDialog(nulframe, "Start new game?", "Text Toast Game", JOptionPane.YES_NO_OPTION);

		if (i == JOptionPane.YES_OPTION) {
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			jfc.showSaveDialog(nulframe);
			if (jfc.getSelectedFile() == null) {
				System.err.println("No File Selected.\nAssuming 'Cancel' was chosen...\nExiting...");
				System.exit(0);
			}
			f = new File(jfc.getSelectedFile().getAbsolutePath() + "\\Toast.pks");
			f.createNewFile();
		} else {

			jfc.setFileFilter(new FileFilters(".pks", "Text Toast Adventure Save File"));
			jfc.showOpenDialog(nulframe);

			f = jfc.getSelectedFile();
			if (f == null) {
				System.err.println("No File Selected.\nAssuming 'Cancel' was chosen...\nExiting...");
				System.exit(0);
			} else if (f.exists()) {
				System.out.println(f.getName() + " EXIISTS");
			} else {
				System.out.println(f.getName() + " DOES NOT EXIIST");
			}

		}
		nulframe.dispose();
	}
}