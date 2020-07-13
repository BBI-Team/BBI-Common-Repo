import java.io.*;
import java.util.*;
class PanCake
{
	public int counter;
	char plate[];
	public PanCake()
	{
		counter=0;
		plate=new char[10];
	}
	public void number_of_flips(char arr[])
	{
		try
		{
			while(counter<arr.length)
			{
				if(arr[counter]=='+')
				{
					plate[counter]=arr[counter];
				
				}
				else if(arr[counter]=='-')
				{
					arr[counter]='+';
					plate[counter]=arr[counter];
					
				}
				
				System.out.print(arr[counter]);
				counter++;	
			}	
			System.out.println("\nNumber of flips are:"+(counter-1));			
			
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
	public static void main(String v[])
	{
		PanCake pk=new PanCake();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the + and - sign of pancake till 10 length:");
		String fromUser=scan.nextLine();
		char array[]=fromUser.toCharArray();
		int i=0;
		if(array[i]=='+'||array[i]=='-')
		{
			
			pk.number_of_flips(array);		
			
		}
		else{
			System.out.println("You Entered wrong string!");
		}		
	}
}