package development;

import DevTSK.Util.NumGenerator;

public class TestingEnv {

	public static void main(String[] args) {

		NumGenerator ng = new NumGenerator(5, false, true);
		int[] lol = ng.genList();
		for (int i = 0; i < lol.length; i++)
			System.out.println(lol[i]);
	}

	// What was this used for?
	public static void lol(String[] args) {
		char[] ill = new char[] { '?' };
		Boolean check = false;
		String ept = "";
		String ops = "fu?rpus";
		do {
			check = false;
			ept = ops;
			char[] o = ops.toCharArray();
			for (int i = 0; i < o.length; i++) {
				for (int e = 0; e < ill.length; e++) {
					if (o[i] == ill[e])
						check = true;
				}
			}
			if (check) {
				for (int i = 0; i < o.length; i++) {
					for (int b = 0; b < ill.length; b++)
						if (ops.charAt(i) == ill[b]) {
							System.out.println("LE GASP!\n" + ops.charAt(i) + " DETECTED!");
							System.out.println(ops.length() + ":" + i);
							if (i != 0 && i != ops.length() - 1) {
								System.out.println("MIDDLE");
								String dops = ops.substring(0, i) + " " + ops.substring(i + 1, ops.length());
								ops = dops;
							} else if (i == 0) {
								System.out.println("BEGIN");
								ops = " " + ops.substring(1);
							} else if (i == ops.length() - 1) {
								System.out.println("END");
								ops = ops.substring(0, ops.length() - 1) + " ";
							} else {
								System.err.println("SOMETHiGN WENT HORABLY WRONG (other then my spelling...)");
							}
							System.out.println(ops.length() + ":" + i);
						}
				}
				System.out.println("Fixed invalid name " + ept + "\nTo conform with specified illegal chars : " + ops);
			}
		} while (check);
	}

}