import java.util.Scanner;
class Prog3
{
	static int fact(int x)
	{
		if(x==0)
			return 1;
		else
			return x*fact(x-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\nEnter a Number : ");
		num=sc.nextInt();
		System.out.print("\nFactorial of "+num+" : "+fact(num));
	}
}