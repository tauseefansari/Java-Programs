import java.util.*;
class Employee
{	
	int age;
	String name,address,gender;
	Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of Employee: ");
		name=sc.next();
		System.out.print("Enter Gender of Employee : ");
		gender=sc.next();
		System.out.print("Enter Address of Employee : ");
		address=sc.next();
		System.out.print("Enter Age of Employee : ");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name of Employee : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
	}
}
class FullTime extends Employee
{
	
	float salary;
	String des;
	FullTime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary : ");
		salary=sc.nextFloat();
		System.out.print("Enter Designation : ");
		des=sc.next();
	}
	void display()
	{
		System.out.println("\n=== Full Time Employee Details ===");
		super.display();
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+des);
	}
}
class PartTime extends Employee
{
	
	int workinghours,rate;
	PartTime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Working Hours : ");
		workinghours=sc.nextInt();
	}
	void calculatepay()
	{
		rate=8*workinghours;
	}
	void display()
	{
		System.out.println("\n=== Part Time Employee Details ===");
		super.display();
		System.out.println("Working Hours : "+workinghours);
		System.out.println("Rate : "+rate);
	}
}
class EmployeeDetails
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\n1: Part Time Employee \t 2: Full Time Employee \t 3: Exit");
			System.out.print("\nEnter Option : ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					PartTime part = new PartTime();
					part.calculatepay();
					part.display();
					break;
				case 2:
					FullTime full = new FullTime();
					full.display();
					break;
			}
			continue;
		}while(opt!=3);
	}
}