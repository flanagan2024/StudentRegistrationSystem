import org.joda.time.DateTime;

import java.util.List;

public class Course
{
	private String courseName, courseCode;
	private List<Module> modules;
	private List<Student> enrolledStudents;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String courseName, String courseCode, List<Module> modules, List<Student> enrolledStudents, DateTime startDate, DateTime endDate)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.modules = modules;
		this.enrolledStudents = enrolledStudents;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public String getCourseCode()
	{
		return courseCode;
	}

	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public List<Module> getModules()
	{
		return modules;
	}

	public void setModules(List<Module> modules)
	{
		this.modules = modules;
	}

	public List<Student> getEnrolledStudents()
	{
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<Student> enrolledStudents)
	{
		this.enrolledStudents = enrolledStudents;
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
}
