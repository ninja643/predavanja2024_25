package rs.ac.ni.pmf.oop2.geometry.figures;

import lombok.Data;
import lombok.Value;

@Data
public class Rectangle
{
	private static int instanceCount = 0;

	private double width;
	private double height;
	private final int id;

	public Rectangle(final double width, final double height)
			throws RectangleDimensionsException
	{
		if (width <= 0 || height <= 0)
		{
			final String message = "Rectangle dimensions [width: " + width
					+ ", height: " + height + " ] are not valid";

//			throw new IllegalArgumentException(message);
			throw new RectangleDimensionsException(width, height, message);
		}

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
