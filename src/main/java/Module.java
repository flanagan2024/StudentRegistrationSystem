import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Matt
 */
public class Module
{
	// module attributes
	private String moduleName, moduleCode;
	private ArrayList<Student> students = new ArrayList<>();    // registered students
	private HashSet<Course> courses = new HashSet<>();          // associated courses

	// module constructor
	public Module(String moduleName, String moduleCode)
	{
		this.moduleName = moduleName;
		this.moduleCode = moduleCode;
	}

	// accessor & mutator methods
	public String getModuleName()
	{
		return moduleName;
	}
	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}
	public String getModuleCode()
	{
		return moduleCode;
	}
	public void setModuleCode(String moduleCode)
	{
		this.moduleCode = moduleCode;
	}
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	public HashSet<Course> getCourses()
	{
		return courses;
	}

	// add & remove methods for registered students & associated courses
	public void addStudent(Student student)
	{
		students.add(student);
	}
	public void removeStudent(Student student)
	{
		students.remove(student);
	}
	public void addCourse(Course course) { courses.add(course); }
	public void removeCourse(Course course)
	{
		courses.remove(course);
	}


	@Override
	public String toString()
	{
		return "\t" + getModuleCode() + ": " + getModuleName();
	}
}
