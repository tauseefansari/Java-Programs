import java.util.Scanner;
class Prog5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,rem,rev=0,temp;
		System.out.print("\nEnter a Number : ");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.print("\nReverse of "+temp+" : "+rev);
	}
}