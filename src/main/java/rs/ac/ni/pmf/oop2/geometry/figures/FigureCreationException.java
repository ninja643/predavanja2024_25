package rs.ac.ni.pmf.oop2.geometry.figures;

public class FigureCreationException extends Exception
{
	public FigureCreationException(final String message)
	{
		super(message);
	}

	public FigureCreationException(final String message, final Throwable cause)
	{
		super(message, cause);
	}
}
