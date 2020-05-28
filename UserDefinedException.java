import java.util.Scanner;
class PayOutOfBondsException extends Exception
{
	PayOutOfBondsException(String str)
	{
		System.out.print("Exception : "+str);
	}
}
class UserDefinedException
{
	public static void main(String[] args) 
	{
		double bs,gs,ta,da,hra,ca;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Basic Salary : ");
		bs=sc.nextDouble();
		try
		{
			if(bs<8000)
			{
				throw new PayOutOfBondsException("Basic Salary Should not less than 8000\n");
			}
			else
			{	
				ta=(0.15*bs);
				da=(0.70*bs);
				hra=(0.20*bs);
				ca=(0.10*bs);
				gs=bs+ta+da+hra+ca;
				System.out.print("\nBasic Salary : "+bs);
				System.out.print("\nTA (15%) : "+ta);
				System.out.print("\nDA (70%) : "+da);
				System.out.print("\nHRA (20%) : "+hra);
				System.out.print("\nCA (10%) : "+ca);
				System.out.print("\nGross Salary : "+gs);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}