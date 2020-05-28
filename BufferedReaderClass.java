import java.io.*;
class BufferedReaderClass
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int rollno;
		double salary;
		System.out.print("\nEnter Your Name : ");
		name=br.readLine();
		System.out.print("Enter Roll No. : ");
		rollno=Integer.parseInt(br.readLine());
		System.out.print("Enter Salary : ");
		salary=Double.parseDouble(br.readLine());
		System.out.println("\nName : "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Salary : "+salary);
	}
}
