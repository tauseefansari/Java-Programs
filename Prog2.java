import java.util.Scanner;
class Prog2
{
	static int power(int x,int y)
	{
		if(y==0)
			return 1;
		else
			return x*power(x,y-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  n1,n2;
		System.out.print("\nEnter Base : ");
		n1=sc.nextInt();
		System.out.print("\nEnter Exponent : ");
		n2=sc.nextInt();
		System.out.print("\nPower "+n1+"^"+n2+" : "+power(n1,n2));
	}
}