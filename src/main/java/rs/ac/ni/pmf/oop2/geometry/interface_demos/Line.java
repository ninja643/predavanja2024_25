package rs.ac.ni.pmf.oop2.geometry.interface_demos;

import lombok.Data;

@Data
public class Line implements Moveable, Printable
{
	private Point a;
	private Point b;

	@Override
	public void move(final double x, final double y)
	{
		a.move(x, y);
		b.move(x, y);
	}

	@Override
	public String print()
	{
		return "";
	}
}
