package rs.ac.ni.pmf.oop2.geometry.figures;

public class Circle
{
	Double radius;

	public Circle()
	{
		radius = 1.0;
	}

	public Circle(double r) throws CircleRadiusException
	{
		if (r <= 0)
		{
			throw new CircleRadiusException("Invalid radius");
		}
		radius = r;
	}

	public Double getRadius()
	{
		return radius;
	}

	public void setRadius(final Double radius)
	{
		this.radius = radius;
	}
}
