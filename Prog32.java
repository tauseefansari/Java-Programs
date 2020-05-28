import java.util.Scanner;
class Prog32
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a,b="";
		System.out.print("\nEnter a String : ");
		a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
			System.out.println("\nString is Palindrome");
		else
			System.out.println("\nString is Not Palindrome");
	}
}