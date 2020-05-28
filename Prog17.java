import java.util.Scanner;
class Prog17
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in); 
		System.out.print("\nEnter Number of Elements : ");
		n=sc.nextInt();
		int[] ar = new int[n];
		System.out.println("\nEnter "+n+" Elements : ");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		System.out.print("\nArray Elements : ");
		for(int a : ar)
			System.out.print(a+" \t ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
			// This is not needed (optional) 
			//from here to 
			System.out.print("\n\nAfter Pass"+(i+1)+" : ");
			for(int k=0;k<n;k++)
				System.out.print(" "+ar[k]+"\t");
			//to here
		}
		System.out.print("\n\nAfter Sorting : ");
		for(int a : ar)
			System.out.print(a+"\t");
	}
}