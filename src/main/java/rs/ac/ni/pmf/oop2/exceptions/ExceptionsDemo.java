package rs.ac.ni.pmf.oop2.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo
{
	public static void main(String[] args)
	{
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");

		try
		{
			final int number = scanner.nextInt();
			System.out.println("You've entered number: " + number);
		}
		catch (final InputMismatchException e)
		{
			System.out.println("Exception caught:");
			e.printStackTrace();
		}
		scanner.close();

		int sum = 0;
		for (int i = 0; i < 10000000; i++) {
			sum = (sum + i) % 32462711;
		}

		System.out.println(sum);
		System.out.println("Program finished");
	}
}
