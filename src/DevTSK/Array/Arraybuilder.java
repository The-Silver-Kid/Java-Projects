/**
 * Array builder
 * (C) 2015 DevTSK
 */
package DevTSK.Array;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
// ur a nerd
public class Arraybuilder {
	
	private JFrame window;
	private static JTextArea output;
	private static JTextArea input;
	private static JScrollPane skrollout;
	private static JScrollPane skrollin;
	private static JButton button;
	
	private final Action build = new Builder();
	
	public static void main(String[] args) {
		Arraybuilder ab = new Arraybuilder();
		ab.window.setVisible(true);
	}
	
	public Arraybuilder() {
		window = new JFrame();
		window.getContentPane().setBackground(SystemColor.window);
		window.setIconImage(Toolkit.getDefaultToolkit().getImage(Arraybuilder.class.getResource("/images/ikon.png")));
		window.setTitle("Array builder");
		window.setBackground(SystemColor.window);
		window.setResizable(false);
		window.setBounds(100, 100, 515, 475);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		output = new JTextArea();
		output.setEditable(false);
		output.setBackground(new Color(230, 230, 230));
		output.setForeground(new Color(0, 0, 0));
		output.setBounds(10, 250, 490, 190);
		window.getContentPane().add(output);
		
		input = new JTextArea();
		input.setBounds(10, 10, 490, 190);
		input.setEditable(true);
		input.setForeground(new Color(0, 0, 0));
		input.setBackground(new Color(230, 230, 230));
		window.getContentPane().add(input);
		
		button = new JButton();
		button.setAction(build);
		button.setBounds(10, 215, 490, 20);
		window.getContentPane().add(button);
		
		skrollin = new JScrollPane(input);
		skrollin.setBounds(input.getBounds());
		window.getContentPane().add(skrollin);
		
		skrollout = new JScrollPane(output);
		skrollout.setBounds(output.getBounds());
		window.getContentPane().add(skrollout);
	}
	
	public class Builder extends AbstractAction {
		private static final long serialVersionUID = 2753173073359879175L;
		
		public Builder() {
			putValue(NAME, "Build!");
		}
		
		public void actionPerformed(ActionEvent arg0) {
			String end = "new String[] {";
			String[] lol = input.getText().split("\\n+");
			for (int i = 0; i < lol.length; i ++) {
				if (i != lol.length - 1)
					end = end + "\"" + lol[i] + "\", ";
				if (i == lol.length - 1)
					end = end + "\"" + lol[i] + "\"";
			}
			end = end + "}";
			output.setText(end);
		}
		
	}
}
