package DevTSK.Exception;

public class UnexceptableContentException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UnexceptableContentException() {
		super("Unexceptable content");
	}
	
	public UnexceptableContentException(String m) {
		super(m);
	}
}
