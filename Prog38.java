import java.util.*;
class Prog38
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a Number : ");
		x=sc.nextInt();
		System.out.print("\nEnter Power : ");
		y=sc.nextInt();
		System.out.println("\nSquare : "+power(x));
		System.out.println("\nPower "+x+"^"+y+" : "+power(x,y));
	}
	static int power(int a)
	{
		return a*a;
	}
	static int power(int b,int n)
	{
		int c=(int)Math.pow(b,n);
		return c;
	}
}