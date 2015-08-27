package DevTSK.Exception;

public class LengthException extends Exception {
	private static final long serialVersionUID = -3906793049321488388L;

	public LengthException() {
		super("Something ether is too long or short, or dosent match something else.");
	}
	
	public LengthException(String arg0) {
		super(arg0);
	}
}
