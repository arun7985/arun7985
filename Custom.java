
public class Custom extends Exception
{
  public Custom(String s)
  {
	  super(s);
  }
  public static void main (String args[])
  {
	  int x=20;
	  try
	  {
		  if(x<40)
		  {
			  throw new Custom("You are not eligible");
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
