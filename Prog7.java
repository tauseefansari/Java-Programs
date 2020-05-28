import java.util.Scanner;
class Prog7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,place,temp;
		double arm=0;
		System.out.print("\nEnter a Number : ");
		num=sc.nextInt();
		temp=num;
		String len=Integer.toString(num);
		int digit=(int)len.length();
		while(num!=0)
		{
			place=num%10;
			arm=arm+Math.pow(place,digit);
			num=num/10;	
		}
		if(temp==arm)
			System.out.println(temp+" is an Armstrong Number");
		else
			System.out.println(temp+" is Not an Armstrong Number");
		
	}
}