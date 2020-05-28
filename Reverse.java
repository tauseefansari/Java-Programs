import java.util.*;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,rem,num;
		System.out.print("\nEnter a Number : ");
		num=sc.nextInt(); //read a number
		int temp=num; //assigned to temp variable
		while(num!=0) //until num==0
		{
			rem=num%10; //calculate remainder
			rev=(rev*10)+rem; //for each digit
			num=num/10;
		}
		System.out.println("\nReverse of "+temp+" is : "+rev);
	}
}