package DevTSK.Message;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Messanger {
	
	public JFrame mess;
	public static JLabel in;
	public static JLabel out;
	public static JButton send;
	public final Action sendA = new SendMess();
	
	public static void main(String[] args) {
		Messanger client = new Messanger();
		client.mess.setVisible(true);
	}
	
	private Messanger(){
		init();
	}
	
	private void init(){
		mess = new JFrame();
		mess.setBounds(0, 0, 450, 550);
		mess.setResizable(false);
		mess.setIconImage(Toolkit.getDefaultToolkit().getImage(Messanger.class.getResource("/images/ikon.png")));
	}
	
	public class SendMess extends AbstractAction{
		private static final long serialVersionUID = -3226478936744743666L;

		public SendMess(){
			putValue(NAME, "Send");
			putValue(SHORT_DESCRIPTION, "Send Message");
		}

		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
