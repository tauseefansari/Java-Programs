import java.util.Scanner;
class Student
{
	String name;
	int roll;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name=sc.nextLine();
		System.out.print("\nEnter Roll Number : ");
		roll=sc.nextInt();
	}
	void display()
	{
		System.out.print("\nName : "+name);
		System.out.print("\nRoll Number : "+roll);
	}
}
class Prog13
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.getData();
		s2.getData();
		s1.display();
		s2.display();
	}
}