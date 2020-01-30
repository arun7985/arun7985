
public class ExceptionTry {
	public static void main(String args[])
	{
	try {
	int a=0;
	int b=7;
	int c=b/a;
	System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("exception generated");
		e.printStackTrace();
	}
	}
}
