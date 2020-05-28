import java.util.Scanner;
class Air
{
	float per_of_oxygen,per_of_nitrogen,humidity;
	
	Air(float a)
	{
		per_of_oxygen=a;
	}
	
	Air(float a,float b)
	{
		per_of_oxygen=a;
		per_of_nitrogen=b;
	}
	
	Air(float a,float b, float c)
	{
		per_of_oxygen=a;
		per_of_nitrogen=b;
		humidity=c;
	}
	
	public void display()
	{
		System.out.println("\nPercentage of Oxygen : "+per_of_oxygen+" %");
		System.out.println("\nPercentage of Nitrogen : "+per_of_nitrogen+" %");
		System.out.println("\nHumidity : "+humidity+" %");
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float x,y,z,p,q,r;
		System.out.print("\nEnter Percentage of Oxygen 1st : ");
		x=sc.nextFloat();
		System.out.print("\nEnter Percentage of Nitrogen of 1st : ");
		y=sc.nextFloat();
		System.out.print("\nEnter Humidity of 1St : ");
		z=sc.nextFloat();
		
		
		System.out.print("\nEnter Percentage of Oxygen 2nd: ");
		p=sc.nextFloat();
		System.out.print("\nEnter Percentage of Nitrogen of 2nd : ");
		q=sc.nextFloat();
		System.out.print("\nEnter Humidity of 2nd : ");
		r=sc.nextFloat();
		
		Air x1 = new Air(x,y,z);
		Air x2 = new Air(p,q,r);
		
		
		x1.display();
		x2.display();
		
		if(x1.humidity>x2.humidity)
			System.out.println("\nHumidity of 1st is Greater");
		else
			System.out.println("\nHumidity of 2nd is Greater");

	}
}