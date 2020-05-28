import java.util.*;
class Prog29
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>b)
			System.out.println(a+" is Greater");
		else if(b>a)
			System.out.println(b+" is Greater");	
		else
			System.out.print(a+" and "+b+" is Equal");
	}
}