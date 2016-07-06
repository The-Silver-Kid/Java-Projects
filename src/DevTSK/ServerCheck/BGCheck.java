package DevTSK.ServerCheck;

import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.collections4.CollectionUtils;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryJavaSound;
import rmmccann.query.MCQuery;

class BGCheck implements Runnable {
	private Thread t;
	private String threadName;
	private MCQuery mq;
	private ServerProporties sp;
	private SoundSystem ss;

	BGCheck(String name) {
		threadName = name;
	}

	public void run() {
		mq = Run.mq;
		try {
			SoundSystemConfig.addLibrary(LibraryJavaSound.class);
			SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
		} catch (Exception e) {
			System.err.println("ERROR LINKING WITHPLUGINS!");
			e.printStackTrace();
			System.exit(1);
		}
		ss = new SoundSystem();
		while (true) {
			//TODO
			try {
				sp = Run.deserializeJSON(mq.fullStat().asJSON());
				int i = sp.getOnlinePlayers();
				String name = "";
				ss.stop("BGM.ogg");
				if (i > Run.getPlayerCount()) {
					Collection<String> c = Arrays.asList(sp.getPlayers());
					c = CollectionUtils.removeAll(c, Run.getPlayerList());
					Run.setPlayerList(Arrays.asList(sp.getPlayers()));
					String[] names = c.toArray(new String[] {});
					name = names[0];
					System.out.println(name + " joined the game.");
					if (name.equalsIgnoreCase("ConnerSnikle"))
						play("ConnerJoin");
					else
						play("Join");
				}
				if (i < Run.getPlayerCount()) {
					Collection<String> c = Arrays.asList(sp.getPlayers());
					c = CollectionUtils.removeAll(Run.getPlayerList(), c);
					Run.setPlayerList(Arrays.asList(sp.getPlayers()));
					String[] names = c.toArray(new String[] {});
					name = names[0];
					System.out.println(name + " left the game.");
					if (name.equalsIgnoreCase("ConnerSnikle"))
						play("ConnerLeft");
					else
						play("Left");
				}
				if (i != Run.getPlayerCount()) {
					//System.out.println(i + " differed from " + Run.getPlayerCount() + "\nActions Completed.");
					Run.setPlayerCount(i);
				}
				System.out.println("Sleeping for 30 sec");
				Thread.sleep(30000);
			} catch (Exception e) {
				e.printStackTrace();
				try {
					System.out.println("Sleeping for 5 mins");
					Thread.sleep(300000);
				} catch (InterruptedException e1) {
					System.err.println("OH NO!\nSomething went horably wrong!");
					e1.printStackTrace();
					t.interrupt();
					System.exit(1);
				}
			}
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	private void play(String s) {
		ss.backgroundMusic("BGM.ogg", BGCheck.class.getResource("/Sounds/" + s + ".ogg"), s + ".ogg", false);
	}
}