import java.io.*;
class Prog27
{
	public static void main(String[] args) throws IOException
	{
		int fact=1,num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter a Number : ");
		num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++)
			fact*=i;
		System.out.print("\nFactorial of "+num+" is : "+fact);
	}
}