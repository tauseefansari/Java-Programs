import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		int opt;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\n1:Transpose of Matrix \t\t 2:Sum of Diagonal and Non Diagonal Elements");
			System.out.println("3:Addition of Two Matrices\t4:Exit");
			System.out.print("\nEnter Option : ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					int r,c,tr,tc;
					System.out.print("Enter Number of Rows and Columns : ");
					r=sc.nextInt();
					c=sc.nextInt();
					int matrix[][] = new int[r][c];
					System.out.println("Enter Elements of "+r+" by "+c+" Matrix : ");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							matrix[i][j]=sc.nextInt();
						}
					}
					int transpose[][] = new int[r][c];
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							transpose[j][i]=matrix[i][j];
						}
					}
					System.out.println("Transpose of the Matrix : ");
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							System.out.print(transpose[i][j]+"\t");
						}
						System.out.print("\n");
					}
				break;
				case 2:
					int r1,c1;
					System.out.print("Enter Number of Rows and Columns : ");
					r1=sc.nextInt();
					c1=sc.nextInt();
					int matrix1[][] = new int[r1][c1];
					System.out.println("Enter Elements of "+r1+" by "+c1+" Matrix : ");
					for(int i=0;i<r1;i++)
					{
						for(int j=0;j<c1;j++)
						{
							matrix1[i][j]=sc.nextInt();
						}
					}
					System.out.println("Entered Matrix is  : ");
					for(int i=0;i<r1;i++)
					{
						for(int j=0;j<c1;j++)
						{
							System.out.print(matrix1[i][j]+"\t");
						}
						System.out.println();
					}
					int sum=0,nondiag=0;
					for(int i=0;i<r1;i++)
					{
						for(int j=0;j<c1;j++)
						{
							if(matrix1[i][j] == matrix1[j][i])
								sum=sum+matrix1[i][j];
							if(matrix1[i][j] != matrix1[j][i])
								nondiag=nondiag+matrix1[i][j];
						}
					}
					System.out.println("Sum of Diagonal is  : "+sum);
					System.out.println("Sum of Non Diagonal is  : "+nondiag);
				break;	
				case 3:
					int r2,c2;
					System.out.print("Enter Number of Rows and Columns : ");
					r2=sc.nextInt();
					c2=sc.nextInt();
					int m1[][] = new int[r2][c2];
					int m2[][] = new int[r2][c2];
					System.out.println("Enter Elements of "+r2+" by "+c2+" Matrix 1 : ");
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							m1[i][j]=sc.nextInt();
						}
					}
					System.out.println("Enter Elements of "+r2+" by "+c2+" Matrix 2 : ");
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							m2[i][j]=sc.nextInt();
						}
					}
					System.out.println("Entered Matrix 1 is  : ");
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							System.out.print(m1[i][j]+"\t");
						}
					System.out.println();
					}
					System.out.println("Entered Matrix 2 is  : ");
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							System.out.print(m2[i][j]+"\t");
						}
					System.out.println();
					}
					int m3[][] = new int[r2][c2];
					System.out.println("Addition of Matrix 1 and Matrix 2 is : ");
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							m3[i][j]=m1[i][j]+m2[i][j];
						}
					}
					for(int i=0;i<r2;i++)
					{
						for(int j=0;j<c2;j++)
						{
							System.out.print(m3[i][j]+"\t");
						}
					System.out.println();
					}
				}	
				continue;
		}
		while(opt!=4);
	}
}