package rs.ac.ni.pmf.oop2.geometry.figures;

public class Rectangle
{
	private static int instanceCount = 0;

	private double width;
	private double height;

	public Rectangle(final double width, final double height)
	{
		this.width = width;
		this.height = height;
		instanceCount++;
	}

	public double area()
	{
		return width * height;
	}

	public double perimeter()
	{
		return 2 * (width + height);
	}
}
