import java.util.Scanner;
class Prog19
{
	public static void main(String[] args) 
	{
		int n,del,loc=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Size of Array : ");
		n=sc.nextInt();
		System.out.println("\nEnter "+n+" Elements : ");
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		System.out.println("\nArray Elements : ");
		for(int a : ar)
			System.out.print(a+"\t");
		System.out.print("\nEnter Element to be Delete : ");
		del=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(ar[i]==del)
			{
				loc=i;
				break;
			}
			else
				loc=0;
		}
		if(loc!=0)
		{
			for(int i=loc;i<n-1;i++)
				ar[i]=ar[i+1];
			System.out.println("\nAfter Deleting : ");
			for(int i=0;i<n-1;i++)
				System.out.print(ar[i]+"\t");
		}
		else
			System.out.print("\nElement Not Present");
	}
}