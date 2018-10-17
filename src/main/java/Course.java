import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course
{
	private String courseName, courseCode;
	private int courseLength;   // in years
	private ArrayList<Module> modules;
	private ArrayList<Student> enrolledStudents;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String courseName, String courseCode, int courseLength, ArrayList<Module> modules, DateTime startDate, DateTime endDate)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseLength = courseLength;
		this.modules = modules;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Course(String courseName, String courseCode, int courseLength, DateTime startDate, DateTime endDate)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseLength = courseLength;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String toString()
	{
		return "Course:\t" + getCourseName() + "\nCode:\t" + getCourseCode() + "\nStart Date:\t" + getStartDate()
				+ "\nEnd Date:\t" + getEndDate() + "\nDuration:\t" +

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

	public ArrayList<Module> getModules()
	{
		return modules;
	}

	public void setModules(ArrayList<Module> modules)
	{
		this.modules = modules;
	}

	public ArrayList<Student> getEnrolledStudents()
	{
		return enrolledStudents;
	}

	public void setEnrolledStudents(ArrayList<Student> enrolledStudents)
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
