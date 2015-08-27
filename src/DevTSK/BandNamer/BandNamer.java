/* Gabe Hill working on the file IO for the words
 * Zack Arbanas is working on collecting and organising words to use
 * The_Silver_Kid overall project
 */

package DevTSK.BandNamer;


import java.io.*;
import java.net.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BandNamer {
	
	public static String[] nouns;
	public static String[] verbs;
	public static String[] adverbs;
	public static String[] adjectives;
	
	public JFrame bandNamer;
	public static JLabel output;
	public static JButton get;
	public static JButton neo;
	public static JLabel bld;
	public static JProgressBar bar;
	
	private final Action getResources = new SwingAction(); 
	private final Action getNeoName = new SwingAction2();
	
	private BandNamer(){
		init();
	}
	
	private void init(){
		bandNamer = new JFrame();
		bandNamer.getContentPane().setBackground(SystemColor.window);
		bandNamer.setIconImage(Toolkit.getDefaultToolkit().getImage(BandNamer.class.getResource("/images/ikon.png")));
		bandNamer.setTitle("Band Naminator");
		bandNamer.setBackground(SystemColor.window);
		bandNamer.setResizable(false);
		bandNamer.setBounds(0, 0, 400, 300);
		bandNamer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bandNamer.getContentPane().setLayout(null);
		
		bar = new JProgressBar();
		bar.setValue(100);
		bar.setBounds(90, 253, 304, 20);
		bar.setForeground(SystemColor.windowText);
		bar.setBackground(SystemColor.window);
		bar.setStringPainted(true);
		bandNamer.getContentPane().add(bar);
		
		bld = new JLabel();
		bld.setBounds(0, 253, 90, 20);
		bld.setText("Progress:");
		bandNamer.getContentPane().add(bld);
		
		output = new JLabel();
		
		get = new JButton();
		get.setAction(getResources);
		
		neo = new JButton();
		neo.setAction(getNeoName);
		
	}
	
	public static void main(String[] args){
		
		BandNamer window = new BandNamer();
		window.bandNamer.setVisible(true);
		
		String end = "";
		int n, v, av=0, aj;
		
		av = av + 1;
		
		System.out.println("Loading Resources:\nNouns...");
		String noun = getLst("/images/nounList.bnn", 90963);
		System.out.println("Verbs...");
		String verb = getLst("/images/verbList.bnn", 30802);
		//System.out.println("Adverbs...");
		//String adv = getLst("/images/advList.bnn", 6276);
		System.out.println("Adjectives...");
		String adj = getLst("/images/adjList.bnn", 28479);
		System.out.println("Getting name...");
		
		String[] nouns = noun.split("\\r?\\n");
		String[] verbs = verb.split("\\r?\\n");
		//String[] adverbs = adv.split("\\r?\\n");
		String[] adjectives = adj.split("\\r?\\n");
		
		n = (int) (Math.random() * nouns.length);
		v = (int) (Math.random() * verbs.length);
		//av = (int) (Math.random() * adverbs.length);
		aj = (int) (Math.random() * adjectives.length);
		
		end = adjectives[aj] + " " + nouns[n] + " " + verbs[v];
		
		System.out.println(end);
	}
	
	public static String getLst(String path, double t){
		String temp = "",s;
		double i = 0.0;
		URL uri = BandNamer.class.getResource(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(uri.getPath()));
		
			while ((s = br.readLine()) != null) {
				i = i+1;
				System.out.println(Math.round(100.0*(i/t)) + "%");
				if (i == 1){
					temp = temp + s;
				} else { 
					temp = temp + "\n" + s;
				}
			}
		
			br.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return temp;
	}
	
	private class SwingAction extends AbstractAction{
		private static final long serialVersionUID = -6534894326484781815L;
		
		public SwingAction() {
			putValue(NAME, "Generate Libs");
			putValue(SHORT_DESCRIPTION, "Generates Required String[]s.");
		}

		public void actionPerformed(ActionEvent arg0) {	
			
		}
	}
	
	private class SwingAction2 extends AbstractAction{
		private static final long serialVersionUID = -4439810172513433428L;

		public SwingAction2() {
			putValue(NAME, "Get New Name");
			putValue(SHORT_DESCRIPTION, "Generates new name.");
		}

		public void actionPerformed(ActionEvent arg0) {	
			
		}
	}
}
