import java.util.Scanner;
class Prog20
{
	public static void main(String[] args) 
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number of Rows and Columns : ");
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] mat = new int[r][c];
		System.out.println("\nEnter Matrix Elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				mat[i][j]=sc.nextInt();
			System.out.println();
		}
		System.out.println("\nEntered Matrix : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
}