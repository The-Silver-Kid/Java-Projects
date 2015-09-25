package development;

import DevTSK.Util.*;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		BaseConv b = new BaseConv();
		System.out.println(b.from10(50200, 16));
		System.err.println(b.to10("C418", 16));
	}

}
