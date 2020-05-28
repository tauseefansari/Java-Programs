class ThreadA extends Thread
{
	public void run()
	{
		long st=System.nanoTime();
		System.out.println("\nPrime Numbers are : \n");
		for(int i=2;i<50;i++)
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
			{
				System.out.print(i+"\t");
			}
		}
		long exetime=System.nanoTime() - st;
		float second=(float)exetime/1000000000;
		System.out.println("\nThread A Execution Time : "+second+" Seconds");
	}
}
class ThreadB implements Runnable
{
	public void run()
	{
		long st1=System.nanoTime();
		int n1=1,n2=1,n3;
		System.out.println("\nFibbonacci Numbers are : \n");
		System.out.print(n1+"\t"+n2+"\t");
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
		}
		long exetime1=System.nanoTime() - st1;
		float second1=(float)exetime1/1000000000;
		System.out.println("\n\nThread B Execution Time : "+second1+" Seconds");
	}
}
class Prog46
{
	public static void main(String[] args) 
	{
		ThreadA t1 = new ThreadA();
		ThreadB tt2 = new ThreadB();
		Thread t2 = new Thread(tt2);
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}
}