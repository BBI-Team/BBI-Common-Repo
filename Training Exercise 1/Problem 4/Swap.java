import java.util.*;     
class Swap   
{  
    public static void main(String args[])   
    {   
	int num1,num2;
        System.out.println("Enter the value of num1 and num2 \n");  
        Scanner s = new Scanner(System.in);   					//input from user
       
	num1 = s.nextInt();  
        num2 = s.nextInt();  
        
	System.out.println("Before swapping numbers: " + num1 + "  "+ num2);  
      
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2; 
        System.out.println("After swapping numbers: "+ num1 + "  " + num2);   
    }   
}  
