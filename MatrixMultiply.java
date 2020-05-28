import java.util.*;
class MatrixMultiply
{
	public static void main(String[] args) 
	{
		int r1,c1,r2,c2,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Matrix 1 : ");
		System.out.print("\nEnter Number of Rows and Columns : ");
		r1=sc.nextInt(); //read number of rows
		c1=sc.nextInt(); //read number of columns
		int[][] matrix1 = new int[r1][c1]; //array of given rows and columns (matrix 1)
		System.out.print("\nEnter Elements of "+r1+" by "+c1+" Matrix : ");
		for (i=0;i<r1;i++) //input for matrix 1
		{
			for(j=0;j<c1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.print("\nEnter Matrix 2 : ");
		System.out.print("\nEnter Number of Rows and Columns : ");
		r2=sc.nextInt(); //read number of rows
		c2=sc.nextInt(); //read number of columns
		if(c1==r2) //number of column of matrix 1 and number of row of matrix 2 should be equal 
		{
			int[][] matrix2 = new int[r2][c2]; //array of given rows and columns (matrix 2)
			System.out.print("\nEnter Elements of "+r2+" by "+c2+" Matrix : ");
			for (i=0;i<r2;i++) //input for matrix 2
			{
				for(j=0;j<c2;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			int[][] result = new int[r1][c2]; //to store result of multiplication
			System.out.println("\nMultiplication of Matrix 1 and Matrix 2 is : ");
			for(i=0;i<r1;i++) //number of rows
			{
				for(j=0;j<c2;j++) //number of columns
				{
					for(k=0;k<r2;k++) //for multiplication of each element
					{
						result[i][j]=result[i][j]+matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			for(i=0;i<r1;i++) //for display result matrix 
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(result[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.print("\nMultiplication is not possible");
	}
}