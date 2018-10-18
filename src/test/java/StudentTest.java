import org.junit.Test;

import java.time.LocalDate;

import org.joda.time.DateTime;

import static org.junit.Assert.*;

/**
 * @author Matt
 */
public class StudentTest
{
	// computer science
	DateTime startDate = new DateTime(2012, 9, 9, 9, 0);
	DateTime endDate = new DateTime(2016, 5, 20, 18, 0);
	Course csit = new Course("Computer Science & Information Technology", startDate, endDate);
	LocalDate dateOfBirth = LocalDate.of(1993, 10, 18);
	Student sut = new Student("Matt", "Flanagan", dateOfBirth, csit);

	@Test
	public void get_username_test()
	{
		assertEquals("mflanagan93", sut.getUsername());
	}

	@Test
	public void get_age_test()
	{
		assertNotNull(sut);
		assertEquals(25, sut.getAge());
	}
}