import java.util.*;
class SumArray
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of array
		int n=sc.nextInt(); //read length from user
		int[] array = new int[n]; //array of n length
		System.out.print("\nEnter "+n+" Elements : ");
		for (int i=0; i<n; i++) 
		{
			array[i]=sc.nextInt(); //read elements of array
			sum+=array[i]; //store sum in sum variable
		}
		System.out.print("\nSum of Array Elements Are : "+sum+"\n"); //display sum
	}
}