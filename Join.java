class Thread1 extends Thread
{
	public void run()
	{
		for(int i=2;i<10;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i+" is a Prime Number");	
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i+=2)
			System.out.println(i+" is Odd Number");
	}
	
}
class Join
{
	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		try
		{
			t1.join(); //wait for t1 end
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		t2.start();
	}
}