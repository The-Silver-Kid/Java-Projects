package DevTSK.Exception;

public class TooTiredException extends Exception {
	private static final long serialVersionUID = 2L;
	
	public TooTiredException() {
		super("I am far too tired to do this...");
	}
	
	public TooTiredException(String m) {
		super(m);
	}
}
