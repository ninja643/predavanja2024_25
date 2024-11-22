package rs.ac.ni.pmf.oop2.geometry.interface_demos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Point implements Moveable, Printable, Serializable
{
	private double x;
	private double y;

	@Override
	public void move(final double x, final double y)
	{
		this.x += x;
		this.y += y;
	}

	@Override
	public String print()
	{
		return "[" + x + ", " + y + "]";
	}
}
