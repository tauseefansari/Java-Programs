class Operators
{
	public static void main(String args[])
	{
		int a=500,b=10;
		System.out.println("\n\t\tArithmatic Operators");
		System.out.println("\nValue of A : "+a);
		System.out.println("\nValue of B : "+b);
		System.out.println("\nAddition : "+(a+b));
		System.out.println("\nSubtraction : "+(a-b));
		System.out.println("\nMultiplication : "+(a*b));
		System.out.println("\nDivision : "+(a/b));
		System.out.println("\nReminder : "+(a%b));
		a++;
		System.out.println("\nIncrement of A : "+a);
		b--;
		System.out.println("\nDecrement of B : "+b);
		
		System.out.println("\nEqual to Operater : "+(a=5));
		System.out.println("\nIncrement Equal-to Operater : "+(a+=5));
		System.out.println("\nDecrement Equal-to Operater : "+(a-=10));
		System.out.println("\nMultiplication Equal-to Operater : "+(a*=4));
		System.out.println("\nDivision Equal-to Operater : "+(a/=4));
		System.out.println("\nModulus Equal-to Operater : "+(a%=10));

		System.out.println("\n\t\tBitwise Operators");
		System.out.println("\nBitwise NOT : "+(~b));
		System.out.println("\nBitwise AND : "+(a&b));
		System.out.println("\nBitwise OR : "+(a|b));
		System.out.println("\nBitwise EX-OR : "+(a^b));
		System.out.println("\nBitwise RIGHT SHIFT : "+(a>>b));
		System.out.println("\nBitwise LEFT SHIFT : "+(a<<b));
		System.out.println("\nBitwise AND ASSIGNMENT : "+(a&=b));
		System.out.println("\nBitwise OR ASSIGNMENT : "+(a|=b));
		System.out.println("\nBitwise EX-OR ASSIGNMENT : "+(a^=b));
		System.out.println("\nBitwise LEFT SHIFT ASSIGNMENT : "+(a<<=b));
		System.out.println("\nBitwise RIGHT SHIFT ASSIGNMENT : "+(a>>=b));	
	
		System.out.println("\n\t\tRelational Operators");
		System.out.println("\nValue of A : "+a);
		System.out.println("\nValue of B : "+b);
		System.out.println("\nGreater-Than Operator : "+(a>b));
		System.out.println("\nLess-Than Operator : "+(a<b));
		System.out.println("\nGreater-Than Equal-to Operator : "+(a>=b));
		System.out.println("\nLess-Than Equal-to Operator : "+(a<=b));
		System.out.println("\nEqual-to Operator : "+(a==b));
		System.out.println("\nNot Equal-to Operator : "+(a!=b));
		
		System.out.println("\n\t\tBoolean Logical Operators");
		boolean x=true,y=false;
		int p=10,q=20,r;
		
		System.out.println("\nValue of X : "+x);
		System.out.println("\nValue of Y : "+y);
		System.out.println("\nBoolean Logical NOT : "+(!x));
		System.out.println("\nBoolean Logical AND : "+(x&y));
		System.out.println("\nBoolean Logical OR : "+(x|y));
		System.out.println("\nBoolean Logical EX-OR : "+(x^y));
		System.out.println("\nBoolean Logical AND ASSIGNMENT : "+(x&=y));
		System.out.println("\nBoolean Logical OR ASSIGNMENT : "+(x|=y));
		System.out.println("\nBoolean Logical EX-OR ASSIGNMENT : "+(x^=y));
		System.out.println("\nBoolean Logical Equal-to : "+(x==y));
		System.out.println("\nBoolean Logical Not Equal-to: "+(x!=y));
		System.out.println("\nBoolean Logical SHORT CIRCUIT AND : "+(x&&y));
		System.out.println("\nBoolean Logical SHORT CIRCUIT AND : "+(x^y));
		
		r=p<q?40:50;
		System.out.println("\nValue of P : "+p);
		System.out.println("\nValue of Q : "+q);
		System.out.println("\nIF (P<Q then R=40 else 50) TERNARY OPERATOR : "+r);
		
		r=p>q?40:50;
		System.out.println("\nIF (P>Q then R=40 else 50) TERNARY OPERATOR : "+r);
		
		
		
	}	
}