import java.util.*;
class Search
{
	public static void main(String[] args) 
	{
		int n,ele,i,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of an array
		n=sc.nextInt(); //read length
		int[] array = new int[n]; //array of length n
		System.out.print("\nEnter "+n+" Elements : ");
		for (i=0;i<n;i++) //input for array elements
			array[i]=sc.nextInt();
		System.out.print("\nEnter Element to be Found : ");
		ele=sc.nextInt(); //read the element to be search
		for (i=0;i<n;i++) 
		{
			if(ele==array[i]) //match element with each element in an array
			{
				flag=1; //if found then set flag=1
				break;
			}
		}
		if(flag==1) 
			System.out.println(ele+" Found at Location : "+(i+1)); //display if found
		else
			System.out.print("Element Not Found"); //display if not found
	}
}