class Spalindrome
{
	public static int rever(int num)
	{
	int res=0;
		while(num>0)
		{
		res=res*10+(num%10);
		num=num/10;
		}
	return res;
	}
	public static void main(String args[])
	{
		int i;
		System.out.print("\nSquare from 1 to 10000");
		for(i=1;i<=10000;i++)
		System.out.println("Squre of "+i+" "+(i*i));
		System.out.print("\nPalindrome Numbers\n");
		for(i=1;i<=10000;i++)
		{
			int b=i*i;
			if(b==rever(b))
			System.out.println(b);
		}
	}
}