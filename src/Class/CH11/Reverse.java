package Class.CH11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Reverse {

	private static byte[] by;

	public static void main(String[] args) {
		if (args.length < 1 || args.length > 2) {
			System.err.println("Usage : java Reverse [filename]");
			System.exit(1);
		}

		File f = new File(args[0]);
		if (!f.exists()) {
			System.err.println("The file '" + args[0] + "' was not found!");
			System.exit(2);
		}

		try {
			flip(f);
			FileOutputStream br = new FileOutputStream(f);
			f.delete();
			br.write(by);
			br.close();
		} catch (Exception e) {
			System.out.println("Whoa! Something went wrong!\n\nThe Details are as follows :\n\n");
			e.printStackTrace();
		}
	}

	private static void flip(File f) throws Exception {
		FileInputStream br = new FileInputStream(f);

		by = new byte[(int) br.available()];
		byte[] byfin = new byte[by.length];
		System.out.println(by.length + " bytes to reverse!");
		br.read(by);
		br.close();

		int i = by.length - 1;
		int ii = 0;
		while (i >= 0) {
			byfin[i] = by[ii];
			System.out.println(i + ":|:" + ii + ":|-|:" + ii + " of " + (by.length - 1));
			i--;
			ii++;
		}
		by = byfin;
	}
}
