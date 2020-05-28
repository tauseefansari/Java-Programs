import java.util.*;
class Exc extends Exception
{
	Exc()
	{
		System.out.print("User Defined Exception Occured");
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("\nException Handling\n");
			throw new Exc();
		}
		catch(Exc ex)
		{
			System.out.print("\nException is : "+ex);
		}
		finally
		{
			System.out.print("\nException Handled");
		}
	}
}