package rs.ac.ni.pmf.oop2.geometry.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest
{

	@Test
	void area()
	{
		Rectangle rectangle = new Rectangle(10, 8);
		assertEquals(80, rectangle.area());
	}

	@Test
	void perimeter()
	{
		Rectangle rectangle = new Rectangle(10, 8);
		assertEquals(36, rectangle.perimeter());
	}
}
