import java.lang.String.*;
import java.io.*;
import java.util.*;

class Pancakes
{
	public static int cnt=0;
	public static void flip(char panArr[])
	{
		try{
		char plate[]=new char[10];
		for(int i=0;i<panArr.length;i++)
		{
			
			if(panArr[i]=='+')
				plate[i]=panArr[i];
			else if(panArr[i]=='-')
			{
				cnt++;
				panArr[i]='+';
				plate[i]=panArr[i];
			}
			System.out.println(panArr[i]);
		}
		System.out.println(cnt+" times pancakes have been fliped");
		}
		catch(Exception e)
		{
			System.out.println("Error Occured "+e.getMessage());
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter + or -");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='+' && text.charAt(i)=='-')
			{
				char panArr[]=text.toCharArray();
				flip(panArr);
				
			}
			else
				System.out.println("Wrong Stirng!!!! Please enter only + or -");
			break;
		}
		
	}
}
