import java.util.Scanner;
class Palindrome
	{  
		public static void main(String args[])
		{  
		Scanner sc=new Scanner(System.in);
		int rem,sum=0,temp,n;      
		System.out.print("\nEnter a Number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
			{    
			rem=n%10;
			sum=(sum*10)+rem;    
			n=n/10;    
			}	
		if(temp==sum)    
		System.out.println("\t\t\tPerfect Palindrome Number ");    
		else    
		System.out.println("\t\t\tNot Palindrome Number");    
	}  
}  