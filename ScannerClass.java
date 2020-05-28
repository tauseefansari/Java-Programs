import java.util.*;
class ScannerClass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int rollno;
		double salary;
		System.out.print("\nEnter Your Name : ");
		name=sc.nextLine();
		System.out.print("Enter Roll No. : ");
		rollno=sc.nextInt();
		System.out.print("Enter Salary : ");
		salary=sc.nextDouble();
		System.out.println("\nName : "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Salary : "+salary);
	}
}
