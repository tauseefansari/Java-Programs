class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<10;i+=2)
			System.out.println(i+" is Odd");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=2;i<10;i+=2)
		{
			System.out.println(i+" is Even");
			Thread.yield();
		}
	}
}
class Yield
{
	public static void main(String[] args) 
	{
		Thread1 tt1 = new Thread1();
		Thread t1 = new Thread(tt1);
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();	
	}
}
