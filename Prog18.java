import java.util.Scanner;
class Prog18
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,ser,loc=0;
		boolean isFound=false;
		System.out.print("\nEnter Size of Array : ");
		n=sc.nextInt();	
		System.out.println("\nEnter "+n+" Elements : ");
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		System.out.println("\nArray Elements : ");
		for(int a : ar)
			System.out.print(a+"\t");
		System.out.print("\nEnter Element to be Search : ");
		ser=sc.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ser)
			{	
				loc=i;
				isFound=true;
				break;
			}
		}
		if(isFound)
			System.out.print("\nElement "+ser+" is Found at Location : "+(loc+1));
		else
			System.out.print("\nElement "+ser+" is Not Found");
	}
}