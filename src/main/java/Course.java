import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 * @author Matt
 */
public class Course
{
	// course attributes
	private String courseName;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;    // enrolled students
	private DateTime startDate, endDate;    // academic start & end dates

	// course constructor
	public Course(String courseName, DateTime startDate, DateTime endDate)
	{
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	// accessor & mutator methods
	public String getCourseName()
	{
		return courseName;
	}
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public ArrayList<Module> getModules()
	{
		return modules;
	}
	public void setModules(ArrayList<Module> modules)
	{
		this.modules = modules;
	}
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	public void setStudents(ArrayList<Student> students)
	{
		this.students = students;
	}
	public DateTime getStartDate()
	{
		return startDate;
	}
	public void setStartDate(DateTime startDate)
	{
		this.startDate = startDate;
	}
	public DateTime getEndDate()
	{
		return endDate;
	}
	public void setEndDate(DateTime endDate)
	{
		this.endDate = endDate;
	}

	// add & remove methods for modules & students
	public void addModule(Module module)
	{
		modules.add(module);
	}
	public void removeModule(Module module)
	{
		modules.remove(module);
	}
	public void addStudent(Student student)
	{
		students.add(student);
	}
	public void removeStudent(Student student)
	{
		students.remove(student);
	}

	@Override
	public String toString()
	{
		return "Course:\t" + getCourseName() + "\nStart Date:\t" + getStartDate()
				+ "\nEnd Date:\t" + getEndDate() + "\nModules:\t" + modules.toString();
	}
}
