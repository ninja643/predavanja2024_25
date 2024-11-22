package rs.ac.ni.pmf.oop2.object_initialization;

import org.junit.jupiter.api.Test;

public class RecordClassTest
{
	@Test
	void shouldTestStudentRecord()
	{
		final StudentRecord studentRecord = new StudentRecord("1", "John", "Doe");
		final PersonLombok person = PersonLombok.builder()
												.id("2")
												.firstName("Jane")
												.lastName("Doe")
												.build();

		System.out.println(studentRecord);
		System.out.println(person);
	}
}
