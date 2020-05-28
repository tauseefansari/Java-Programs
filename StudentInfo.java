import java.util.*;
class Student
{
	String name;
	int roll;
	Student(String n,int r) //Student Constructor
	{
		name=n;
		roll=r;
	}
	void display() //display() method
	{
		System.out.println("\nName : "+name);
		System.out.println("Roll Number : "+roll);
	}
}
class StudentInfo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		String name=sc.next(); //read name
		System.out.print("\nEnter Roll Number : ");
		int roll=sc.nextInt(); //read roll number
		Student st = new Student(name,roll); //object of Student class with constructor parameter
		st.display(); //calling display() method
	}
}