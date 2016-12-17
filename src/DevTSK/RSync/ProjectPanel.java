package DevTSK.RSync;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class ProjectPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final Action source = new OpenSource();
	private final Action target = new OpenTarget();

	/**
	 * Create the panel.
	 */
	public ProjectPanel() {
		setBounds(0, 0, 1024, 720);
		setForeground(SystemColor.windowText);
		setBackground(SystemColor.window);
		setLayout(null);

		JSeparator topSep = new JSeparator();
		topSep.setBounds(10, 100, 1000, 2);
		topSep.setForeground(SystemColor.windowBorder);
		topSep.setBackground(SystemColor.window);
		add(topSep);

		JSeparator bottomSep = new JSeparator();
		bottomSep.setBounds(10, 600, 1000, 2);
		bottomSep.setForeground(SystemColor.windowBorder);
		bottomSep.setBackground(SystemColor.window);
		add(bottomSep);

		JLabel titleText = new JLabel("RN-SYNCHRONIZE");
		titleText.setBounds(10, 11, 418, 78);
		titleText.setForeground(SystemColor.windowText);
		titleText.setBackground(SystemColor.window);
		titleText.setFont(new Font("OCR A Extended", Font.BOLD | Font.ITALIC, 38));
		titleText.setHorizontalAlignment(SwingConstants.CENTER);
		add(titleText);

		JProgressBar bar = new JProgressBar();
		bar.setBounds(864, 75, 146, 14);
		bar.setForeground(new Color(255, 0, 0));
		bar.setBackground(SystemColor.window);
		bar.setValue(0);
		bar.setVisible(false);
		add(bar);

		JButton btnOpen = new JButton("Source");
		btnOpen.setBounds(10, 650, 89, 23);
		btnOpen.setAction(source);
		btnOpen.setToolTipText("Opens a Folder");
		add(btnOpen);

		JLabel lblSource = new JLabel("Source:");
		lblSource.setBounds(10, 113, 55, 14);
		lblSource.setForeground(SystemColor.windowText);
		lblSource.setBackground(SystemColor.window);
		add(lblSource);

		JLabel lblSourcePath = new JLabel("");
		lblSourcePath.setBounds(85, 113, 343, 14);
		lblSourcePath.setForeground(SystemColor.windowText);
		lblSourcePath.setBackground(SystemColor.window);
		add(lblSourcePath);

		JLabel lblTarget = new JLabel("Target:");
		lblTarget.setBounds(10, 138, 55, 14);
		lblTarget.setBackground(SystemColor.window);
		lblTarget.setForeground(SystemColor.windowText);
		add(lblTarget);

		JLabel lblTargetPath = new JLabel("");
		lblTargetPath.setBounds(85, 138, 343, 14);
		lblTargetPath.setBackground(SystemColor.window);
		lblTargetPath.setForeground(SystemColor.windowText);
		add(lblTargetPath);

		JButton btnTarget = new JButton("Target");
		btnTarget.setBounds(109, 650, 89, 23);
		btnTarget.setAction(target);
		btnTarget.setEnabled(false);
		add(btnTarget);

		JLabel lblOpen = new JLabel("Open");
		lblOpen.setBounds(10, 617, 188, 14);
		lblOpen.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblOpen);

		JList<File> noTransList = new JList<File>();
		noTransList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		noTransList.setBounds(10, 163, 340, 426);
		add(noTransList);

		JList<File> transList = new JList<File>();
		transList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		transList.setBounds(670, 163, 340, 426);
		add(transList);

		JList newList = new JList();
		newList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		newList.setBounds(360, 163, 300, 426);
		add(newList);

		JButton btnNewignore = new JButton("NewIgnore");
		btnNewignore.setBounds(311, 613, 89, 23);
		add(btnNewignore);

		JButton btnIgnorenew = new JButton("IgnoreNew");
		btnIgnorenew.setBounds(311, 650, 89, 23);
		add(btnIgnorenew);

		JButton btnNewmove = new JButton("NewMove");
		btnNewmove.setBounds(624, 613, 89, 23);
		add(btnNewmove);

		JButton btnMovenew = new JButton("MoveNew");
		btnMovenew.setBounds(624, 650, 89, 23);
		add(btnMovenew);

	}

	private class OpenSource extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public OpenSource() {
			putValue(NAME, "Source");
			putValue(SHORT_DESCRIPTION, "Opens a folder for copying");
		}

		public void actionPerformed(ActionEvent e) {
			RSync.l.log("Open source clicked...");
		}
	}

	private class OpenTarget extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public OpenTarget() {
			putValue(NAME, "Target");
			putValue(SHORT_DESCRIPTION, "Opens a folder for destination");
		}

		public void actionPerformed(ActionEvent e) {
			RSync.l.log("Open destination clicked...");
		}
	}
}
