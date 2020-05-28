import java.io.*;
class Student
{
	String name;
	int rollno;
	Student() throws Exception  //Constructor of Student class
	{
		DataInputStream dis = new DataInputStream(System.in); //Data Input Stream class Object
		System.out.print("\nEnter Name : ");
		name=dis.readLine(); //read name input
		System.out.print("\nEnter Roll Number : ");
		rollno=Integer.parseInt(dis.readLine()); //read roll number input
	}
	void display() //display() method
	{
		System.out.println("\nName : "+name);
		System.out.println("Roll Number : "+rollno);
	}
}
class StudentDetails
{
	public static void main(String[] args) throws Exception
	{
		Student stu = new Student(); //object creation of Student class
		stu.display(); //calling Display method of Student class
	}
}