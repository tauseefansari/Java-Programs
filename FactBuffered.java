import java.io.*;
class FactBuffered
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,fact=1;
		System.out.print("\nEnter a Number : ");
		num=Integer.parseInt(br.readLine());  //read number
		for (int i=1; i<=num; i++) //from 1 to number
			fact=fact*i;  //multiplying
		System.out.println("\nFactorial of "+num+" is : "+fact);
	}
}