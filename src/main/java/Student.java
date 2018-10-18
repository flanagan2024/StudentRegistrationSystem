import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * @author Matt
 */
public class Student
{
	// student attributes
	private String firstName, lastName;
	private LocalDate dateOfBirth;
	private Course course;

	// student constructor
	public Student(String firstName, String lastName, LocalDate dateOfBirth)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	// accessor & mutator methods
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course = course;
	}

	/**
	 * Creates a student username consisting of the student's first initial, surname and birth year
	 *
	 * @return student's username
	 */
	public String getUsername()
	{
		String firstInitial = firstName.substring(0, 1);
		String twoDigitBirthYear = String.valueOf(dateOfBirth.getYear()).substring(2, 4);
		String username = firstInitial + lastName + twoDigitBirthYear;
		return username.toLowerCase();
	}

	/**
	 * Calculates a student's age from their date of birth
	 *
	 * @return student's age in years
	 */
	public int getAge()
	{
		String age = Years.yearsBetween(dateOfBirth, LocalDate.now()).toString();
		age = age.replaceAll("\\D+","");    // regex to remove all non-numeric characters
		return Integer.valueOf(age);
	}

	/**
	 * Generates a student's ID number using the last two digits
	 * of their birth year, followed by six random digits
	 *
	 * @return student's ID number
	 */
	public String generateID()
	{
		String id = Integer.toString(getDateOfBirth().getYear()).substring(2, 4);

		int randomDigit;
		for(int i = 0; i < 6; i++)
		{
			randomDigit = (int) (Math.random() * 10);
			id += randomDigit;
		}
		return id;
	}

	@Override
	public String toString()
	{
		return "Name:\t" + getFirstName() + " " + getLastName() + "\nAge:\t" + getAge()
				+ "\nDate of Birth:\t" + getDateOfBirth() + "\nStudent ID:\t" + generateID() +
				"\nUsername:\t" + getUsername() + "\n";
	}
}