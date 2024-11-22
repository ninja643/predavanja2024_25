package rs.ac.ni.pmf.oop2.geometry.interface_demos.functional;

public class Calculator
{
	public static int calculate(int a, int b, Operation operation)
	{
		return operation.compute(a, b);
	}

	public static void main(String[] args)
	{
		System.out.println(Calculator.calculate(5, 3, Integer::sum));

		int multiplicationResult = Calculator.calculate(10, 5, (a, b) -> a * b);
		System.out.println(multiplicationResult);

		System.out.println(Calculator.calculate(2, 4, ((a, b) -> 3 * a + 2 * b)));
	}
}
