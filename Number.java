import java.util.*;
class Number
{
	public static void main(String[] args) throws Exception
	{
		int option;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("\n\n1:Factorial \t 2:Armstrong \t 3:Fibonacci \t 4:Exit");
			System.out.print("\n\nEnter Your Option : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					System.out.print("\nEnter a Number : ");
					long f=sc.nextLong();
					System.out.print("\nFactorial is : "+fact(f));
					break;
				case 2:
					System.out.print("\nEnter a Number : ");
					int arm=sc.nextInt();
					if(armstrong(arm))
						System.out.println("\n"+arm+" is an Armstrong Number");
					else
						System.out.println("\n"+arm+" is Not an Armstrong Number");
					break;
				case 3:
					System.out.print("\nEnter Limit : ");
					int lim=sc.nextInt();
					System.out.println();
					fibonacci(lim);
					break;
			}	
			continue;
		}
		while(option!=4);
	}

	static long fact(long x)
	{
		long factorial=1;
		for(int i=1;i<=x;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

	static boolean armstrong(int a)
	{
		String dig=Integer.toString(a);
		int digit=(int)dig.length();
		double sum=0,temp=a;
		while(a>0)
		{
			int n=a%10;
			sum=sum+Math.pow(n,digit);
			a=a/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}

	static void fibonacci(int n)
	{
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}
}