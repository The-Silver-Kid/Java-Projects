package DevTSK.Questions;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import DevTSK.Util.StringWriter;

public class CreateQuestionWindow {

	private JFrame main = new JFrame();

	private JTextArea editBox = new JTextArea();
	//private static JScrollPane l = new JScrollPane();

	private JButton generate = new JButton();

	private GenerateJSON gJSON = new GenerateJSON();

	public CreateQuestionWindow() {
		main.setBounds(0, 0, 505, 560);
		main.setLayout(null);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
		main.setIconImage(Toolkit.getDefaultToolkit().getImage(CreateQuestionWindow.class.getResource("/images/ikon.png")));
		main.setVisible(true);

		editBox.setBounds(10, 10, 480, 480);
		editBox.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 128, 128), new Color(64, 64, 64)));
		main.add(editBox);

		generate.setBounds(10, 500, 480, 20);
		generate.setAction(gJSON);
		generate.setText("GenerateQuestions!");
		main.add(generate);
	}

	private class GenerateJSON extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			String[] slated = editBox.getText().split("\n");
			String[][] slatedSlate = new String[slated.length][];
			for (int i = 0; i < slated.length; i++) {
				slatedSlate[i] = slated[i].split(",");
			}
			Question[] questionSet = new Question[slated.length];
			for (int i = 0; i < slated.length; i++) {
				questionSet[i] = new Question(slatedSlate[i]);
				//System.out.println(slated[i] + "\n" + slatedSlate[i][0]);
			}

			File f = findDir();

			Gson g = new GsonBuilder().setPrettyPrinting().create();
			String s = g.toJson(questionSet);

			StringWriter sw = new StringWriter();
			try {
				sw.Write(s, f, false);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}

		private File findDir() {
			JFileChooser choose = new JFileChooser();
			choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
			choose.addChoosableFileFilter(new FileNameExtensionFilter("JavaScript Object Notation", "JSON"));
			choose.setAcceptAllFileFilterUsed(false);
			choose.showSaveDialog(null);

			return choose.getSelectedFile();
		}

	}

	public void init() {
		System.out.println("Window Initialized.");
	}
}
