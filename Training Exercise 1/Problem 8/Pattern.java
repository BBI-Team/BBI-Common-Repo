import java.util.Scanner;
class Pattern
{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);

			String str="abcdefg";

			int l=str.length();
			int space,k=l-2;
			for(int i=0;i<l;i++)
			{
				space=2*i-1;
				System.out.print(str.substring(0,l-i));
				for(int j=1;j<=space;j++)
					System.out.print("_");
				for( ;k>=0;k--)
					System.out.print(str.charAt(k));
				k=l-i-2;
				        System.out.println();
				
				
			}
		}
		
}
