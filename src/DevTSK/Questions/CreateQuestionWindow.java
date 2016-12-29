package DevTSK.Questions;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

	private JTextArea qBox = new JTextArea();

	private JTextArea aBox = new JTextArea();
	//private JScrollPane editScroll;

	private JButton generate = new JButton();
	private JButton assemble = new JButton();

	private GenerateQuestion gQn = new GenerateQuestion();
	private GenerateJSON gJSON = new GenerateJSON();

	private Question[] qs = new Question[] {};
	private ArrayList<Question> qn = new ArrayList<Question>();

	public CreateQuestionWindow() {
		main.setBounds(0, 0, 505, 560);
		main.setLayout(null);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
		main.setIconImage(Toolkit.getDefaultToolkit().getImage(CreateQuestionWindow.class.getResource("/images/ikon.png")));
		main.setVisible(true);

		qBox.setBounds(10, 10, 480, 240);
		qBox.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 128, 128), new Color(64, 64, 64)));
		qBox.setLineWrap(true);
		main.getContentPane().add(qBox);

		aBox.setBounds(10, 250, 480, 240);
		aBox.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 128, 128), new Color(64, 64, 64)));
		aBox.setLineWrap(true);
		main.getContentPane().add(aBox);

		/*editScroll = new JScrollPane(qBox);
		editScroll.setBounds(qBox.getBounds());
		editScroll.setAutoscrolls(true);
		main.getContentPane().add(editScroll);*/

		generate.setBounds(10, 500, 240, 20);
		generate.setAction(gQn);
		generate.setText("Create Question");
		main.getContentPane().add(generate);

		assemble.setBounds(250, 500, 240, 20);
		assemble.setAction(gJSON);
		assemble.setText("Assemble Questions");
		main.getContentPane().add(assemble);
	}

	private class GenerateQuestion extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			Question q = null;

			String[] slated = aBox.getText().split("\n");
			String cAns = slated[0];
			String[] wAns = new String[slated.length - 1];
			for (int i = 0; i < wAns.length; i++)
				wAns[i] = slated[i + 1];
			q = new Question(qBox.getText(), cAns, wAns);

			qn.add(q);

			aBox.setText("");
			qBox.setText("");
		}

	}

	private class GenerateJSON extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent arg0) {
			qs = new Question[qn.size()];
			qn.toArray(qs);

			File f = findDir();

			Gson g = new GsonBuilder().setPrettyPrinting().create();
			String s = g.toJson(qs);

			StringWriter sw = new StringWriter();
			try {
				sw.Write(s, f, false);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}

	}

	static File findDir() {
		JFileChooser choose = new JFileChooser();
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.addChoosableFileFilter(new FileNameExtensionFilter("QuizMaster Question Set", "QMZ"));
		choose.setAcceptAllFileFilterUsed(false);
		choose.showSaveDialog(null);

		String s = choose.getSelectedFile().getAbsolutePath();

		if (!s.toLowerCase().contains(".qmz"))
			s = s + ".QMZ";

		File f = new File(s);

		return f;
	}

	public void init() {
		System.out.println("Window Initialized.");
	}
}
