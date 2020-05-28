import java.util.*;
class Student
{
	String name;
	int roll;
	Scanner sc = new Scanner(System.in);
	Student() //default constructor
	{
		System.out.print("\nEnter Name 1 : ");
		name=sc.next(); //read came
		System.out.print("\nEnter Roll Number 1 : ");
		roll=sc.nextInt(); //read roll number
	}
	Student(String n,int r) //parameterized constructor
	{
		name=n;
		roll=r;
	}
	void display() //display details
	{
		System.out.println("\nName : "+name);
		System.out.println("Roll Number : "+roll);
	}
}
class ConstructorOverloading
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String nam;
		int rol;
		Student s = new Student(); //calling default constructor
		s.display(); //calling display function
		System.out.print("\nEnter Name 2 : ");
		nam=sc.next();
		System.out.print("\nEnter Roll Number 2 : ");
		rol=sc.nextInt();
		Student s2 = new Student(nam,rol); //calling parameterized constructor
		s2.display(); //calling display function
	}
}