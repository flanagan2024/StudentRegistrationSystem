import org.junit.Test;
import org.joda.time.LocalDate;
import static org.junit.Assert.*;

/**
 * @author Matt
 */
public class StudentTest
{
	// test data
	Student sut = new Student("Matt", "Flanagan", new LocalDate(1993, 9, 9));

	@Test
	public void get_username_test()
	{
		assertEquals("mflanagan25", sut.getUsername());
	}

	@Test
	public void get_age_test()
	{
		assertNotNull(sut);
		assertEquals(25, sut.getAge());
	}
}