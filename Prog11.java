import java.io.*;
class Student
{
	String name;
	int roll;
	Student(String n,int rol)
	{
		name=n;
		roll=rol;
	}
	void display()
	{
		System.out.println("\n**** Display *****");
		System.out.print("\nName : "+name);
		System.out.print("\nRoll Number : "+roll);
	}
}
class Prog11
{
	public static void main(String[] args) throws Exception 
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("\nEnter Name : ");
		String name=dis.readLine();
		System.out.print("\nEnter Roll Number : ");
		int roll=Integer.parseInt(dis.readLine());
		Student s = new Student(name,roll);
		s.display();
	}
}