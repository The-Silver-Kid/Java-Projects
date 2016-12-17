package DevTSK.Util;

public class Logger {

	private String[] icns;

	public Logger(String[] icns) {
		this.icns = icns;
	}

	public void log(String s) {
		System.out.println(icns[0] + " " + s);
	}

	public void log(int i, String s) {
		System.out.println(icns[i] + " " + s);
	}
}
