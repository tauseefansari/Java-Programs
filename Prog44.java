import java.util.Scanner;
class Prog44 
{
	static int Division(int x,int y) throws ArithmeticException
	{
		return x/y;
	}
	public static void main(String[] args) 
	{
		int a,b,res;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Divisor and Divident : ");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			if(a==0 && b==0)
				throw new ArithmeticException("0 Divide by 0 is Not Allowed");
			else
			{
				res=Division(a,b);
				System.out.println("\nDivision of "+a+" and "+b+" is : "+res);
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception : "+ae);
		}
		finally
		{
			System.out.println("\nEnception Handling Success");
		}
	}
}