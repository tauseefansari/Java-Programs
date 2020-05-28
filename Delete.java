import java.util.*;
class Delete
{
	public static void main(String[] args) 
	{
		int n,i,del,pos=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of an array
		n=sc.nextInt(); //read length
		int[] array = new int[n]; //array of length n
		System.out.print("\nEnter "+n+" Elements : ");
		for(i=0;i<n;i++) //input array elements
			array[i]=sc.nextInt();
		System.out.print("\nEnter the Element to be Deleted : ");
		del=sc.nextInt(); //read the element to be delete
		for(i=0;i<n;i++)
		{
			if(array[i]==del) //search if it is present or not
				pos=i; //return the position if present
		}
		for(i=pos;i<n-1;i++) //from position to end of array
				array[i]=array[i+1]; //shift element of array
		System.out.println("\nAfter Deletion : ");
		for (i=0;i<n-1;i++) //display resultant array
			System.out.println(array[i]);
	}
}