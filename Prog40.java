import java.util.*;
class Prog40
{
	public static void main(String args[])
	{
		Vector v = new Vector();
		Scanner sc = new Scanner(System.in);
		int opt;
		do
		{
			System.out.print("\n1:Insert \t2:Delete\t3:Display\t4:Exit");
			System.out.print("\n\nEnter Option : ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("Enter the Value : ");
					String a=sc.next();
					v.addElement(a);
					break;
				case 2:
					System.out.print("Enter the Value to be Delete : ");
					String x=sc.next();
					if(v.isEmpty())
						System.out.print("\nVector is Empty\n");
					else
					{
						if(v.contains(x))
							v.removeElement(x);
						else
							System.out.print(x+" is Not Found\n");
					}
					break;
				case 3:
					if(v.isEmpty())
						System.out.print("\nVector is Empty\n");
					else 
					{
						Enumeration e=v.elements();
						System.out.print("\nVector Elements : \n");
						while(e.hasMoreElements())
							System.out.println(e.nextElement());
					}
					break;
			}
		}
		while(opt!=4);
	}
}