import java.util.Scanner;
import java.io.*;
class Prog4
{
	static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		return fact;
	}
	static void usingScanner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a Number : ");
		int num=sc.nextInt();
		System.out.print("\nFactorial of "+num+" : "+fact(num));
	}
	static void usingDataInputStream() throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("\nEnter a Number : ");
		int num=Integer.parseInt(dis.readLine());
		System.out.print("\nFactorial of "+num+" : "+fact(num));
	}
	static void usingBufferedReader() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter a Number : ");
		int num=Integer.parseInt(br.readLine());
		System.out.print("\nFactorial of "+num+" : "+fact(num));	 
	}
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\n1:DataInputStream \t 2:Scanner \t 3:BufferedReader \t4:Exit ");
			System.out.print("\nEnter Option : ");
			opt=s.nextInt();
			switch(opt)
			{
				case 1:
					usingDataInputStream();
					break;
				case 2:
					usingScanner();
					break;
				case 3:
					usingBufferedReader();
					break;
			}
		}while(opt!=4);
	}
}