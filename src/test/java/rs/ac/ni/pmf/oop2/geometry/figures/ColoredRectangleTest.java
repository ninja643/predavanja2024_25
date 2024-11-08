package rs.ac.ni.pmf.oop2.geometry.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColoredRectangleTest
{
	@Test
	void testColoredRectangle()
	{
		ColoredRectangle rectangle = new ColoredRectangle(5, 4, "blue");
		rectangle.scale(2, 3);
		assertEquals(120.0, rectangle.area());
	}
}
