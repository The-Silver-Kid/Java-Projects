package DevTSK.Util;

import DevTSK.Exception.UnexceptableContentException;

public class BaseConv {
	
	private final String table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=/?<>,.;:|{}[]`~abcdefghijklmnopqrstuvwxyz";

	public BaseConv() {
	}
	
	public String from10(long in, int base) throws UnexceptableContentException{
		if (base > table.length())
			throw new UnexceptableContentException("Base is too large");
		if (base < 2)
			throw new UnexceptableContentException("Base is too small");
		String out = "";
		while(in > 0){
			out = table.substring((int) in % base, (int) (in % base)+1) + out;
			in = (int) in / base;
		}
		return out;
	}

	public long to10(String in, int base) throws UnexceptableContentException {
		if (base > table.length())
			throw new UnexceptableContentException("Base is too large");
		if (base < 2)
			throw new UnexceptableContentException("Base is too small");
		long out = 0;
		for (int i = 0; i < in.length(); i++)
			out = (long) (out + (table.indexOf(in.substring(i, i+1)) * Math.pow(base, in.length()-i-1)));
		return out;
	}
}
