class A
{
	A()
	{
		System.out.println("\nClass A");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("\nClass B");
	}
}
class C extends A
{
	C()
	{
		super();
		System.out.println("\nClass C");
	}
}
class Prog41
{
	public static void main(String[] args) 
	{
		B b = new B();
		C c = new C(); 
	}
}