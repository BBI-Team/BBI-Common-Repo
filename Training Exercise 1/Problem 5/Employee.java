class Employee
{ 
	String eid; 
	String name; 
	
	public String getEid() 
	{ 
		return eid;
	} 
	
	public void setEid(String eid) 
	{ 
		this.eid = eid;
	} 
	
	public String getName() 
	{ 
		return name; 
	} 
	
	public void setName(String name) 
	{ 
		this.name = name; 
	} 
} 

class EmployeeView 							//view
{ 
	public void details(String empName, String empId) 
	{ 
		System.out.println("Employee........ "); 
		System.out.println("Name: " + empName); 
		System.out.println("Employee Id: " + empId); 
	} 
} 
									//controller
class EmployeeController 
{ 
	private Employee model; 
	private EmployeeView view; 

	public EmployeeController (Employee model, EmployeeView view) 
	{ 
		this.model = model; 
		this.view = view; 
	} 


	public void setEmployeeName(String name) 
	{ 
		model.setName(name);		 
	} 

	public String getEmployeeName() 
	{ 
		return model.getName();		 
	} 

	public void setEmployeeId(String id)
	{ 
		model.setEid(id);		 
	} 

	public String getEmployeeId() 
	{ 
		return model.getEid();		 
	} 

	public void updateView() 
	{				 
		view.details(model.getName(), model.getEid()); 
	}	 
} 
class MVCPattern 
{ 
	public static void main(String[] args) 
	{ 
		Employee model = retriveEmployee(); 

		EmployeeView view = new EmployeeView(); 

		EmployeeController controller = new EmployeeController(model, view); 

		controller.updateView(); 

		controller.setEmployeeName("ABC"); 		
		
		controller.setEmployeeId("CS189");

		controller.updateView(); 
	} 

	private static Employee retriveEmployee() 
	{ 
		Employee emp = new Employee(); 
		emp.setName("XYZ"); 
		emp.setEid("CS157"); 
		return emp;
	} 
	
} 

