import java.util.*;
class Power
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Base : "); //base Value
		int value=sc.nextInt();
		System.out.print("\nEnter Exponent : "); //power value
		int power=sc.nextInt();
		int res=(int) Math.pow(value,power); //claculate power using pow() function
		System.out.println("\nPower of "+value+"^"+power+" is : "+res);
	}
}