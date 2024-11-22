package rs.ac.ni.pmf.oop2.object_initialization;

import lombok.Value;

@Value
public class Faculty
{
	String name;
	String idPrefix;

	@Value
	public class Student
	{
		String id;
		String name;
		String lastName;

		public Student(String id, String firstName, String lastName)
		{
			this.id = idPrefix + '_' + id;
			this.name = firstName;
			this.lastName = lastName;
		}

		public void printDetails()
		{
			@Value
			class Test {
				int value;

				public int doubleValue()
				{
					return value * 2;
				}
			}

			Test t1 = new Test(10);
			Test t2 = new Test(4);
			System.out.println(t1.doubleValue() + t2.doubleValue());
			System.out.println("Student: " + this.name + " " + this.lastName + ", Faculty: " + Faculty.this.name);
		}
	}

	@Value
	public static class Professor {
		String id;
		String name;
	}
}
