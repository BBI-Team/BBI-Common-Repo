import java.io.*;
import java.util.*;
class Array
{
public static void main(String args[])
{
	System.out.println("Enter Text....");
	Scanner text=new Scanner(System.in);
	String str=text.nextLine();
	char array[]=str.toCharArray();
	for(int i=1;i<array.length;i++)
	{
		if(array[i]=='a')
		{
			array[i]='s';
		}
	}System.out.println(array);
}
}
