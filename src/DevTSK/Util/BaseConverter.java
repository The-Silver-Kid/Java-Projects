package DevTSK.Util;

public class BaseConverter {

	private final String table;
	public final int MAX_BASE;

	public BaseConverter(String table) {
		this.table = table;
		this.MAX_BASE = table.length();
	}

	public String from10(long in, int base) {
		if (base > MAX_BASE)
			return "";
		if (base < 2)
			return "";
		String out = "";
		while (in > 0) {
			out = table.substring((int) in % base, (int) (in % base) + 1) + out;
			in = (int) in / base;
		}
		return out;
	}

	public long to10(String in, int base) {
		if (base > MAX_BASE)
			return -1;
		if (base < 2)
			return -1;
		long out = 0;
		for (int i = 0; i < in.length(); i++)
			out = (long) (out + (table.indexOf(in.substring(i, i + 1)) * Math.pow(base, in.length() - i - 1)));
		return out;
	}
}
