package rs.ac.ni.pmf.oop2.geometry.interface_demos;

import lombok.Data;

@Data
public class Circle implements Moveable, Scaleable
{
	private Point center;
	private double radius;

	@Override
	public void move(final double x, final double y)
	{
		this.center.move(x, y);
	}

	@Override
	public void scale(final double factor)
	{
		if (factor > 0)
		{
			this.radius *= factor;
		}
	}
}
