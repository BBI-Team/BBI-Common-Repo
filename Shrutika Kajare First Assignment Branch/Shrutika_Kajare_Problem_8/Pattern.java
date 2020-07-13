import java.lang.String.*;
import java.util.*;

class Pattern
{
	public static void main(String args[])
	{
		int alphabet=97;
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6-i;j++)
				System.out.print((char)(alphabet+j));
			for(int k=1;k<=i*2-1;k++)
				System.out.print(" ");
			for(int l=6-i;l>=0;l--)
				if(l!=6)
					System.out.print((char)(alphabet+l));
			System.out.println(" ");
		}
	}
}
