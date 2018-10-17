import java.time.LocalDate;
import java.util.List;

/**
 * @author Matthew
 */
public class Student
{
	// student attributes
	private String firstName, lastName, username, id;
	private LocalDate dateOfBirth;
	private Course course;

	// student constructor
	public Student(String firstName, String lastName, LocalDate dateOfBirth, Course course)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.course = course;
	}

	@Override
	public String toString()
	{
		return "Name:\t" + getFirstName() + " " + getLastName() + "\nAge:\t" + getAge()
				+ "\nDate of Birth:\t" + getDateOfBirth() + "\nStudent ID:\t" + getId()
				+ "\nUsername:\t" + getUsername() + "\n";
	}

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

	/**
	 * Creates a student username consisting of the student's first initial, surname and birth year
	 * @return username
	 */
	public String getUsername()
	{
		String firstInitial = firstName.substring(0,1);
		String twoDigitBirthYear = String.valueOf(dateOfBirth.getYear()).substring(2, 4);
		username = firstInitial + lastName + twoDigitBirthYear;
		return username.toLowerCase();
	}

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 *
	 * @return
	 */
	public int getAge()
	{
		return LocalDate.now().getYear() - dateOfBirth.getYear();
	}

	public String getId()
	{
		int yearStarted = this.getCourse().getStartDate().getYear();
		String dob = String.valueOf(getDateOfBirth().getDayOfMonth()) + String.valueOf(getDateOfBirth().getMonthValue()) + String.valueOf(getDateOfBirth().getYear());
		id = Integer.toString(yearStarted).substring(2, 4) + dob;
		return id;
	}

	public Course getCourse()
	{
		return course;
	}

	public void setCourse(Course course)
	{
		this.course = course;
	}
}