import java.util.Scanner;
class Prog35
{
	static int fact(int x)
	{
		if(x==0)
			return 1;
		else
			return x*fact(x-1);
	}
	static int gcd(int n1,int n2)
	{
		if(n2!=0)
			return gcd(n2,n1%n2);
		else
			return n1;
	}
	static int lcm(int x,int y)
	{
		if(x%y==0)
			return x;
		else
			return lcm(x+x,y);
	}
	static int fibonacci(int num)
	{
		if(num==0)
			return 0; 
		if(num==1)
			return 1;
		else
			return fibonacci(num-1)+fibonacci(num-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt,number,number2;
		do
		{
			System.out.println("\n\n1:Factorial\t2:GCD\t3:LCM\t4:Fibonacci\t5:Exit");
			System.out.print("\n\nEnter Your Choice : ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("\nEnter a Number : ");
					number=sc.nextInt();
					System.out.print("\nFactorial of "+number+" is : "+fact(number));
					break;
				case 2:
					System.out.println("\nEnter Two Numbers : ");
					number=sc.nextInt();
					number2=sc.nextInt();
					System.out.print("\nGCD of "+number+" and "+number2+" is : "+gcd(number,number2));
					break;
				case 3:
					System.out.println("\nEnter Two Numbers : ");
					number=sc.nextInt();
					number2=sc.nextInt();
					System.out.print("\nLCM of "+number+" and "+number2+" is : "+lcm(number,number2));
					break;
				case 4:
					System.out.print("\nEnter Limit : ");
					number=sc.nextInt();
					System.out.printf("\nFibonacci Series : \n");
					for(int i=0;i<number;i++)
						System.out.print(" "+fibonacci(i));
					break;
			}	
		}
		while(opt!=5);
	}

}