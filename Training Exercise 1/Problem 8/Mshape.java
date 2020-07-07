import java.util.Scanner;
class mshape{
		public static void main(String s[]){
			Scanner sc=new Scanner(System.in);
			String str="ABCDEF";
			int len=str.length();
			int space,k=len-2;
			for(int i=0;i<len;i++)
			{
				space=2*i-1;
				System.out.print(str.substring(0,len-i));
				for(int j=1;j<=space;j++)
					System.out.print(" ");
				for(;k>=0;k--){
					System.out.print(str.charAt(k));
				}
				k=len-i-2;
				System.out.println();
				
				
			}
		}
}
