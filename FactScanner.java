import java.util.*;
class FactScanner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,fact=1;
		System.out.print("\nEnter a Number : ");
		num=sc.nextInt();  //read number
		for (int i=1; i<=num; i++) //from 1 to number
			fact=fact*i;  //multiplying
		System.out.println("\nFactorial of "+num+" is : "+fact);
	}
}
