package rs.ac.ni.pmf.oop2.geometry.figures;

public class Rectangle
{
	private static int instanceCount = 0;

	private double width;
	private double height;
	private final int id;

	public Rectangle(final double width, final double height)
	{
		this.width = width;
		this.height = height;
		instanceCount++;
		this.id = instanceCount;
	}

	public double area()
	{
		return width * height;
	}

	public double perimeter()
	{
		return 2 * (width + height);
	}

	public static int getInstanceCount()
	{
		return instanceCount;
	}

	public int getId()
	{
		return id;
	}

	public void scale(int x, int y)
	{
		scale(x, (double) y);
	}

	public void scale(double x, double y)
	{
		this.width *= x;
		this.height *= y;
	}

	public void scale(int coefficient)
	{
		scale(coefficient, coefficient);
	}

	public void scale(double coefficient)
	{
		scale(coefficient, coefficient);
	}
}
