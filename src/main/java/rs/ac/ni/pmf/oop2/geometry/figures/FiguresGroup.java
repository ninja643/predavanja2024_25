package rs.ac.ni.pmf.oop2.geometry.figures;

public class FiguresGroup
{
	public void createGroup() throws FigureCreationException
	{
		try
		{
			final Circle c = new Circle(10.0);
			final Rectangle r = new Rectangle(-5.0, 5);
		}
		catch (CircleRadiusException | RectangleDimensionsException e)
		{
			throw new FigureCreationException("Error creating figure", e);
		}
	}
}
