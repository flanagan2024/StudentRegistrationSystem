import java.util.ArrayList;

/**
 * @author Matt
 */
public class Module
{
	// module attributes
	private String moduleName, moduleCode;
	private ArrayList<Student> students;    // registered students
	private ArrayList<Course> courses;      // associated courses

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
	public ArrayList<Course> getCourses()
	{
		return courses;
	}

	// add & remove methods for students
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
		return getModuleCode() + ": " + getModuleName();
	}
}
