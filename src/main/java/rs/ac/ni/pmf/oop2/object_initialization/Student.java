package rs.ac.ni.pmf.oop2.object_initialization;

import lombok.Value;

@Value
public class Student
{
	String id;
	String firstName;
	String lastName;

	public Student(String idPrefix, String id, String firstName, String lastName)
	{
		this.id = idPrefix + '_' + id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
