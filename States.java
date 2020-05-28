import java.util.Scanner;
import java.lang.String;
class States
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i;
		String[] a = new String[6];
		String[] b = new String[6];
		String[] c = new String[6];
		String[] u = new String[6];
		
		System.out.println("\nEnter Six States Names: ");
		for(i=0;i<6;i++)
		{
		a[i]=sc.next();
		u[i]=a[i].toUpperCase();
		}
		
		System.out.println("\nEntered Name is: ");
		for(i=0;i<6;i++)
		System.out.println(u[i]);
	
		System.out.println("\nAfter Replacing First Letter (From M to N) : ");
		for(i=0;i<6;i++)
		{
		if(u[i].charAt(0)=='M')
		b[i]=u[i].replace('M','N');
		else
		b[i]=u[i];
		System.out.println(b[i]);
		}
		
		System.out.println("\nAfter Appending States : ");
		for(i=0;i<6;i++)
		{
			b[i]=u[i].concat(" States");
			System.out.println(b[i]);
		}
		
		System.out.println("\nAfter Appending India : ");
		for(i=3;i<6;i++)
		{
			c[i]=b[i].concat(" India");
			System.out.println(c[i]);
		}
		
		
	}
}