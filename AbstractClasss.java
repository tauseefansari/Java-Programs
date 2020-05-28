import java.util.Scanner;
abstract class Area
{
	public final double pi=3.14;
	abstract double area(int x);
}
class AbstractClasss extends Area
{
	double area(int r)
	{
		return (pi*r*r);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AbstractClasss a = new AbstractClasss();
		System.out.print("\nEnter Radius : ");
		int rad=sc.nextInt();
		System.out.println("\nArea of Circle is : "+a.area(rad));
	}
}