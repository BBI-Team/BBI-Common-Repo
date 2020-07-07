/*Singleton Class in Java
In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.
To design a singleton class:

Make constructor as private.
Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.
Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, For normal class we use constructor, whereas for singleton class we use getInstance() method (Example code:I). In general, to avoid confusion we may also use the class name as method name while defining this method*/



 
 
class Singleton 
{ 
	 
	private static Singleton single_instance = null; 

	 
	public String s; 

	 
	private Singleton() 
	{ 
		s = "Hello I am a string part of Singleton class"; 
	} 

	 
	public static Singleton getInstance() 
	{ 
		if (single_instance == null) 
			single_instance = new Singleton(); 

		return single_instance; 
	} 
} 
 
class Main 
{ 
	public static void main(String args[]) 
	{ 
		 
		Singleton x = Singleton.getInstance(); 

		 
		Singleton y = Singleton.getInstance(); 

		 
		Singleton z = Singleton.getInstance(); 

		 
		x.s = (x.s).toUpperCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
		System.out.println("\n"); 

		
		z.s = (z.s).toLowerCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
	} 
} 
 
