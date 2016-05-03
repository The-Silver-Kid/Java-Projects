package DevTSK.XMPP;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.ConnectionConfiguration.Builder;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class furcuss implements MessageListener {

	XMPPConnection connection;

	public static void main(String[] args) throws XMPPException {
		furcuss f = new furcuss();
		f.login("hiH", "h");
	}

	public void login(String userName, String password) throws XMPPException {
		Builder<?, ?> b = null;
		b.setUsernameAndPassword(userName, password);
		fb config = new fb(b);
		//connection //= new XMPPConnection(config);

		//connection.connect();
		//connection.login(userName, password);
	}

	@Override
	public void processMessage(Message message) {
		// TODO Auto-generated method stub

	}

	/*public void sendMessage(String message, String to) throws XMPPException {
		Chat chat = connection.getChatManager().createChat(to, this);
		chat.sendMessage(message);
	}
	
	public void displayBuddyList() {
		Roster roster = connection.getRoster();
		Collection<RosterEntry> entries = roster.getEntries();
	
		System.out.println("\n\n" + entries.size() + " buddy(ies):");
		for (RosterEntry r : entries) {
			System.out.println(r.getUser());
		}
	}
	
	public void disconnect() {
		connection.disconnect();
	}
	
	public void processMessage(Chat chat, Message message) {
		if (message.getType() == Message.Type.chat)
			System.out.println(chat.getParticipant() + " says: " + message.getBody());
	}
	
	public static void main(String args[]) throws XMPPException, IOException {
		// declare variables
		furcuss c = new furcuss();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg;
	
		// turn on the enhanced debugger
		XMPPConnection = true;
	
		// Enter your login information here
		c.login("[B]username[/B]", "[B]password[/B]");
	
		c.displayBuddyList();
	
		System.out.println("-----");
	
		System.out.println("Who do you want to talk to? - Type contacts full email address:");
		String talkTo = br.readLine();
	
		System.out.println("-----");
		System.out.println("All messages will be sent to " + talkTo);
		System.out.println("Enter your message in the console:");
		System.out.println("-----\n");
	
		while (!(msg = br.readLine()).equals("bye")) {
			c.sendMessage(msg, talkTo);
		}
	
		c.disconnect();
		System.exit(0);
	}
	
	@Override
	public void processMessage(Message message) {
		// TODO Auto-generated method stub
	
	}*/

}

class fb extends ConnectionConfiguration {

	protected fb(Builder<?, ?> builder) {
		super(builder);
	}

}