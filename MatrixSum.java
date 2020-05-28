import java.util.*;
class MatrixSum
{
	public static void main(String[] args) 
	{
		int sum=0,i,j,r,c;
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
				sum+=matrix[i][j]; //storing sum of each elements
			}
		}
		System.out.println("\nSum of Elements of the Given Matrix is : "+sum); //display sum
	}
}