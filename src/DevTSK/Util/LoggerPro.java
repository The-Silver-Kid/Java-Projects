package DevTSK.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerPro {

	private String[] icns;
	private File out = new File("null");
	private int mode = 0;
	private BufferedWriter writer;

	public static final int CONSOLE_ONLY = 0, FILE_ONLY = 1, FILE_AND_CONSOLE = 2;

	public LoggerPro(String[] icns, int mode) {
		if (mode > 2 || mode < 0)
			mode = 0;

		if (mode > 0) {
			Day d = new Day();

			out = new File("./logs/" + d.toString(false) + ".log");
			out.mkdirs();
			try {
				out.createNewFile();
				writer = new BufferedWriter(new FileWriter(out, true));
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(out.getAbsolutePath());
				System.err.println("Unable to create log file.\nDisabling...");
				mode = 0;
			}
		}

		String[] icnsd = icns;

		for (int i = 0; i < icns.length; i++)
			icnsd[i] = "[" + icns[i] + "]";

		this.icns = icnsd;
		this.mode = mode;
	}

	public void log(String s) {
		if (mode != 1)
			System.out.println(icns[0] + " " + s);

		if (mode > 0) {
			try {
				writer.write(icns[0] + " " + s);
				writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(out.getAbsolutePath());
				System.err.println("Unable to modify log file.\nDisabling...");
				mode = 0;
			}
		}
	}

	public void log(int i, String s) {
		if (mode != 1)
			System.out.println(icns[i] + " " + s);

		if (mode > 0) {
			try {
				writer.write(icns[i] + " " + s);
				writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(out.getAbsolutePath());
				System.err.println("Unable to modify log file.\nDisabling...");
				mode = 0;
			}
		}
	}

	public void killStream() {
		if (mode > 0)
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(out.getAbsolutePath());
				System.err.println("Unable to close log file writer.\nDisabling...");
				mode = 0;
			}
	}
}
