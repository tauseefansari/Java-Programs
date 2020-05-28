import java.util.Scanner;
class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("*");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}
class Prog26
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