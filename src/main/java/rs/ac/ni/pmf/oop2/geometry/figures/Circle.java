package rs.ac.ni.pmf.oop2.geometry.figures;

public class Circle
{
	Double radius;

	public Circle()
	{
		radius = 1.0;
	}

	public Circle(double r)
	{
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

	public static void main(String[] args)
	{
		Circle circle = new Circle(3);
		System.out.println(circle.getRadius());
	}
}
