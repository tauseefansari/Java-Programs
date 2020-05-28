import java.util.Scanner;
class Prog22
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int r,c,sum=0;
		System.out.println("\nEnter Number of Rows and Columns : ");
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] mat = new int[r][c];
		System.out.println("\nEnter Elements of Matrix : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
				sum+=mat[i][j];
			}
			System.out.println();
		}
		System.out.println("\nEntered Matrix : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
		System.out.println("\nSum of Elements : "+sum);
	}
}