package DevTSK.Neurox;

import DevTSK.Util.devCSV;

public class NeuroxRead {
	
	private static final devCSV dcsv = new devCSV();
	
	private static final String map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\u03B8 .\u2796+-*/^(),\u00B2\u00B9e\u0274\n0143uvw{}[]\u0113\u03C0nxyabcderpzt\u0492\u03D0s=\u003D>\u2265<\u2264:'!?";
	
	public String GetPage(Boolean encrypted, int i, String in) {
		String s = "";
		long[] lst = dcsv.readCsvFile(in);
		if (!encrypted)
			if (i > lst[0])
				s = "Requested page out of range!";
		if (encrypted)
			if (i > lst[1])
				s = "Requested page out of range!";
		if (!s.equalsIgnoreCase("Requested page out of range!")){
			
		}
		return s;
	}
	
}
