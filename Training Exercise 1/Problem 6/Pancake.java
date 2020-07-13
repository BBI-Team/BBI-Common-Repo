package pan;
import java.util.Scanner;

public class Pancake1 
{
	char plate[] = new char[10];
	int cnt=0;
	
	 void flip(char pan[])
	 	{
		 	
		 		for(int i=0;i<pan.length;i++)
		 			{
		 				if(pan[i]=='+')
		 					{
		 					plate[i]=pan[i];
		 					}
		 				else if(pan[i]=='-')
		 					{
		 						pan[i]='+';
		 						plate[i]=pan[i];
		 						cnt++;
			
		 					}
		 				
		 			System.out.println(pan[i]);		
		 				
		 			}
		 		System.out.println("count is "+ cnt);
		 	}
	 		
		 		
		 		 		 		
	 		
		 		 
    public static void main(String args[])
	{
		
		  Pancake1 p=new Pancake1();
		  Scanner sc = new Scanner(System.in);
	      System.out.println("enter characters...");
	    
	      
	    	  	char[] a=sc.next().toCharArray();
	 
	      	    System.out.println(a);
	      
	            p.flip(a);
	      
	  } 

}
		
		
	



