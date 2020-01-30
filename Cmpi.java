import java.util.Scanner;
public class Cmpi 
{
	public static void main(String arg[])
	{
String s1=new Scanner(System.in).nextLine();
String s2=new Scanner(System.in).nextLine();
int len1=s1.length();
int len2=s2.length();
int count=0;
if(len1>len2 || len2>len1)
{
	System.out.println("String are not equal");
}
else
{
	for(int i=0;i<len1;i++)
	{
			int c1=s1.charAt(i);
			int c2=s2.charAt(i);
			if(c1>=65 && c1<=90)
			c1+=32;
			else if(c2>=65 && c2<=90)
				c2+=32;
			if(c1-c2>0)
			{
				System.out.println("1");
				break;
			} 
			else if(c1-c2<0)
			{
				System.out.println("-1");
				break;
			}
			else if(c1-c2==0)
			{
				count=count+1;
			}
			else if(count==(len1-2)
			{
				System.out.println("0");
			}
	}
}
}
}
