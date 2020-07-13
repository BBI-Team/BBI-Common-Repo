public class MVCPattern
{
	public static void main(String args[])
	{
		Course model=retriveCouseFromDatabase();
		
		CourseView view=new CourseView();
		
		CourseController controller=new CourseController(model,view);
		controller.updateView();
		
		controller.setCourseName("Python");
		System.out.println("After updating, Curse details are as follows......");
		controller.updateView();
	}
	
	private static Course retriveCouseFromDatabase()
	{
		Course course=new Course();
		course.setName("Java");
		course.setID("01");
		course.setCategory("Programming");
		return course;
	}
}
