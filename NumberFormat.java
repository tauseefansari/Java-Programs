class NumberFormat
{
	public static void main(String[] args) 
	{
		try
		{
			String str="abcd";
			System.out.println("Entered String is : "+str);
			int a=Integer.parseInt(str);
			System.out.println("Integer Value : "+a);
		}	
		catch(NumberFormatException nfe)
		{
			System.out.println("\nException : "+nfe);
		}
	}	
}