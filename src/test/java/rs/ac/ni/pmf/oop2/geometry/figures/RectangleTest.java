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

	@Test
	void testInstanceCount()
	{
		Rectangle rectangle1 = new Rectangle(10, 8);
		assertEquals(1, rectangle1.getId());
		System.out.println("Instance count on rectangle 1: "
								   + Rectangle.getInstanceCount());

		Rectangle rectangle2 = new Rectangle(100, 80);
		assertEquals(2, rectangle2.getId());
		System.out.println("Instance count on rectangle 2: "
								   + Rectangle.getInstanceCount());
	}
}
