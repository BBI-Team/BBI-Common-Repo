public class Course
{
	private String CourseName;
	private String CourseID;
	private String CourseCategory;
	
	public String getID()
	{
		return CourseID;
	}
	public void setID(String id)
	{
		this.CourseID=id;
	}
	
	public String getName()
	{
		return CourseName;
	}
	public void setName(String name)
	{
		this.CourseName=name;
	}
	
	public String getCategory()
	{
		return CourseCategory;
	}
	public void setCategory(String category)
	{
		this.CourseCategory=category;
	}
}
