import java.util.*;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int n,i,j,option,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Length : "); //length of array
		n=sc.nextInt(); //read length
		int[] array = new int[n]; //array of length  n
		System.out.print("\nEnter "+n+" Elements : ");
		for(i=0;i<n;i++) //input elements of array
			array[i]=sc.nextInt();
		do
		{
			System.out.println("\n1: Ascending Order \t 2: Descending Order \t 3: Exit");
			System.out.print("\nEnter Your Choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1: //ascending order
					for(i=0;i<n-1;i++) //number of pass
					{
						for (j=0;j<(n-i)-1;j++) //number of comaprisons
						{
							if (array[j+1] < array[j]) //if less then swap
							{
								temp=array[j];
								array[j]=array[j+1];
								array[j+1]=temp;
							}
						}
					}
					System.out.print("\nSorted Array (Ascending) : ");
					for(i=0;i<n;i++) //display sorted array
						System.out.println(array[i]);
					break;
				case 2:
					for(i=0;i<n-1;i++) //number of pass
					{
						for (j=0;j<(n-i)-1;j++) //number of comaprisons
						{
							if (array[j+1] > array[j]) //if greater then swap
							{
								temp=array[j];
								array[j]=array[j+1];
								array[j+1]=temp;
							}
						}
					}
					System.out.print("\nSorted Array (Descending) : ");
					for(i=0;i<n;i++) //display sorted array
						System.out.println(array[i]);
					break;
			}
			continue;
		}while(option!=3); //for exit
	}
}