import java.util.*;
class Student
{
	String name;
	int roll;
	void input(String n,int r) //function for input (No Return with Parameter)
	{
		name=n;
		roll=r;
	}
	void display() //function for display
	{
		System.out.println("\nName : "+name);
		System.out.println("Roll Number : "+roll);
	}
}
class StudentDisplay
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		String name=sc.next();
		System.out.print("\nEnter Roll Number : ");
		int roll=sc.nextInt();
		Student s = new Student(); //Object of Student Class
		s.input(name,roll); //calling input() method
		s.display(); //calling display() method
	}
}