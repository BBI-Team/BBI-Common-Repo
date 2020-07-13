public class CourseController
{
	private Course model;
	private CourseView view;
	
	public CourseController(Course model, CourseView view)
	{
		this.model=model;
		this.view=view;
	}
	
	public void setCourseName(String name)
	{
		model.setName(name);
	}
	public String getCousreName()
	{
		return model.getName();
	}
	
	public void setCourseID(String id)
	{
		model.setID(id);
	}
	public String getCousreID()
	{
		return model.getID();
	}
	
	public void setCourseCategory(String category)
	{
		model.setCategory(category);
	}
	public String getCousreCategory()
	{
		return model.getCategory();
	}
	
	public void updateView()
	{
		view.printCourseDetails(model.getName(), model.getID(), model.getCategory());
	}
}
