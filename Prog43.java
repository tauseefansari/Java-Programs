import java.util.Scanner;
import calculator.Add;
class Prog43
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter two Number : ");
		a=sc.nextInt();
		b=sc.nextInt();
		Add obj = new Add();
		c=obj.Addition(a,b);
		System.out.println("\nAddition of "+a+" and "+b+" is : "+c);
	}
}