package rs.ac.ni.pmf.oop2;

public class TypesDemo
{
	public static double compute(Integer a, Integer b, Double c)
	{
		return (a + b) * c;
	}

	public static void main(String[] args)
	{
		int[] array = {
				100, 200, 300,
				400, 500, 600,
				700, 800, 900, 1000};

		System.out.println(array[0]);
		array[0] = 2 * array[0];
		System.out.println(array[0]);
		System.out.println(array.length);

		int[] otherArray = new int[11];
		System.arraycopy(array, 0, otherArray, 0, array.length);

		otherArray[10] = 500;
		System.out.println(otherArray[10]);

		int x = 1;
		int y = x++ + ++x;
		System.out.println(y);
	}
}
