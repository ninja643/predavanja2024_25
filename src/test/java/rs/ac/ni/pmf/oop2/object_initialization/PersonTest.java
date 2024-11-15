package rs.ac.ni.pmf.oop2.object_initialization;

import org.junit.jupiter.api.Test;

class PersonTest
{
	@Test
	public void shouldCreatePersonObject()
	{
		final Person person = Person.builder()
				.id("1")
				.firstName("Petar")
				.lastName("Petrovic")
				.email("petar@mail.com")
				.gender("M")
				.dateOfBirth(null)
				.build();

		final Person person4 = Person.builder()
				.firstName("Petar")
				.lastName("Petrovic")
				.gender("M")
				.build();

		final PersonLombok personLombok = PersonLombok
				.builder()
				.id("1")
				.firstName("Petar")
				.lastName("Petrovic")
				.email("petar@mail.com")
				.gender("M")
				.build();

		System.out.println(personLombok);
	}
}
