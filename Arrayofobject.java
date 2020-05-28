import java.util.*;
class Marks
{
	String name;
	int phy,mp,mat,pcm,chem;
	void readata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks for physics,chemistry,maths:");
		phy=sc.nextInt();
		chem=sc.nextInt();
		mat=sc.nextInt();
	
	}
	void display()
	{
		System.out.println("Name of eligible student:"+name);
	}
	int eligiblity()
	{
		pcm=phy+chem+mat;
		mp=mat+phy;
		if(mat>=60 && phy>=50 &&chem>=40 && pcm>=200 || (mp>=150))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
class Arrayofobject
	{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			int n;
			System.out.println("Enter no of student:");
			n=sc.nextInt();
			Marks m[] =new Marks[n];
			for(int i=0;i<n;i++)
			{
				m[i]=new Marks();
				m[i].readata();
			}
			for(int i=0;i<n;i++)
			{
				if(m[i].eligiblity()==1)
				{
					m[i].display();
				}
			}
			
			
		}
		
	}