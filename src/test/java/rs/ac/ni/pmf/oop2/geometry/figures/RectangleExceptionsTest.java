package rs.ac.ni.pmf.oop2.geometry.figures;

import org.junit.jupiter.api.Test;

public class RectangleExceptionsTest
{
	@Test
	void shouldHandleRectangleExceptions()
	{
		try
		{
			final Rectangle r1 = new Rectangle(1, 2);
			System.out.println(r1);

			final Rectangle r2 = new Rectangle(-5, 3);
			System.out.println(r2);
		}
		catch (IllegalArgumentException | NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch (RectangleDimensionsException e)
		{
			System.out.println(e.getMessage());
			if (e.getWidth() < 0)
			{
				System.out.println("Width is invalid!");
			}
			if (e.getHeight() < 0)
			{
				System.out.println("Height is invalid!");
			}
		}
		catch (Exception e)
		{
			System.out.println("There is an error : " + e.getMessage());
		}
	}
}
