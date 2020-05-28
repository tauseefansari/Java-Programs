import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter First No. : ");
		int a=s.nextInt();
		System.out.println("\nEnter Second No. : ");
		int b=s.nextInt(); 
		System.out.println("\nAddition of " +a+ " and " +b+ " is " +(a+b));
	}
}