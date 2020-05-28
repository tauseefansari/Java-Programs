import java.util.Scanner;
class Prog1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.print("\nEnter Base : ");
		n1=sc.nextInt();
		System.out.print("\nEnter Exponent : ");
		n2=sc.nextInt();
		System.out.println("\nPower "+n1+"^"+n2+" : "+Math.pow(n1,n2));
	}
}