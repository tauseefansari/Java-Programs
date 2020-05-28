import java.util.Scanner;
class Prog8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,n1=1,n2=1,n3;
		System.out.print("\nEnter Limit : ");
		n=sc.nextInt();
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n-2;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}