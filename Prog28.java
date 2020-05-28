import java.util.Scanner;
import java.io.*;
class Prog28
{
	static String name;
	static int roll;
	static float salary;
	static double doub;
	static void display()
	{
		System.out.print("\nName : "+name);
		System.out.print("\nRoll Number : "+roll);
		System.out.print("\nSalary : "+salary);
		System.out.print("\nDouble : "+doub);
	}
	static void usingScanner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name=sc.nextLine();
		System.out.print("\nEnter Roll Number : ");
		roll=sc.nextInt();
		System.out.print("\nEnter Salary : ");
		salary=sc.nextFloat();
		System.out.print("\nEnter Double : ");
		doub=sc.nextDouble();
	}
	static void usingDataInputStream() throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("\nEnter Name : ");
		name=dis.readLine();
		System.out.print("\nEnter Roll Number : ");
		roll=Integer.parseInt(dis.readLine());
		System.out.print("\nEnter Salary : ");
		salary=Float.parseFloat(dis.readLine());
		System.out.print("\nEnter Double : ");
		doub=Double.parseDouble(dis.readLine());
	}
	static void usingBufferedReader() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter Name : ");
		name=br.readLine();
		System.out.print("\nEnter Roll Number : ");
		roll=Integer.parseInt(br.readLine());
		System.out.print("\nEnter Salary : ");
		salary=Float.parseFloat(br.readLine());
		System.out.print("\nEnter Double : ");
		doub=Double.parseDouble(br.readLine());
	}
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\n\n1:DataInputStream \t 2:Scanner \t 3:BufferedReader \t4:Exit ");
			System.out.print("\nEnter Option : ");
			opt=s.nextInt();
			switch(opt)
			{
				case 1:
					usingDataInputStream();
					display();
					break;
				case 2:
					usingScanner();
					display();
					break;
				case 3:
					usingBufferedReader();
					display();
					break;
			}
		}while(opt!=4);
	}
}