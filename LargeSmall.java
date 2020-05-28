import java.util.*;
class LargeSmall
{
	public static void main(String[] args) 
	{
		int option,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of an Array
		n=sc.nextInt(); //read length
		int[] array = new int[n]; //array of length n
		System.out.print("\nEnter "+n+" Elements : ");
		for (i=0; i<n; i++)
			array[i]=sc.nextInt(); //input for array elements
		do
		{
			System.out.println("\n\n1: Largest \t 2: Smallest \t 3: Exit");
			System.out.print("\nEnter Option : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					int large=array[0]; //for finding largest elements
					for (i=0; i<n; i++) 
					{
						if(large < array[i])
							large=array[i];
					}
						System.out.print(large+" is Largest");
					break;
				case 2:
					int small=array[0]; //for finding Smallest elements
					for (i=0; i<n; i++) 
					{
						if(small > array[i])
							small=array[i];
					}
						System.out.print(small+" is Smallest");	
					break;
			}
			continue;
		}while(option!=3); //for exit
		
	}
}