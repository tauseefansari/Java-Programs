import java.util.Scanner;
class Prog9
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\nEnter a Number from (1-12) : ");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
				System.out.print("\nJanuary");
				break;
			case 2:
				System.out.print("\nFebruary");
				break;
			case 3:
				System.out.print("\nMarch");
				break;
			case 4:
				System.out.print("\nApril");
				break;
			case 5:
				System.out.print("\nMay");
				break;
			case 6:
				System.out.print("\nJune");
				break;
			case 7:
				System.out.print("\nJuly");
				break;
			case 8:
				System.out.print("\nAugust");
				break;
			case 9:
				System.out.print("\nSeptember");
				break;
			case 10:
				System.out.print("\nOctober");
				break;
			case 11:
				System.out.print("\nNovember");
				break;
			case 12:
				System.out.print("\nDecember");
				break;
		}
	}
}