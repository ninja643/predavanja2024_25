package rs.ac.ni.pmf.oop2.object_initialization;

import org.junit.jupiter.api.Test;

public class InnerClassesTest
{
	@Test
	public void shouldCreateStudentWithProperIdPrefix()
	{
		final Faculty pmf = new Faculty("PMF", "RN");
		final Faculty etf = new Faculty("ETF", "EL");

//		final Student pmfStudent = new Student(pmf.getIdPrefix(), "1", "John", "Doe");
//		final Student etfStudent = new Student(etf.getIdPrefix(), "2", "Jane", "Doe");

		final Faculty.Student pmfStudent = pmf.new Student("1", "John", "Doe");
		final Faculty.Student etfStudent = etf.new Student("2", "Jane", "Doe");

		pmfStudent.printDetails();
		etfStudent.printDetails();

//		System.out.println(pmfStudent);
//		System.out.println(etfStudent);
//
//		final Faculty.Professor professor = new Faculty.Professor("10", "Marko");
//		System.out.println(professor);
	}
}
