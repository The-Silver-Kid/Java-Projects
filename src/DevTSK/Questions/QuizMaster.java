package DevTSK.Questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;

public class QuizMaster {

	public static void main(String[] args) throws Exception {
		File f = findDir();
		System.out.println("Loading Questions from:\n" + f.toString());
		Gson g = new Gson();

		BufferedReader br = new BufferedReader(new FileReader(f));
		Question[] qs = g.fromJson(br, Question[].class);
		for (int i = 0; i < qs.length; i++)
			for (int e = 0; e < qs[i].getAnswers().length; e++)
				System.out.println(qs[i].getAnswers()[e]);
		QuizMasterWindow w = new QuizMasterWindow(qs);
		w.init();
	}

	private static File findDir() {
		JFileChooser choose = new JFileChooser();
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.addChoosableFileFilter(new FileNameExtensionFilter("QuizMaster Question Set", "QMZ"));
		choose.setAcceptAllFileFilterUsed(false);
		choose.showOpenDialog(null);

		return choose.getSelectedFile();
	}

}
