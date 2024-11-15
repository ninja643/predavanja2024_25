package rs.ac.ni.pmf.oop2.object_initialization;

import lombok.*;

import java.time.LocalDate;

@Value
@Builder
public class PersonLombok
{
	String id;
	String firstName;
	String lastName;
	String email;
	String gender;

	@Builder.Default
	LocalDate dateOfBirth = LocalDate.now();
}
