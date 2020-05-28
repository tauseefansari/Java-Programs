import java.util.Scanner;
class Prog15
{
	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Size of Array : ");
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("\nEnter "+n+" Elements : ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.print("\nSum of Elements : "+sum);
	}
}