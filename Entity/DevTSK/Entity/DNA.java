package DevTSK.Entity;

public class DNA {

	private String full;

	public DNA(String s) {
		if (s.length() != 78)
			try {
				throw new Exception("Invalad DNA");
			} catch (Exception e) {
				e.printStackTrace();
			}
		else
			full = s;
	}

	public String getDNA() {
		return full;
	}
}
