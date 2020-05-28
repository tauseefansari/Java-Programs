import java.util.*;
class Array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of array
		int n=sc.nextInt(); //read length from user
		System.out.print("\nEnter "+n+" Elements : ");
		int[] array = new int[n]; //array of n length
		for (int i=0; i<n; i++) 
			array[i]=sc.nextInt(); //read elements of array at each index
		System.out.println("\nArray Elements Are : ");
		for (int i=0; i<n; i++)
			System.out.println(array[i]); //display elements of array
	}
}