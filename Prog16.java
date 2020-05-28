import java.util.Scanner;
class Prog16
{
	public static void main(String[] args) 
	{
		int n,opt;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Size of Array : ");
		n=sc.nextInt();
		int[] ar = new int[n];
		System.out.println("\nEnter "+n+" Elements : ");
		for (int i=0;i<ar.length;i++) 
			ar[i]=sc.nextInt();
		do{
			System.out.print("\n1:Max Element \t2:Min Element \t3:Exit");
			System.out.print("\nEnter Option : ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					int max=ar[0];
					for(int i=0;i<ar.length;i++)
					{
						if(max<ar[i])
							max=ar[i];
					}
					System.out.print("\nMax Element : "+max);
					break;
				case 2:
					int min=ar[0];
					for(int i=0;i<ar.length;i++)
					{
						if(min>ar[i])
							min=ar[i];
					}
					System.out.print("\nMin Element : "+min);
					break;
			}
		}while(opt!=3);
	}
}