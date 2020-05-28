import java.util.Scanner;
interface myinterface
{
	double pi=3.14;
	public double area(int r);
}
class Area implements myinterface
{
	public double area(int r)
	{
		return pi*r*r;
	} 
}
class Prog42
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Radius : ");
		int rad=sc.nextInt();
		Area a = new Area();
		System.out.print("\nArea of Circle : "+a.area(rad));
	}
}