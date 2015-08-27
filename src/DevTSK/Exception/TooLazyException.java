package DevTSK.Exception;

public class TooLazyException extends Exception {
	private static final long serialVersionUID = 2L;
	
	public TooLazyException() {
		super("I am far too lazy to do this...");
	}
	
	public TooLazyException(String m) {
		super(m);
	}
}
