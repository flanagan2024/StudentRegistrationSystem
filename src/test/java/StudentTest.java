import org.junit.Test;
import org.joda.time.LocalDate;
import static org.junit.Assert.*;

/**
 * @author Matt
 */
public class StudentTest
{
	// computer science
	LocalDate startDate = new LocalDate(2012, 9, 9);
	LocalDate endDate = new LocalDate(2016, 5, 20);
	Course csit = new Course("Computer Science & IT", startDate, endDate);
	LocalDate dateOfBirth = new LocalDate(1993, 10, 18);
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