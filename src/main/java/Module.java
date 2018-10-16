import java.util.ArrayList;
import java.util.List;

public class Module
{
	private String moduleName, moduleID;
	private List<Student> registeredStudents = new ArrayList<>();
	private List<Course> associatedCourses = new ArrayList<>();

	public Module(String moduleName, String moduleID, List<Student> registeredStudents, List<Course> associatedCourses)
	{
		this.moduleName = moduleName;
		this.moduleID = moduleID;
		this.registeredStudents = registeredStudents;
		this.associatedCourses = associatedCourses;
	}

	public String getModuleName()
	{
		return moduleName;
	}

	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}

	public String getModuleID()
	{
		return moduleID;
	}

	public void setModuleID(String moduleID)
	{
		this.moduleID = moduleID;
	}

	public List<Student> getRegisteredStudents()
	{
		return registeredStudents;
	}

	public void setRegisteredStudents(List<Student> registeredStudents)
	{
		this.registeredStudents = registeredStudents;
	}

	public List<Course> getAssociatedCourses()
	{
		return associatedCourses;
	}

	public void setAssociatedCourses(List<Course> associatedCourses)
	{
		this.associatedCourses = associatedCourses;
	}
}
