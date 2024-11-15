package rs.ac.ni.pmf.oop2.object_initialization;

import java.time.LocalDate;
import java.util.Objects;

public class Person
{
	private final String id;
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String gender;
	private final LocalDate dateOfBirth;

	private Person(
			final String id,
			final String lastName,
			final String firstName,
			final String email,
			final String gender,
			final LocalDate dateOfBirth)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String getId()
	{
		return id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public String getGender()
	{
		return gender;
	}

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	@Override
	public String toString()
	{
		return "Person{" +
				"id='" + id + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", gender='" + gender + '\'' +
				", dateOfBirth='" + dateOfBirth + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		final Person person = (Person) o;
		return Objects.equals(id, person.id)
				&& Objects.equals(firstName, person.firstName)
				&& Objects.equals(lastName, person.lastName)
				&& Objects.equals(email, person.email)
				&& Objects.equals(gender, person.gender)
				&& Objects.equals(dateOfBirth, person.dateOfBirth);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, firstName, lastName, email, gender, dateOfBirth);
	}

	public static PersonBuilder builder()
	{
		return new PersonBuilder();
	}

	public static class PersonBuilder
	{
		private String id;
		private String firstName;
		private String lastName;
		private String email;
		private String gender;
		private LocalDate dateOfBirth = LocalDate.now();

		public PersonBuilder id(String id)
		{
			this.id = id;
			return this;
		}

		public PersonBuilder firstName(String firstName)
		{
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder lastName(String lastName)
		{
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder email(String email)
		{
			this.email = email;
			return this;
		}

		public PersonBuilder gender(String gender)
		{
			this.gender = gender;
			return this;
		}

		public PersonBuilder dateOfBirth(LocalDate dateOfBirth)
		{
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Person build()
		{
			return new Person(id, lastName, firstName, email, gender, dateOfBirth);
		}
	}
}
