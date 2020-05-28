import java.io.*;
class Student
{
	int roll;
	String name;
	Student() throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("\nEnter Name : ");
		name=dis.readLine();
		System.out.print("\nEnter Roll Number : ");
		roll=Integer.parseInt(dis.readLine());
	}
	void display()
	{
		System.out.println("\n**** Display *****");
		System.out.print("\nName : "+name);
		System.out.print("\nRoll Number : "+roll);
	}
}
class Prog10
{
	public static void main(String[] args) throws Exception 
	{
		Student s = new Student();
		s.display(); 
	}
}