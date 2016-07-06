package DevTSK.ServerCheck;

public class ServerProporties {
	private String motd, gamemode, map, host, gameID, version;
	private String[] players;
	private int onlinePlayers, maxPlayers, port;

	public ServerProporties(String motd, String gamemode, String map, int onlinePlayers, int maxPlayers, int port, String host, String gameID, String version, String[] players) {
		this.motd = motd;
		this.gamemode = gamemode;
		this.map = map;
		this.host = host;
		this.onlinePlayers = onlinePlayers;
		this.maxPlayers = maxPlayers;
		this.port = port;
		this.gameID = gameID;
		this.version = version;
		this.players = players;
	}

	public String getMotd() {
		return motd;
	}

	public String getGamemode() {
		return gamemode;
	}

	public String getmap() {
		return map;
	}

	public String gethost() {
		return host;
	}

	public String getGameID() {
		return gameID;
	}

	public String getversion() {
		return version;
	}

	public String[] getPlayers() {
		return players;
	}

	public int getOnlinePlayers() {
		return onlinePlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public int getport() {
		return port;
	}
}
