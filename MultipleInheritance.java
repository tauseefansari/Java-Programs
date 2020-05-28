import java.util.*;
interface I
{
	public final double pi=3.14;
	public void calArea();
}
class A
{
	float r;
	void getData(float y)
	{
		r=y;
	}
}
class B extends A implements I
{
	double area;
	public void calArea()
	{
		area=pi*r*r;
	}
	void display()
	{
		System.out.println("\nRadius : "+r);
		System.out.println("\nArea of Circle : "+area);
	}
}
class MultipleInheritance
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Radius : ");
		float rad=sc.nextFloat();
		B obj = new B();
		obj.getData(rad);
		obj.calArea();
		obj.display();
	}
}