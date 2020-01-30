import java.util.*;
public class Cmp 
{
	public static void main(String arg[])
	{
String s1=new Scanner(System.in).nextLine();
String s2=new Scanner(System.in).nextLine();
int len1=s1.length();
int len2=s2.length();
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
			if(c1 != c2)
			{
				System.out.println(c1-c2);
				break;
			}
	}
    if(s1==s2)
	System.out.println("0");
}
}
}
