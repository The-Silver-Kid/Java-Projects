package DevTSK.Message;

//import javax.swing.*;

//import java.awt.*;
//import java.awt.event.*;
import java.net.*;
import java.io.*;

public class Messanger {
	
	private static Socket socket;
	private static PrintWriter printWriter;
	public static void main(String[] args)
	{
		try
		{
			socket = new Socket("localhost",63400);
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			printWriter.println("Hello Socket");
			printWriter.println("EYYYYYAAAAAAAA!!!!");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
/*	public JFrame mess;
	public static JTextArea in;
	public static JTextArea out;
	public static JLabel cr;
	public static JButton send;
	public static JScrollPane inp;
	public static JScrollPane op;
	
	public final Action sendA = new SendMess();
	
	public static String log;
	public static String internalName = (System.getProperty("os.name") + ":" + System.getProperty("user.name")).toUpperCase();
	public static String name = System.getProperty("user.name");
	
	public static void main(String[] args) {
		Messanger client = new Messanger();
		client.mess.setVisible(true);
		
		System.out.println(internalName + "\n" + name);
	}
	
	private Messanger(){
		init();
	}
	
	private void init(){
		mess = new JFrame();
		mess.setBounds(0, 0, 450, 550);
		mess.setResizable(false);
		mess.setIconImage(Toolkit.getDefaultToolkit().getImage(Messanger.class.getResource("/images/ikon.png")));
		mess.getContentPane().setBackground(SystemColor.window);
		mess.setTitle("DevTSK messanger");
		mess.setBackground(SystemColor.window);
		mess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mess.getContentPane().setLayout(null);
		
		cr = new JLabel();
		cr.setBounds(0, 500, 200, 20);
		cr.setForeground(SystemColor.windowText);
		cr.setText("(C) DevTSK Productions 2015");
		mess.getContentPane().add(cr);
		
		in = new JTextArea();
		in.setBounds(10, 10, 425, 200);
		in.setForeground(SystemColor.windowText);
		in.setBackground(SystemColor.window);
		in.setText("New Mesages Here");
		in.setAlignmentX(0);
		in.setAlignmentY(0);
		in.setEditable(false);
		mess.getContentPane().add(in);
		
		out = new JTextArea();
		out.setBounds(10, 220, 425, 200);
		out.setForeground(SystemColor.windowText);
		out.setBackground(SystemColor.window);
		out.setText("Your Message Here");
		out.setAlignmentX(0);
		out.setAlignmentY(0);
		out.setEditable(true);
		mess.getContentPane().add(out);
		
		inp = new JScrollPane(in);
		inp.setBounds(in.getBounds());
		mess.getContentPane().add(inp);
		
		op = new JScrollPane(out);
		op.setBounds(out.getBounds());
		mess.getContentPane().add(op);
	}
	
	public class SendMess extends AbstractAction{
		private static final long serialVersionUID = -3226478936744743666L;

		public SendMess(){
			putValue(NAME, "Send");
			putValue(SHORT_DESCRIPTION, "Send Message");
		}

		public void actionPerformed(ActionEvent arg0) {
			
		}
	}*/
}
