import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a,b="";
		System.out.print("\nEnter a String : ");
		a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
			System.out.println("\nString is Palindrome");
		else
			System.out.println("\nString is Not Palindrome");
	}
}