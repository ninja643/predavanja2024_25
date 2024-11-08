package rs.ac.ni.pmf.oop2.geometry.figures;

public class ColoredRectangle extends Rectangle
{
	private final String color;

	public ColoredRectangle(
			final double width,
			final double height,
			final String color)
	{
		super(width, height);
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void scale(int x, double y)
	{
		scale(30 * y);
	}
}
