import java.util.*;
import java.io.*;
import java.lang.String.*;


class Series
{
	static void calculateOccurance(String text)
	{
		int letter1=0;
		int letter2=0;
		
		String str="_abcdefghijklmnopqrstuvwxyz";
		int cnt[]=new int[256];
		int len=text.length();
		for(int i=0;i<len;i++)
		{
			cnt[text.charAt(i)]++;
		}
		char array[]=new char[text.length()];
		for(int i=0;i<len;i++)
		{
			array[i]=text.charAt(i);
			int flag=0;
			int occ=0;
			for(int j=0;j<=i;j++)
			{
				if(text.charAt(i)==array[j])
				{
					flag++;
					occ++;
				}
			}
			if(flag==1)
			{
				letter1++;
				System.out.println("Occurence of "+text.charAt(i)+" in the given input is "+cnt[text.charAt(i)]);
			}
			if(str.indexOf(text.charAt(i))==cnt[text.charAt(i)])
			{
				
				if(occ==1)
					letter2++;
			}
			else
			{
				if(occ==1)
					System.out.println("Text is not valid!");
			}

			
		}
		if(letter2==letter1)
			System.out.println("Text is valid");	
	}
	public static void main(String args[])
	{
		System.out.println("Enter Small Letters of Alphabets.....");
		Scanner s=new Scanner(System.in);

		String text=s.nextLine();

		calculateOccurance(text);	
	}
}
