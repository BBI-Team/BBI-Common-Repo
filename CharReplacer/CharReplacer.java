import java.util.*;
import java.io.*;

class CharReplacer
{
	public static void main(String args[])
	{
		System.out.println("Enter any text ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();

		char array[]=str.toCharArray();
		
		for(int i=1;i<array.length;i++)
		{	
			if(array[i]=='a')
				{
					array[i]='n';
				}		
		}
		System.out.println(array);
	}
}
