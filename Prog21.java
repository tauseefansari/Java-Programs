import java.util.Scanner;
class Prog21
{
	public static void main(String[] args) 
	{
		int r1,c1,r2,c2;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number of Rows and Columns of Matrix 1 : ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		int[][] mat1 = new int[r1][c1];
		System.out.println("\nEnter Matrix 1 Elements : ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
				mat1[i][j]=sc.nextInt();
			System.out.println();
		}
		System.out.println("\nEnter Number of Rows and Columns of Matrix 2 : ");
		r2=sc.nextInt();
		c2=sc.nextInt();
		if(r1==c2)
		{
			int[][] mat2 = new int[r2][c2];
			System.out.println("\nEnter Matrix 2 Elements : ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
					mat2[i][j]=sc.nextInt();
			System.out.println();
			}
			int[][] mul = new int[r1][c2];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<r2;k++)
						mul[i][j]=mul[i][j]+mat1[i][k]*mat2[k][j];
				}
			}
			System.out.println("\nMultiplied Matrix : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
					System.out.print(mul[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.print("\nMultiplication is Not Possible");
	}
}