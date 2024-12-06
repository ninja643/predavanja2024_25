package rs.ac.ni.pmf.oop2.geometry.figures;

import lombok.Getter;

@Getter
public class RectangleDimensionsException extends Exception
{
	private final double width;
	private final double height;

	public RectangleDimensionsException(double width, double height, String message)
	{
		super(message);
		this.width = width;
		this.height = height;
	}
}
