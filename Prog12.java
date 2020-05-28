import java.util.Scanner;
 class Student
 {
 	String name;
 	int roll;
 	Student()
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("\nEnter Name : ");
 		name=sc.nextLine();
 		System.out.print("\nEnter Roll Number : ");
 		roll=sc.nextInt();
 	}
 	Student(String nam,int rol)
 	{
 		name=nam;
 		roll=rol;
 	}
 	void display()
 	{
 		System.out.print("\nName : "+name);
 		System.out.print("\nRoll Number : "+roll);
 	}
 }
 class Prog12
 {
 	public static void main(String[] args) 
 	{
 		String name;
 		int roll;
 		Scanner sc = new Scanner(System.in);
 		Student s1 = new Student();
 		System.out.print("\nEnter Name : ");
 		name=sc.nextLine();
 		System.out.print("\nEnter Roll Number : ");
 		roll=sc.nextInt();		
 		s1.display();
 		Student s2 = new Student(name,roll);
 		s2.display();
 	}
 }