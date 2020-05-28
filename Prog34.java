import java.io.*;
import java.util.*;
class Bank
{
	long contactno;
	int accno;
	double balance,roi;
	String name,addr;
  
 	Bank()
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("\nEnter Your Name : ");
 		name=sc.next();
 		System.out.print("\nEnter Account No. : ");
 		accno=sc.nextInt();
 		System.out.print("\nEnter Address : ");
 		addr=sc.next();
 		System.out.print("\nEnter Initial Balance : "); 
 		balance=sc.nextDouble();
 		System.out.print("\nEnter Rate of Interest(ROI) : ");
 		roi=sc.nextDouble();
 		System.out.print("\nEnter Contact No. : "); 
 		contactno=sc.nextLong();
 	}
	void disp()
 	{
	 	System.out.println("Name : "+name);
	 	System.out.println("Account No. :"+accno);
	 	System.out.println("Address : "+addr);
	 	System.out.println("Contact No. : "+contactno); 
 	} 	 
 	void dispbal()
 	{
	 	System.out.println("Balance : "+balance); 
 	} 
 	void deposit(Double amt)
 	{
		balance=balance+amt;
 	}
 	void withdraw(Double n)
 	{
	  	balance=balance-n;
 	}	 
 	void computeint(Double amtt)
	{
	 	Double amtto=amtt*roi;
	 	balance=balance+amtto;
	}
}
class Prog34
{
	public static void main(String args[]) throws IOException
	{
		int z,ch;
	 	Bank c = new Bank();
	 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 	do
	 	{
	 		System.out.println("\n1:Deposit\t 2:Withdraw\t 3:Compute Interest\t 4:Display\t 5:Exit");
	 		System.out.print("Enter Your Choice : ");
     		ch=Integer.parseInt(br.readLine());	 
     		switch(ch)
	 		{
	 		case 1: 
	 			System.out.print("Enter Amount : "); 
				Double amt=Double.parseDouble(br.readLine()); 
				c.deposit(amt);
				c.dispbal();
				break;
			case 2:
				System.out.print("Enter Amount : "); 
	        	Double n=Double.parseDouble(br.readLine()); 
		    	c.withdraw(n);	   
				c.dispbal();
				break;   
			case 3:
				System.out.print("Enter Amount : "); 
				Double amount=Double.parseDouble(br.readLine());
		    	c.computeint(amount);
            	c.dispbal();		
				break;
			case 4:
				c.disp();
		    	c.dispbal();
				break;
			}   
	  	}
	  	while(ch!=5);
    }	
}
		       