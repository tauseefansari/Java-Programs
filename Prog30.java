import java.util.*;
class Prog30
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		double k,root1,root2;
		System.out.print("\n\nEnter Quadratic Equation\n");
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.print("Enter C : ");
		c=sc.nextInt();
		System.out.print("\nGiven Quadratic Equation is : "+a+"x^2 + "+b+"x + "+c);
		k=(b*b)-(4*a*c);
		if(k>0) 
		{
			System.out.print("\n\nRoots are Real and Un-equal\n");
			root1=(-b+Math.sqrt(k))/(2*a);
			root2=(-b-Math.sqrt(k))/(2*a);
			System.out.print("Root 1 : "+root1);
			System.out.print("\nRoot 2 : "+root2);
		}
		else if(k==0)
		{
			System.out.print("\n\nRoots are Real and Equal\n\n");
			root1=(-b+Math.sqrt(k))/(2*a);	
			System.out.print("Root : "+root1);
		}
		else
		{
			System.out.print("\n\nRoots are Imaginiary\n\n");
		}
	}	
}