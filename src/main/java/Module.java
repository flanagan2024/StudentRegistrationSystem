import java.util.ArrayList;

public class Module
{
	private String moduleName, moduleCode;
	private ArrayList<Student> registeredStudents;
	private ArrayList<Course> associatedCourses;

	public Module(String moduleName, String moduleCode)
	{
		this.moduleName = moduleName;
		this.moduleCode = moduleCode;
	}

	@Override
	public String toString()
	{
		return getModuleCode() + ": " + getModuleName();
	}

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

	public ArrayList<Student> getRegisteredStudents()
	{
		return registeredStudents;
	}

	public void setRegisteredStudents(ArrayList<Student> registeredStudents)
	{
		this.registeredStudents = registeredStudents;
	}

	public ArrayList<Course> getAssociatedCourses()
	{
		return associatedCourses;
	}

	public void setAssociatedCourses(ArrayList<Course> associatedCourses)
	{
		this.associatedCourses = associatedCourses;
	}
}
