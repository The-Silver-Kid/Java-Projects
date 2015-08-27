package DAG.Config;

// Configuration file exception class
// A.Greensted
// http://www.labbookpages.co.uk
// Version 1.0

public class ConfigException extends Exception
{
	private static final long serialVersionUID = 1L;

	public ConfigException(Throwable t)
	{
		super(t);
	}

	public ConfigException(String msg)
	{
		super(msg);
	}
}
