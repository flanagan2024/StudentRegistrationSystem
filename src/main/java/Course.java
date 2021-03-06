import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 * @author Matt
 */
public class Course
{
	// course attributes
	private String courseName;
	private ArrayList<Module> modules = new ArrayList<>();      // course modules
	private ArrayList<Student> students = new ArrayList<>();    // enrolled students
	private LocalDate startDate, endDate;                       // academic start & end dates

	// course constructor
	public Course(String courseName, LocalDate startDate, LocalDate endDate)
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
	public LocalDate getStartDate()
	{
		return startDate;
	}
	public void setStartDate(LocalDate startDate)
	{
		this.startDate = startDate;
	}
	public LocalDate getEndDate()
	{
		return endDate;
	}
	public void setEndDate(LocalDate endDate)
	{
		this.endDate = endDate;
	}

	// add & remove methods for modules
	public void addModule(Module module)
	{
		modules.add(module);
	}
	public void removeModule(Module module)
	{
		modules.remove(module);
	}

	@Override
	public String toString()
	{
		String moduleStr = "";
		for(Module module : modules)
			moduleStr += "\t" + module.toString() + "\n";
		return "Course Name:\t" + getCourseName() + "\nStart Date:\t\t" + getStartDate()
				+ "\nEnd Date:\t\t" + getEndDate() + "\nModules:\n" + moduleStr;
	}
}
