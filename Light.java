import java.util.Scanner;
class Light
{
	int siw,sia,siv;
	public void setSiw(int a)
	{
		siw=a;
	}
	
	public int getSiw()
	{
		return siw;
	}
	
	public void setSia(int b)
	{
		sia=b;
	}
	
	public int getSia()
	{
		return sia;
	}
	
	public void setSiv(int c)
	{
		siv=c;
	}
	
	public int getSiv()
	{
		return siv;
	}
	
	public static void main(String args[])
	{
		Light l=new Light();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter Light Speed in Water: ");
		l.setSiw(sc.nextInt());
		System.out.print("\nEnter Light Speed in Air: ");
		l.setSia(sc.nextInt());
		System.out.print("\nEnter Light Speed in Vaccum: ");
		l.setSiv(sc.nextInt());
		
		System.out.println("\nLight Speed in Water: "+l.getSiw()+" km/h");
		System.out.println("\nLight Speed in Air: "+l.getSia()+" km/h");
		System.out.println("\nLight Speed in Vaccum: "+l.getSiv()+" km/h");
		
		if(l.getSia()==l.getSiv())
			System.out.println("\nSpeed in Air and Vacuum are Same ");
		else
			System.out.println("\nSpeed in Air and Vacuum are Not Same ");
}
}
