package DevTSK.Exception;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = -7078899438471888630L;
	
	public NotFoundException() {
		super("Something wasn't found");
	}
	
	public NotFoundException(String arg0) {
		super(arg0);
	}
}
