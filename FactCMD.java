import java.io.*; 
class FactCMD
{
	public static void main(String[] args) 
	{
		int num,fact=1;
		num=Integer.parseInt(args[0]);  //read number from Command Line
		for (int i=1; i<=num; i++) //from 1 to number
			fact=fact*i;  //multiplying
		System.out.println("\nFactorial of "+num+" is : "+fact);
	}
}