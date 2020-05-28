class Prog14
{
	public static void main(String[] args) 
	{
		int array[] = new int[10];
		for(int i=0;i<10;i++)
			array[i]=i;
		System.out.println("\nDisplaying Array : ");
		for(int ar : array)
			System.out.println(ar);
	}
}