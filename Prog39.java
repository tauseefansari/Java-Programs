import java.util.*;
class Square
{
	double area(int a)
	{
		return a*a;
	}
}
class Circle extends Square
{
	double area(int a)
	{
		return (3.14)*a*a;
	}
}
class Prog39
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Side : ");
		int side=sc.nextInt();
		System.out.print("\nEnter Radius : ");
		int radius=sc.nextInt();
		Square obj1 = new Square();
		System.out.println("\nArea of Square : "+obj1.area(side));
		Circle obj2 = new Circle();
		System.out.println("\nArea of Circle : "+obj2.area(radius));
	}
}