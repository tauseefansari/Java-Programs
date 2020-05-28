interface Triangle
{
	int base=10,height=20;
	public double area();
}
class Area implements Triangle
{
	public double area()
	{
		return 0.5*(base*height);
	}
}
class InterfaceEx
{
	public static void main(String[] args) 
	{
		Area a = new Area();
		System.out.println("\nBase : "+a.base);
		System.out.println("\nHeight : "+a.height);
		System.out.println("\nArea of Triangle : "+a.area());
	}
}