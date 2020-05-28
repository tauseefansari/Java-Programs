class Prog6
{
	public static void main(String[] args) 
	{
		int i,fact=1,num=Integer.parseInt(args[0]);
		for(i=1;i<=num;i++)
			fact=fact*i;
		System.out.print("\nFactorial of "+num+" : "+fact);
	}
}