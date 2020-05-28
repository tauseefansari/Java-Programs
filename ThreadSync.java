class ThreadA extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+"\n");
	}
} 
class ThreadSync
{
	public static void main(String[] args) 
	{
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		t1.start();
		t2.start();
	}
}