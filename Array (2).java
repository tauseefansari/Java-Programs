import java.util.Scanner;
class Array
{
	int[] num = new int[10];
	
	Array()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Array Elements: ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Enter Element "+(i+1)+" : ");
			num[i]=sc.nextInt();
		}
	}
	
	public void sortArray()
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				}
			}
		}
		
		System.out.println("\nArray Elements After Sorting: ");
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}
	
	public static void main(String args[])
	{
		Array ar = new Array();
		ar.sortArray();
	}
}