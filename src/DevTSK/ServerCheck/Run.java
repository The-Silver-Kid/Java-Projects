package DevTSK.ServerCheck;

import java.util.Arrays;
import java.util.Collection;
import com.google.gson.Gson;
import rmmccann.query.MCQuery;

public class Run {

	static MCQuery mq;

	private static BGCheck chk = new BGCheck("MinecraftServerSpy");
	private static int playerCount = 0;
	private static Collection<String> playerlist;

	public static void main(String[] args) throws Exception {

		mq = new MCQuery(new byte[] { 24, 2, 102, 84 });

		System.out.println("Attempting Connection to : " + mq.getAdd()[0] + "." + mq.getAdd()[1] + "." + mq.getAdd()[2] + "." + mq.getAdd()[3]);

		ServerProporties s = deserializeJSON(mq.fullStat().asJSON());
		System.out.println("Recieved responce from server : \n" + mq.fullStat().asJSON());
		playerlist = Arrays.asList(s.getPlayers());
		playerCount = s.getOnlinePlayers();

		chk.start();
	}

	static ServerProporties deserializeJSON(String in) throws Exception {
		ServerProporties ret;
		Gson g = new Gson();
		ret = g.fromJson(in, ServerProporties.class);
		return ret;
	}

	public static int getPlayerCount() {
		return playerCount;
	}

	public static void setPlayerCount(int pc) {
		playerCount = pc;
	}

	public static Collection<String> getPlayerList() {
		return playerlist;
	}

	public static void setPlayerList(Collection<String> s) {
		playerlist = s;
	}
}
