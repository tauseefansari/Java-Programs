import java.util.*;
class Matrix
{
	public static void main(String[] args) 
	{
		int r,c,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number of Rows and Columns : ");
		r=sc.nextInt(); //read number of rows
		c=sc.nextInt(); //read number of columns
		int[][] matrix = new int[r][c]; //array of given rows and columns
		System.out.print("\nEnter Elements of "+r+" by "+c+" Matrix : ");
		for (i=0;i<r;i++) //input for a matrix
		{
			for(j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix is : ");
		for (i=0;i<r;i++) //display matrix
		{
			for(j=0;j<c;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}