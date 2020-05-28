import java.util.*;
class Employee
{
	Scanner sc = new Scanner(System.in);
	int id,salary;
	String name,desig;
	Employee()
	{
		System.out.print("\nEnter Employee ID : ");
		id=sc.nextInt();
		System.out.print("\nEnter Employee Name : ");
		name=sc.next();
		System.out.print("\nEnter Designation : ");
		desig=sc.next();
		System.out.print("\nEnter Salary : ");
		salary=sc.nextInt();
	}
	Employee(int eid,String ename,String desg,int sal)
	{
		id=eid;
		name=ename;
		desig=desg;
		salary=sal;
	}
	void display()
	{
		System.out.println("\n\nEmployee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Designation : "+desig);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		e.display();
		System.out.print("\nEnter Employee ID : ");
		int iid=sc.nextInt();
		System.out.print("\nEnter Employee Name : ");
		String iname=sc.next();
		System.out.print("\nEnter Designation : ");
		String idesig=sc.next();
		System.out.print("\nEnter Salary : ");
		int isalary=sc.nextInt();
		Employee e1 = new Employee(iid,iname,idesig,isalary);
		e1.display();
	}
}