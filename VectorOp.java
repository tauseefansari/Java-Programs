import java.util.Vector;
import java.util.Scanner;
class VectorOp
{
	Vector<Integer> vec = new Vector<Integer>();
	
	public void add(int a)
	{
		vec.add(a);
	}
	
	public boolean empty()
	{
		return vec.isEmpty();
	}
	
	public void display()
	{
		for(Integer n : vec)
			System.out.println(n);
	}
	
	public int size()
	{
		return vec.size();
	}
	
	public int eleAt(int b)
	{
		return vec.elementAt(b);
	}
	
	public static void main(String args[])
	{
		VectorOp v = new VectorOp();
		
		Scanner sc = new Scanner(System.in);
		
		char opt;
		
		do
		{
		System.out.print("\n1 : Add Element in Vector");
		System.out.print("\n2 : Check Empty or Not");
		System.out.print("\n3 : Display Vector");
		System.out.print("\n4 : Display Current Size");
		System.out.print("\n5 : Find Element At N Position");
		System.out.print("\n6 : Exit");
		
		System.out.print("\nEnter Your Choice : ");
		int o=sc.nextInt();
		
		switch(o)
		{
			case 1:
			System.out.print("Enter Value : ");
			int x=sc.nextInt();
			v.add(x);
			break;
			
			case 2:
			System.out.print("Vector is Empty : "+v.empty());
			break;
			
			case 3:
			System.out.println("Vector Dispaly : ");
			v.display();
			break;
			
			case 4:
			System.out.print("Current Size : "+v.size());
			break;
			
			case 5:
			System.out.print("Enter Position : ");
			int y=sc.nextInt();
			System.out.print("Element Added at Position "+y+" : "+v.eleAt(y));
			break;
			
			case 6:
			System.exit(0);
			break;
		}
			System.out.println("\n\t\tY : Continue       N : Exit ");
			System.out.print("\t\tEnter Your Choice : ");
			opt=sc.next().charAt(0);
		}
		while(opt=='y' || opt=='Y');
	}
}