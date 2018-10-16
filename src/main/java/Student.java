import java.time.LocalDate;
import java.util.List;

public class Student
{
	private String firstName, lastName;
	private LocalDate dateOfBirth;
	private int id; // both auto-generated inside getter/setters TODO
	private List<Module> modules;
	private Course course;

	public Student(String firstName, String lastName, LocalDate dateOfBirth, List<Module> modules, Course course)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.modules = modules;
		this.course = course;
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

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge()
	{
		return LocalDate.now().getYear() - dateOfBirth.getYear();
	}

	public int getId()
	{
		return id;
	}

	public List<Module> getModules()
	{
		return modules;
	}

	public void setModules(List<Module> modules)
	{
		this.modules = modules;
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